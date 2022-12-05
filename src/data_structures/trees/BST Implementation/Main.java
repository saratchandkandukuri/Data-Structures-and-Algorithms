{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.ArrayList;\
\
class Main \{\
  public static void main(String[] args) \{\
    System.out.println("Hello world!");\
\
    MyBinarySearchTree myBST = new MyBinarySearchTree();\
\
    myBST.insert(9);\
    myBST.insert(4);\
    myBST.insert(6);\
    myBST.insert(20);\
    myBST.insert(170);\
    myBST.insert(15);\
    myBST.insert(1);\
    myBST.printTree(myBST.getRootNode(), "");\
    System.out.println("bfs: " + myBST.breadthFirstSearch());\
    ArrayList<MyBinarySearchTree.Node> queue = new ArrayList<>();\
    queue.add(myBST.getRootNode());\
    System.out.println("bfs recursive: " + myBST.breadthFirstSearchRecursive(queue, new ArrayList<>()));\
    System.out.println("dfs inOrder: " + myBST.DFSInOrder());\
    System.out.println("dfs preOrder: " + myBST.DFSPreOrder());\
    System.out.println("dfs postOrder: " + myBST.DFSPostOrder());\
\
    System.out.println(Boolean.toString(myBST.lookup(6)));\
\
    System.out.println(Boolean.toString(myBST.remove(6)));\
    myBST.printTree(myBST.getRootNode(), "");\
\
    System.out.println("bfs: " + myBST.breadthFirstSearch());\
\
    \
\
  \}\
\}}