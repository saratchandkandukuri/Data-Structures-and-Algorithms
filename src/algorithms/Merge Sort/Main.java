import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0));

    System.out.println(mergeSort(numbers));
    
  }

  static List<Integer> mergeSort(List<Integer> array) {
    if(array.size() == 1)
      return array;

    // Split array into left and right
    List<Integer> left = array.subList(0, array.size() / 2);
    List<Integer> right = array.subList(array.size() / 2, array.size());

    return merge(mergeSort(left), mergeSort(right));
  }

  static List<Integer> merge(List<Integer> left, List<Integer> right) {
    List<Integer> result = new ArrayList<Integer>();

    int leftIndex = 0;
    int rightIndex = 0;

    while (leftIndex < left.size() && rightIndex < right.size()) {
        if (left.get(leftIndex) < right.get(rightIndex)) {
            result.add(left.get(leftIndex));
            leftIndex++;
        } else {
            result.add(right.get(rightIndex));
            rightIndex++;
        }
    }
    List<Integer> leftRemaining = left.subList(leftIndex, left.size());
    List<Integer> rightRemaining = right.subList(rightIndex, right.size());

    result.addAll(leftRemaining);
    result.addAll(rightRemaining);
    
    return result;
  }
}