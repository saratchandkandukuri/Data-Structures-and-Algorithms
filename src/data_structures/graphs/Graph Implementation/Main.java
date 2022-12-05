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
    MyGraph myGraph = new MyGraph();\
\
    myGraph.addVertex(0);\
    myGraph.addVertex(1);\
    myGraph.addVertex(2);\
    myGraph.addVertex(3);\
    myGraph.addVertex(4);\
    myGraph.addVertex(5);\
    myGraph.addVertex(6);\
    \
    myGraph.addEdge(3, 1); \
    myGraph.addEdge(3, 4); \
    myGraph.addEdge(4, 2); \
    myGraph.addEdge(4, 5); \
    myGraph.addEdge(1, 2); \
    myGraph.addEdge(1, 0); \
    myGraph.addEdge(0, 2); \
    myGraph.addEdge(6, 5);\
\
    myGraph.showConnections();\
\
  \}\
\}}