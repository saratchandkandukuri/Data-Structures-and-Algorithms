import java.util.HashMap;

public class Main {
  static HashMap<Integer, Integer> cache = new HashMap<>();;
  static int operationsCount = 0;
  
  public int fibonacciMaster(int index) {
    if(cache.containsKey(index)) {
      return cache.get(index);
    } else {
      if(index < 2) {
        return 1;
      }
      else {
        operationsCount++;
        cache.put(index, fibonacciMaster(index - 1) + fibonacciMaster(index - 2));
        return cache.get(index);
      }
    }
  }

  public static void main(String[] args) {
      Main fibonacci = new Main();
      System.out.println(fibonacci.fibonacciMaster(30));
      System.out.println(operationsCount);
  }
}