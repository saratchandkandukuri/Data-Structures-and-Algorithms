{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class MyQueue \{\
\
  class Node \{\
    private String value;\
    public Node next;\
\
    Node(String value) \{\
      this.value = value;\
      next = null;\
    \}\
  \}\
\
  private Node first;\
  private Node last;\
  private int length;\
  \
  MyQueue() \{\
    this.first = null;\
    this.last = null;\
    this.length = 0;\
  \}\
\
  public void enqueue(String value) \{\
    Node newNode = new Node(value);\
    \
    if(length == 0) \{\
      this.first = newNode;\
      this.last = newNode;\
    \} else \{\
      this.last.next = newNode;\
      this.last = newNode;\
    \}\
    length ++;\
  \} \
\
  public void dequeue() \{\
    if(length == 0) \{\
      return;\
    \}\
\
    System.out.println("The dequeued value is: " + this.first.value);  \
    this.first = this.first.next;\
    this.length--;\
  \}\
\
  public Node peek() \{\
    return this.first;\
  \}\
  \
\}}