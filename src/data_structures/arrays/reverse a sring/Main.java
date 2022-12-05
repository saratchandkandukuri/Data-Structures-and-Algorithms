import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a string that is to be reversed");
    String inputString = sc.nextLine(); // Reads input

    System.out.println("Entered string is:\n " + inputString);
    String reversedString = "";

    int i =inputString.length() - 1;
    while (i >= 0) {
      reversedString = reversedString + inputString.charAt(i);
      i--;
    }

    System.out.println("Output string is:\n " + reversedString);
  }
}