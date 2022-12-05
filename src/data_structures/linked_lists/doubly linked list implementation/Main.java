class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    MyDoubleLinkedList myLinkedList = new MyDoubleLinkedList(5);
    myLinkedList.append(10);
    myLinkedList.append(15);
    myLinkedList.prepend(20);
    myLinkedList.insert(2, 99);
    myLinkedList.insert(3, 99);
    myLinkedList.remove(2);

    myLinkedList.printList();
  }
}