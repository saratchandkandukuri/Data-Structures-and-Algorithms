class MyQueue {

  class Node {
    private String value;
    public Node next;

    Node(String value) {
      this.value = value;
      next = null;
    }
  }

  private Node first;
  private Node last;
  private int length;
  
  MyQueue() {
    this.first = null;
    this.last = null;
    this.length = 0;
  }

  public void enqueue(String value) {
    Node newNode = new Node(value);
    
    if(length == 0) {
      this.first = newNode;
      this.last = newNode;
    } else {
      this.last.next = newNode;
      this.last = newNode;
    }
    length ++;
  } 

  public void dequeue() {
    if(length == 0) {
      return;
    }

    System.out.println("The dequeued value is: " + this.first.value);  
    this.first = this.first.next;
    this.length--;
  }

  public Node peek() {
    return this.first;
  }
  
}