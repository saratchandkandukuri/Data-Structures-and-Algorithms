import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    MyBinarySearchTree myBST = new MyBinarySearchTree();

    myBST.insert(9);
    myBST.insert(4);
    myBST.insert(6);
    myBST.insert(20);
    myBST.insert(170);
    myBST.insert(15);
    myBST.insert(1);
    myBST.printTree(myBST.getRootNode(), "");
    System.out.println("bfs: " + myBST.breadthFirstSearch());
    ArrayList<MyBinarySearchTree.Node> queue = new ArrayList<>();
    queue.add(myBST.getRootNode());
    System.out.println("bfs recursive: " + myBST.breadthFirstSearchRecursive(queue, new ArrayList<>()));
    System.out.println("dfs inOrder: " + myBST.DFSInOrder());
    System.out.println("dfs preOrder: " + myBST.DFSPreOrder());
    System.out.println("dfs postOrder: " + myBST.DFSPostOrder());

    System.out.println(Boolean.toString(myBST.lookup(6)));

    System.out.println(Boolean.toString(myBST.remove(6)));
    myBST.printTree(myBST.getRootNode(), "");

    System.out.println("bfs: " + myBST.breadthFirstSearch());

    

  }
}