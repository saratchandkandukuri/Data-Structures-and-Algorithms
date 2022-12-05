{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.Arrays;\
\
class Main \{\
  public static void main(String[] args) \{\
    int[] array = \{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0\};\
\
    System.out.println("The original array is: ");\
    for (int num : array) \{\
        System.out.print(num + " ");\
    \}\
    bubbleSort(array);\
    System.out.println("\\nThe sorted array after bubbleSort is: ");\
    for (int num : array) \{\
        System.out.print(num + " ");\
    \}\
  \}\
\
  static void bubbleSort(int[] inputArray) \{\
    for(int i=0; i<inputArray.length; i++) \{\
      for(int j=0; j<inputArray.length - 1; j++) \{\
        if(inputArray[j] > inputArray[j+1]) \{\
          int temp = inputArray[j];\
          inputArray[j] = inputArray[j+1];\
          inputArray[j+1] = temp;\
        \}\
     \}\
    \}\
  \} // Space Complexity O(n) Time - O(n to power 2)\
\}}