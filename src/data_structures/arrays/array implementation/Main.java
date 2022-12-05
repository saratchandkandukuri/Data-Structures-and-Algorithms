class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
  
      MyArray myArray = new MyArray();
      myArray.push(3);
      myArray.push(2);
      myArray.push(21);
      myArray.push(22);
      myArray.push(24);
      myArray.print();
  
      myArray.push(5, 2000);
      System.out.println("The array after pushing at index 5 is: ");
      myArray.print();
  
      myArray.push(67);
      myArray.push(76);
      myArray.print();
      myArray.push(2, 3000);
      myArray.print();
  
      myArray.delete(2);
      System.out.println("The array after delete at index 2 is: ");
      myArray.print();
  
      myArray.pop();
      System.out.println("The array after pop is: ");
      myArray.print();
  
      myArray.push(345);
      System.out.println("The new array after final push is: ");
      myArray.print();
    }
  }