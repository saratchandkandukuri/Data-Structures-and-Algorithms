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
    Scanner sc = new Scanner(System.in);\
    System.out.println("Please enter a string that is to be reversed");\
    String inputString = sc.nextLine(); // Reads input\
\
    System.out.println("Entered string is:\\n " + inputString);\
    String reversedString = "";\
\
    int i =inputString.length() - 1;\
    while (i >= 0) \{\
      reversedString = reversedString + inputString.charAt(i);\
      i--;\
    \}\
\
    System.out.println("Output string is:\\n " + reversedString);\
  \}\
\}}