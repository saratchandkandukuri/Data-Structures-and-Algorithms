{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 class Main \{\
  public static void main(String[] args) \{\
    System.out.println("Hello world!");\
\
    MyArray myArray = new MyArray();\
    myArray.push(3);\
    myArray.push(2);\
    myArray.push(21);\
    myArray.push(22);\
    myArray.push(24);\
    myArray.print();\
\
    myArray.push(5, 2000);\
    System.out.println("The array after pushing at index 5 is: ");\
    myArray.print();\
\
    myArray.push(67);\
    myArray.push(76);\
    myArray.print();\
    myArray.push(2, 3000);\
    myArray.print();\
\
    myArray.delete(2);\
    System.out.println("The array after delete at index 2 is: ");\
    myArray.print();\
\
    myArray.pop();\
    System.out.println("The array after pop is: ");\
    myArray.print();\
\
    myArray.push(345);\
    System.out.println("The new array after final push is: ");\
    myArray.print();\
  \}\
\}}