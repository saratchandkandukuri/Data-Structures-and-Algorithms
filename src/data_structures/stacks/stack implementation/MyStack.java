{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class MyStack \{\
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
  private Node top;\
  private Node bottom;\
  public int length;\
\
  MyStack() \{\
    this.top = null;\
    this.bottom = null;\
    this.length = 0;\
  \}\
\
  public void push(String value) \{\
    Node newNode = new Node(value);\
\
    if(length == 0) \{\
      this.bottom = newNode;\
      this.top = this.bottom;\
    \} else \{\
      newNode.next = this.top;\
      this.top = newNode;\
    \}\
    length++;\
  \}\
  \
  public void pop() \{\
    if(length == 0) \{\
      this.bottom = null;\
      return;\
    \}\
    \
    String topValue = this.top.value;\
    this.top = this.top.next;\
    length--;\
    System.out.println("The popped value is: " + topValue);    \
  \}\
\
  public Node peek() \{\
    return this.top;\
  \}\
\
  public boolean isEmpty() \{\
    return (this.length > 0);\
  \}\
\}}