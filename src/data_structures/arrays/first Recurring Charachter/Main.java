{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
import java.util.ArrayList;\
import java.util.HashMap;\
\
class Main \{\
  public static void main(String[] args) \{\
    int inputArray[] = \{2, 5, 5, 2, 3, 5, 1, 2, 4\};\
    \
    int recurringChar = findFirstRecurringChar(inputArray);\
    System.out.println("The first recurring character is: " + Integer.toString(recurringChar));\
  \}\
\
  static int findFirstRecurringChar(int[] array) \{\
    ArrayList<Integer> temp = new ArrayList<Integer>();\
    \
    temp.add(array[0]);\
    int i=1;\
    while(i<array.length) \{\
      if(temp.contains(array[i])) \{\
        return array[i];\
      \} else \{\
        temp.add(array[i++]);\
      \}\
    \}\
\
    return -1;\
  \}\
\
  static int findFirstRecurringCharWithHashTables(int[] array) \{\
    Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();\
\
    int i=0;\
    while(i < array.length) \{\
      if(tempMap.keySet().contains(array[i])) \{\
        return array[i];\
      \} else \{\
        tempMap.put(array[i++], i);\
      \}\
    \}\
    \
    return -1;\
  \}\
\}}