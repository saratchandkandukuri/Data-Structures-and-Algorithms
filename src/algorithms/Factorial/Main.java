class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    System.out.println("The factorial of a number is: ");
    System.out.println(findFactorialRecursive(5));
    System.out.println(findFactorialIterative(5));
  }

   static int findFactorialRecursive(int number) {
     if(number == 1) {
       return 1;
     } else {
       return number * findFactorialRecursive(number - 1);
     }
  } // O(n) - Time Complexity

  static int findFactorialIterative(int number) {
    int factorial = 1;
    while(number >= 1) {
      factorial = factorial * number;
      number--;
    }
    return factorial;
  } // O(n) - Time Complexity