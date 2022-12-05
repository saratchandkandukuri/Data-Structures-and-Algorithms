{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.io.*;\
import java.util.ArrayList;\
\
class MyLinkedList \{\
  public int length;\
  public Node head;\
  private Node tail;\
\
  class Node \{\
    public int value;\
    public Node next;\
\
    Node(int value) \{\
      this.value = value;\
      this.next = null;\
    \}\
  \} \
\
  MyLinkedList(int value) \{\
    head = new Node(value);\
\
    tail = head;\
    length++;\
  \}\
\
  public void append(int value) \{\
    Node newNode = new Node(value);\
    \
    tail.next = newNode;\
    tail = newNode;\
    length ++;\
  \}\
\
  public void prepend(int value) \{\
    Node newNode = new Node(value);\
\
    newNode.next = head;\
    head = newNode;\
    length ++;\
  \}\
\
  public void insert(int index, int value) \{\
    if(index == 0) \{\
      prepend(value);\
      return;\
    \}\
\
    if(index >= length) \{\
      append(value);\
      return;\
    \}\
      \
    Node newNode = new Node(value);\
\
    Node previousNode = getNodeAt(index-1);\
    Node tempNode = previousNode.next;\
    previousNode.next = newNode;\
    newNode.next = tempNode;\
    length++;\
  \}\
\
  public void remove(int index) \{\
    if(index == 0) \{\
      Node tempNode = head.next;\
      head = tempNode;\
      length--;\
      return;\
    \}\
\
    if(index >=length) \{\
      // TODO - Only this case somehow still dosent work\
      Node nodeBeforeTail = getNodeAt(length - 1);\
      tail = nodeBeforeTail;\
      tail.next=null;\
      \
      length--;\
      return;\
    \}\
    \
    Node nodeToBeChanged = getNodeAt(index - 1);\
    Node nodeToBeDeleted = nodeToBeChanged.next;\
\
    nodeToBeChanged.next = nodeToBeDeleted.next;\
    length--;\
  \}\
\
  private Node getNodeAt(int index) \{\
    int i=0;\
    Node currentNode = this.head;\
    while(i != index) \{\
      currentNode = currentNode.next;\
      i++;\
    \}\
\
    return currentNode;\
  \}\
\
  public void reverse() \{\
    if (this.head.next == null) \{\
        return;\
      \}\
    \
      Node first = this.head;\
      Node tail = this.head;\
      Node second = first.next;\
  \
      while(second != null) \{\
        Node temp = second.next;\
        second.next = first;\
        first = second;\
        second = temp;\
        System.out.println();\
        printList();\
      \}\
  \
      this.head.next = null;\
      this.head = first;\
  \}\
\
  public void printList() \{\
    ArrayList<Integer> resultArray = new ArrayList<Integer>();\
    \
    Node currentNode = this.head;\
    while(currentNode != null) \{\
        resultArray.add(currentNode.value);\
        currentNode = currentNode.next;\
    \}\
\
    for(int i=0; i< resultArray.size(); i++) \{\
      System.out.print(resultArray.get(i) + " ");\
    \}\
  \}\
\}\
\
}