{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
\
class MyArray \{\
\
  private int length;\
  private int array[];\
  private int capacity = 1;\
\
  MyArray() \{\
    length = 0;\
    array = new int[1];\
  \}\
\
  public void push(int item) \{\
    if (length == capacity)\
      doubleArraySize();\
\
    // Inserting item\
    array[length] = item;\
    length++;\
  \}\
\
  private void doubleArraySize() \{\
    // Since the new item has no place in the current, we double the size of array\
    int temp[] = new int[2 * capacity];\
    for (int i = 0; i < array.length; i++)\
      temp[i] = array[i];\
\
    capacity *= 2;\
    array = temp;\
  \}\
\
  public void push(int index, int item) \{\
    if (length == capacity)\
      doubleArraySize();\
\
    // Shift items before inserting\
    for (int i = length; i > index; i--) \{\
      array[i] = array[i - 1];\
    \}\
    array[index] = item;\
    length++;\
  \}\
\
  public int get(int index) \{\
    if (index < length)\
      return array[index];\
\
    return -1;\
  \}\
\
  public void pop() \{\
    // array[length-1];\
    // Not sure how this works\
    length--;\
  \}\
\
  public void delete(int index) \{\
    // We have to shift every item from index\
    for (int i = index; i < length - 1; i++) \{\
      array[i] = array[i + 1];\
    \}\
    // Now we have to delete the last item.\
    // Not sure how this works.\
    // By decreasing the length, the last item is deleted.\
    length--;\
  \}\
\
  public void print() \{\
    System.out.println("The capacity of the array is: " + capacity);\
    System.out.println("The length of array is: " + length);\
    System.out.println("The values in array are: ");\
    \
    int i = 0;\
    String values = "";\
    values = values + "[";\
    while (i < length) \{\
      values = values + Integer.toString(array[i]) + ",";\
      i++;\
    \}\
    values = values.substring(0, values.length() -1) + "]";\
    System.out.println(values + "\\n");\
  \}\
\}}