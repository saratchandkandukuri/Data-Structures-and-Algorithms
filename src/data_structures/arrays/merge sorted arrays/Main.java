import java.util.*;

class Main {
  public static void main(String[] args) {
    // Let us assume two sorted arrays
    int array1[] = { 0, 3, 4, 31 };
    int array2[] = { 4, 6, 30, 43 };

    int resultArray[] = new int[array1.length + array2.length];

    int k = 0;
    int i = 0;
    int j = 0;

    while (i < array1.length && j < array2.length) {
      if (array1[i] < array2[j]) {
        resultArray[k++] = array1[i++];
      } else {
        resultArray[k++] = array2[j++];
      }
    }

    while (i < array1.length) {
      resultArray[k++] = array1[i++];
    }

    while (j < array2.length) {
      resultArray[k++] = array2[j++];
    }

    /*for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array1[i] <= array2[j]) {
          resultArray[k] = array1[i];
          k++;
          if (j == array2.length - 1) {
            resultArray[k] = array2[j];
          }
          break;
        } else {
          resultArray[k] = array2[j];
          k++;
          if (j == array2.length - 1) {
            resultArray[k] = array1[i];
          }
        }
      }
    } */

    System.out.println("The merged array is: ");
    for (int l = 0; l < resultArray.length; l++) {
      System.out.print(resultArray[l] + " ");
    }
  }
}