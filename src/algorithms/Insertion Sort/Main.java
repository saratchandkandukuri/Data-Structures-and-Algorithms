import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));

    System.out.println("The original array is: ");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
    insertionSort(numbers);
    System.out.println("\nThe sorted array after insertionSort is: ");
    for (int num : numbers) {
      System.out.print(num + " ");
    }
  }

  static ArrayList<Integer> insertionSort(ArrayList<Integer> array) {
    for (int i = 0; i < array.size(); i++) {
      // if number less than 1st number. then move it at start of array.
      if (array.get(i) <= array.get(0)) {
        array.add(0, array.remove(i));
      } else {
        // else check where should the number be placed and move it.
        if (array.get(i) < array.get(i - 1)) {
          for (int j = 1; j < i; j++) {
            if (array.get(i) < array.get(j)) {
              array.add(j, array.remove(i));
              // end inner loop after element moved.
              break;
            }
          }
        }
      }

    }
    return array;
  }
}