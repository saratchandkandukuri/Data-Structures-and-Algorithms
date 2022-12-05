import java.util.ArrayList;
import java.util.HashMap;

class MyGraph {
  private int numberOfNodes;
  private HashMap<Integer, ArrayList<Integer>> adjacentListHashMap;

  public MyGraph() {
    this.numberOfNodes = 0;
    adjacentListHashMap = new HashMap<Integer, ArrayList<Integer>>();
  }

  public void addVertex(int node) {
    this.adjacentListHashMap.put(node, new ArrayList<Integer>());
    this.numberOfNodes++;
  }

  public void addEdge(int node1, int node2) {
    ArrayList<Integer> node1Value = this.adjacentListHashMap.get(node1);
    node1Value.add(node2);

    ArrayList<Integer> node2Value = this.adjacentListHashMap.get(node2);
    node2Value.add(node1);
  }

  public void showConnections() {
        Object[] keys = this.adjacentListHashMap.keySet().toArray();
        for (Object key : keys) {
            System.out.println(key + " ---> " + adjacentListHashMap.get(Integer.parseInt(key.toString())));
        }
    }
}