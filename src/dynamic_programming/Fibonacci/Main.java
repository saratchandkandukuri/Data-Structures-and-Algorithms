{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.HashMap;\
\
public class Main \{\
  static HashMap<Integer, Integer> cache = new HashMap<>();;\
  static int operationsCount = 0;\
  \
  public int fibonacciMaster(int index) \{\
    if(cache.containsKey(index)) \{\
      return cache.get(index);\
    \} else \{\
      if(index < 2) \{\
        return 1;\
      \}\
      else \{\
        operationsCount++;\
        cache.put(index, fibonacciMaster(index - 1) + fibonacciMaster(index - 2));\
        return cache.get(index);\
      \}\
    \}\
  \}\
\
  public static void main(String[] args) \{\
      Main fibonacci = new Main();\
      System.out.println(fibonacci.fibonacciMaster(30));\
      System.out.println(operationsCount);\
  \}\
\}}