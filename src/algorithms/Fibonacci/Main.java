{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;\f1\fnil\fcharset0 LucidaGrande;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 // Given a number N return the index value of the Fibonacci sequence, where the sequence is:\
\
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...\
// the pattern of the sequence is that each value is the sum of the 2 previous values, that means that for N=5 
\f1 \uc0\u8594 
\f0  2+3\
\
//For example: fibonacciRecursive(6) should return 8\
\
import java.util.ArrayList;\
\
class Main \{\
  public static void main(String[] args) \{\
    System.out.println("Hello world!");\
\
    System.out.println(fibonacciRecursive(11));\
    System.out.println(fibonacciIterative(11));\
  \}\
\
  static int fibonacciIterative(int index) \{\
    ArrayList<Integer> array = new ArrayList<Integer>();\
    array.add(0);\
    array.add(1);\
\
    for(int i=2; i <= index; i++) \{\
      array.add(array.get(i-1) + array.get(i-2));\
    \}\
\
    return array.get(index);\
  \} // O(n)\
  \
  static int fibonacciRecursive(int index) \{\
    if(index==0)\
      return 0;\
    else if(index <=2) \
      return 1;\
\
    return (fibonacciRecursive(index-1) + fibonacciRecursive(index-2));\
  \} // O(2^n) - Exponential very bad\
\}}