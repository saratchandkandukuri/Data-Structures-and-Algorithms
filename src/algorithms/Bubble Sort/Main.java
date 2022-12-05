import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

    System.out.println("The original array is: ");
    for (int num : array) {
        System.out.print(num + " ");
    }
    bubbleSort(array);
    System.out.println("\nThe sorted array after bubbleSort is: ");
    for (int num : array) {
        System.out.print(num + " ");
    }
  }

  static void bubbleSort(int[] inputArray) {
    for(int i=0; i<inputArray.length; i++) {
      for(int j=0; j<inputArray.length - 1; j++) {
        if(inputArray[j] > inputArray[j+1]) {
          int temp = inputArray[j];
          inputArray[j] = inputArray[j+1];
          inputArray[j+1] = temp;
        }
     }
    }
  } // Space Complexity O(n) Time - O(n to power 2)
}