class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    MyStack myStack = new MyStack();
    myStack.push("Goggle");
    myStack.push("Udemy");
    myStack.push("Youtube");

    myStack.pop();
    myStack.pop();
    myStack.pop();
  }
}