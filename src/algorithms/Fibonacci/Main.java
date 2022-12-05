// Given a number N return the index value of the Fibonacci sequence, where the sequence is:

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 → 2+3

//For example: fibonacciRecursive(6) should return 8

import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    System.out.println(fibonacciRecursive(11));
    System.out.println(fibonacciIterative(11));
  }

  static int fibonacciIterative(int index) {
    ArrayList<Integer> array = new ArrayList<Integer>();
    array.add(0);
    array.add(1);

    for(int i=2; i <= index; i++) {
      array.add(array.get(i-1) + array.get(i-2));
    }

    return array.get(index);
  } // O(n)
  
  static int fibonacciRecursive(int index) {
    if(index==0)
      return 0;
    else if(index <=2) 
      return 1;

    return (fibonacciRecursive(index-1) + fibonacciRecursive(index-2));
  } // O(2^n) - Exponential very bad
}