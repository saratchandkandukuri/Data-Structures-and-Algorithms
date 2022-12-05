{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.HashMap;\
\
class Main \{\
  public static void main(String[] args) \{\
\
    char array1[] = \{'a', 'b', 'c', 'x'\};\
    char array2[] = \{'z', 'y', 'a'\};\
\
    boolean contains = containsCommonItemWithHashMap(array1, array2);\
    \
    System.out.println("Contains common item: " + Boolean.toString(contains));\
  \}\
\
  static boolean containsCommonItem(char[] arr1, char[] arr2) \{\
    for(int i =0; i< arr1.length; i++) \{\
      for(int j=0; j< arr2.length; j++) \{\
        if(arr1[i] == arr2[j]) \{\
          return true;\
        \}\
      \}\
    \}\
    return false;\
  \} // O(a*b) - Time Complexity and O(1) - Space Complexity\
\
  static boolean containsCommonItemWithHashMap(char[] arr1, char[] arr2) \{\
    HashMap<Character, Integer> tempMap = new HashMap<Character, Integer>();\
    \
    for(int i=0; i< arr1.length; i++) \{\
      tempMap.put(arr1[i], i);\
    \}\
\
    for(int j=0; j< arr2.length; j++) \{\
      if(tempMap.keySet().contains(arr2[j])) \{\
        return true;\
      \} \
    \}\
\
    return false;\
  \} // O(a+b) - Time Complexity and O(a) - Space Complexity\
  \
\}}