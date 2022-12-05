class Main {
  public static void main(String[] args) {
    int[] numbers = {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0};

    quickSort(numbers, 0, numbers.length - 1);

    for (int value : numbers) 
      System.out.print(value + " ");
        
    System.out.println();
  }

  static void quickSort(int[] array, int firstIndex, int lastIndex) {
    if(firstIndex < lastIndex) {
      int pIndex = partition(array, firstIndex, lastIndex);

      quickSort(array, firstIndex, pIndex - 1);
      quickSort(array, pIndex + 1, lastIndex);
    }
  }

  static int partition(int[] array, int firstIndex, int lastIndex) {
    int pivot = array[lastIndex];
    int i = firstIndex - 1;

    for(int j=firstIndex; j < lastIndex; j++) {
      if(array[j] <= pivot) {
        i++;

        // Swap 
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    int temp = array[i+1];
    array[i+1] = array[lastIndex];
    array[lastIndex] = temp;

    return i + 1;
  }
}