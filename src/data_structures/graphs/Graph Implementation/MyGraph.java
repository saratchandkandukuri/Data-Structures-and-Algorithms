{\rtf1\ansi\ansicpg1252\cocoartf2638
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.ArrayList;\
import java.util.HashMap;\
\
class MyGraph \{\
  private int numberOfNodes;\
  private HashMap<Integer, ArrayList<Integer>> adjacentListHashMap;\
\
  public MyGraph() \{\
    this.numberOfNodes = 0;\
    adjacentListHashMap = new HashMap<Integer, ArrayList<Integer>>();\
  \}\
\
  public void addVertex(int node) \{\
    this.adjacentListHashMap.put(node, new ArrayList<Integer>());\
    this.numberOfNodes++;\
  \}\
\
  public void addEdge(int node1, int node2) \{\
    ArrayList<Integer> node1Value = this.adjacentListHashMap.get(node1);\
    node1Value.add(node2);\
\
    ArrayList<Integer> node2Value = this.adjacentListHashMap.get(node2);\
    node2Value.add(node1);\
  \}\
\
  public void showConnections() \{\
        Object[] keys = this.adjacentListHashMap.keySet().toArray();\
        for (Object key : keys) \{\
            System.out.println(key + " ---> " + adjacentListHashMap.get(Integer.parseInt(key.toString())));\
        \}\
    \}\
\}}