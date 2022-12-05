{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.ArrayList;\
\
class MyBinarySearchTree \{\
\
  public class Node \{\
    private int value;\
    public Node left;\
    public Node right;\
\
    Node(int value) \{\
      this.value = value;\
      this.left = null;\
      this.right = null;\
    \}\
  \}\
\
  public Node rootNode;\
\
  public Node getRootNode() \{\
    return this.rootNode;\
  \}\
\
  MyBinarySearchTree() \{\
    this.rootNode = null;\
  \}\
\
  void insert(int value) \{\
    Node newNode = new Node(value);\
\
    if (this.rootNode == null) \{\
      this.rootNode = newNode;\
      return;\
    \}\
\
    Node nodeToBeTraversed = rootNode;\
    Node holdingNode = rootNode;\
\
    while (nodeToBeTraversed != null) \{\
      if (newNode.value > nodeToBeTraversed.value) \{\
        nodeToBeTraversed = nodeToBeTraversed.right;\
      \} else \{\
        nodeToBeTraversed = nodeToBeTraversed.left;\
      \}\
\
      if (nodeToBeTraversed != null)\
        holdingNode = nodeToBeTraversed;\
    \}\
\
    if (newNode.value > holdingNode.value)\
      holdingNode.right = newNode;\
    else\
      holdingNode.left = newNode;\
  \}\
\
  public boolean lookup(int value) \{\
    if (this.rootNode == null) \{\
      return false;\
    \}\
\
    Node currentNode = this.rootNode;\
    while (currentNode != null) \{\
      if (value < currentNode.value) \{\
        currentNode = currentNode.left;\
      \} else if (value > currentNode.value) \{\
        currentNode = currentNode.right;\
      \} else \{ // means it is equal\
        return true;\
      \}\
    \}\
\
    return false;\
  \}\
\
  public boolean remove(int value) \{\
    if (this.rootNode == null) \{\
      return false;\
    \}\
\
    Node currentNode = this.rootNode;\
    Node parentNode = null;\
    while (currentNode != null) \{\
      if (value < currentNode.value) \{\
        parentNode = currentNode;\
        currentNode = currentNode.left;\
      \} else if (value > currentNode.value) \{\
        parentNode = currentNode;\
        currentNode = currentNode.right;\
      \} else if (currentNode.value == value) \{\
        // We have a match, get to work!\
\
        // Option 1: No right child:\
        if (currentNode.right == null) \{\
          if (parentNode == null) \{\
            this.rootNode = currentNode.left;\
          \} else \{\
            // if parent > current value, make current left child a child of parent\
            if (currentNode.value < parentNode.value) \{\
              parentNode.left = currentNode.left;\
\
              // if parent < current value, make left child a right child of parent\
            \} else if (currentNode.value > parentNode.value) \{\
              parentNode.right = currentNode.left;\
            \}\
          \}\
\
          // Option 2: Right child which doesnt have a left child\
        \} else if (currentNode.right.left == null) \{\
          currentNode.right.left = currentNode.left;\
          if (parentNode == null) \{\
            this.rootNode = currentNode.right;\
          \} else \{\
            // if parent > current, make right child of the left the parent\
            if (currentNode.value < parentNode.value) \{\
              parentNode.left = currentNode.right;\
\
              // if parent < current, make right child a right child of the parent\
            \} else if (currentNode.value > parentNode.value) \{\
              parentNode.right = currentNode.right;\
            \}\
          \}\
\
          // Option 3: Right child that has a left child\
        \} else \{\
\
          // find the Right child's left most child\
          Node leftmost = currentNode.right.left;\
          Node leftmostParent = currentNode.right;\
          while (leftmost.left != null) \{\
            leftmostParent = leftmost;\
            leftmost = leftmost.left;\
          \}\
\
          // Parent's left subtree is now leftmost's right subtree\
          leftmostParent.left = leftmost.right;\
          leftmost.left = currentNode.left;\
          leftmost.right = currentNode.right;\
\
          if (parentNode == null) \{\
            this.rootNode = leftmost;\
          \} else \{\
            if (currentNode.value < parentNode.value) \{\
              parentNode.left = leftmost;\
            \} else if (currentNode.value > parentNode.value) \{\
              parentNode.right = leftmost;\
            \}\
          \}\
        \}\
        return true;\
      \}\
    \}\
\
    return false;\
  \}\
\
  public ArrayList<Integer> breadthFirstSearch() \{\
    Node currentNode = this.rootNode;\
    ArrayList<Integer> resultArray = new ArrayList<>();\
    ArrayList<Node> queue = new ArrayList<>();\
    queue.add(currentNode);\
\
    while (queue.size() > 0) \{\
      currentNode = queue.remove(0);\
      resultArray.add(currentNode.value);\
\
      if (currentNode.left != null) \{\
        queue.add(currentNode.left);\
      \}\
      if (currentNode.right != null) \{\
        queue.add(currentNode.right);\
      \}\
    \}\
    return resultArray;\
  \}\
\
  public ArrayList<Integer> breadthFirstSearchRecursive(\
      ArrayList<Node> queue,\
      ArrayList<Integer> resultArray) \{\
    if (queue.size() == 0) \{\
      return resultArray;\
    \}\
\
    Node currentNode = queue.remove(0);\
    resultArray.add(currentNode.value);\
    if (currentNode.left != null) \{\
      queue.add(currentNode.left);\
    \}\
    if (currentNode.right != null) \{\
      queue.add(currentNode.right);\
    \}\
\
    return breadthFirstSearchRecursive(queue, resultArray);\
  \}\
\
  public ArrayList<Integer> DFSInOrder() \{\
    ArrayList<Integer> answer = new ArrayList<>();\
    return traverseInOrder(this.rootNode, answer);\
  \}\
\
  public ArrayList<Integer> DFSPreOrder() \{\
    ArrayList<Integer> answer = new ArrayList<>();\
    return traversePreOrder(this.rootNode, answer);\
  \}\
\
  public ArrayList<Integer> DFSPostOrder() \{\
    ArrayList<Integer> answer = new ArrayList<>();\
    return traversePostOrder(this.rootNode, answer);\
  \}\
\
  public ArrayList<Integer> traverseInOrder(Node node, ArrayList<Integer> array) \{\
    if (node.left != null) \{\
      traverseInOrder(node.left, array);\
    \}\
    array.add(node.value);\
    if (node.right != null) \{\
      traverseInOrder(node.right, array);\
    \}\
    return array;\
  \}\
\
  // traverse pre order\
  public ArrayList<Integer> traversePreOrder(Node node, ArrayList<Integer> array) \{\
    array.add(node.value);\
    if (node.left != null) \{\
      traversePreOrder(node.left, array);\
    \}\
    if (node.right != null) \{\
      traversePreOrder(node.right, array);\
    \}\
    return array;\
  \}\
\
  // traverse post order\
  public ArrayList<Integer> traversePostOrder(Node node, ArrayList<Integer> array) \{\
    if (node.left != null) \{\
      traversePostOrder(node.left, array);\
    \}\
    if (node.right != null) \{\
      traversePostOrder(node.right, array);\
    \}\
    array.add(node.value);\
    return array;\
  \}\
\
  public void printTree(Node node, String prefix) \{\
    if (node == null)\
      return;\
\
    System.out.println(prefix + " + " + node.value);\
    printTree(node.left, prefix + " ");\
    printTree(node.right, prefix + " ");\
  \}\
\}\
}