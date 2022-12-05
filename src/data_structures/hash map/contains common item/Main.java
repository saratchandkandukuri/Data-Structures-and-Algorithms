import java.util.HashMap;

class Main {
  public static void main(String[] args) {

    char array1[] = {'a', 'b', 'c', 'x'};
    char array2[] = {'z', 'y', 'a'};

    boolean contains = containsCommonItemWithHashMap(array1, array2);
    
    System.out.println("Contains common item: " + Boolean.toString(contains));
  }

  static boolean containsCommonItem(char[] arr1, char[] arr2) {
    for(int i =0; i< arr1.length; i++) {
      for(int j=0; j< arr2.length; j++) {
        if(arr1[i] == arr2[j]) {
          return true;
        }
      }
    }
    return false;
  } // O(a*b) - Time Complexity and O(1) - Space Complexity

  static boolean containsCommonItemWithHashMap(char[] arr1, char[] arr2) {
    HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>();
    
    for(int i=0; i< arr1.length; i++) {
      tempMap.put(arr1[i], i);
    }

    for(int j=0; j< arr2.length; j++) {
      if(tempMap.keySet().contains(arr2[j])) {
        return true;
      } 
    }

    return false;
  } // O(a+b) - Time Complexity and O(a) - Space Complexity
  
}