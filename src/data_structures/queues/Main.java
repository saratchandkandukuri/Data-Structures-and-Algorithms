class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    MyQueue myQueue = new MyQueue();
    myQueue.enqueue("Goggle");
    myQueue.enqueue("Udemy");
    myQueue.enqueue("Youtube");

    myQueue.dequeue();
    myQueue.dequeue();
    myQueue.dequeue();
  }
}