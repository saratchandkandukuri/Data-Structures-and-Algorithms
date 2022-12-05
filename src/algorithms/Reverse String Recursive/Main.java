import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a string that is to be reversed");
    String inputString = sc.nextLine(); // Reads input

    System.out.println("Entered string is:\n " + inputString);
    System.out.println("Output string with recursive is:\n " + reverseStringRecursive(inputString));
    System.out.println("Output string with iterative is:\n " + reverseStringIterative(inputString));

  }

  static String reverseStringRecursive(String string) {
    if(string.length() == 1) 
      return string;
    
    return string.charAt(string.length() -1) + reverseStringRecursive(string.substring(0, string.length() - 1));
  }

  static String reverseStringIterative(String inputString) {
    String reversedString = "";
    int i =inputString.length() - 1;
    while (i >= 0) {
      reversedString = reversedString + inputString.charAt(i);
      i--;
    }
    return reversedString;
  }
}