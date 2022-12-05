class MyStack {

  class Node {
    private String value;
    public Node next;

    Node(String value) {
      this.value = value;
      next = null;
    }
  }

  private Node top;
  private Node bottom;
  public int length;

  MyStack() {
    this.top = null;
    this.bottom = null;
    this.length = 0;
  }

  public void push(String value) {
    Node newNode = new Node(value);

    if(length == 0) {
      this.bottom = newNode;
      this.top = this.bottom;
    } else {
      newNode.next = this.top;
      this.top = newNode;
    }
    length++;
  }
  
  public void pop() {
    if(length == 0) {
      this.bottom = null;
      return;
    }
    
    String topValue = this.top.value;
    this.top = this.top.next;
    length--;
    System.out.println("The popped value is: " + topValue);    
  }

  public Node peek() {
    return this.top;
  }

  public boolean isEmpty() {
    return (this.length > 0);
  }
}