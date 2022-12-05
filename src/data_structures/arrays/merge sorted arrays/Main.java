{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
\
class Main \{\
  public static void main(String[] args) \{\
    // Let us assume two sorted arrays\
    int array1[] = \{ 0, 3, 4, 31 \};\
    int array2[] = \{ 4, 6, 30, 43 \};\
\
    int resultArray[] = new int[array1.length + array2.length];\
\
    int k = 0;\
    int i = 0;\
    int j = 0;\
\
    while (i < array1.length && j < array2.length) \{\
      if (array1[i] < array2[j]) \{\
        resultArray[k++] = array1[i++];\
      \} else \{\
        resultArray[k++] = array2[j++];\
      \}\
    \}\
\
    while (i < array1.length) \{\
      resultArray[k++] = array1[i++];\
    \}\
\
    while (j < array2.length) \{\
      resultArray[k++] = array2[j++];\
    \}\
\
    /*for (int i = 0; i < array1.length; i++) \{\
      for (int j = 0; j < array2.length; j++) \{\
        if (array1[i] <= array2[j]) \{\
          resultArray[k] = array1[i];\
          k++;\
          if (j == array2.length - 1) \{\
            resultArray[k] = array2[j];\
          \}\
          break;\
        \} else \{\
          resultArray[k] = array2[j];\
          k++;\
          if (j == array2.length - 1) \{\
            resultArray[k] = array1[i];\
          \}\
        \}\
      \}\
    \} */\
\
    System.out.println("The merged array is: ");\
    for (int l = 0; l < resultArray.length; l++) \{\
      System.out.print(resultArray[l] + " ");\
    \}\
  \}\
\}}