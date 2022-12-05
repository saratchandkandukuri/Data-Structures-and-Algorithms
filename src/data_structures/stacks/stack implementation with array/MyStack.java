import java.util.ArrayList;

class MyStack {
  private ArrayList<String> stack;

  MyStack() {
    stack = new ArrayList<>();
  }

  public void push(String value) {
    stack.add(value);
  }

  public void pop() {
    System.out.println("The popped value is: " + stack.get(stack.size() -1));    
    stack.remove(stack.size() - 1);
  }

  public String peep() {
    return stack.get(0);
  }
}