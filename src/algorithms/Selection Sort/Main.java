import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    int[] array = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

    System.out.println("The original array is: ");
    for (int num : array) {
        System.out.print(num + " ");
    }
    selectionSort(array);
    System.out.println("\nThe sorted array after selectionSort is: ");
    for (int num : array) {
        System.out.print(num + " ");
    }
  }

  static void selectionSort(int[] inputArray) {
    for(int i=0; i<inputArray.length; i++) {
      int leastIndex = i;
      for(int j=i; j<inputArray.length; j++) {
        if(inputArray[j] < inputArray[leastIndex]) {
          leastIndex = j;
        } 
     }
      // Swap
      int temp = inputArray[i];
      inputArray[i] = inputArray[leastIndex];
      inputArray[leastIndex] = temp;
    }
  } // Space Complexity O(n) Time - O(n to power 2)
}