import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    ArrayList<String> buildings = new ArrayList<>();
    buildings.add("Liberal Arts");
    buildings.add("Student Services");
    buildings.add("Health Careers & Sciences");
    buildings.add("Health Technologies Center");
    buildings.add("Recreation Center");
    buildings.add("Technology Learning Center");
    buildings.add("Business & Technology");
    buildings.add("Theatre");

    // 2-Define Edges
    int[][] edges = {
      {0, 1},
      {1, 2},
      {2, 3},
      {3, 4},
      {4, 5},
      {5, 6},
      {6, 7},
      {7, 0}
    };

    // 3. Create the graph (name "graph") using the vertices and edges
    UnweightedGraph<String> graph = new UnweightedGraph<>(edges, buildings.size());
    
    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
    int startIndex = buildings.indexOf("Business & Technology");
    UnweightedGraph<String>.SearchTree dfs = graph.dfs(startIndex);

    // 5. Retrieve and print the search order of the DFS traversal
    System.out.println("DFS Search Order:");
    List<Integer> searchOrder = dfs.getSearchOrder();
    for (int index : searchOrder) {
      System.out.println(buildings.get(index));
    }

    // 6. Print the parent-child relationships for each vertex during the DFS traversal
    System.out.println("\nParent-Child Relationships:");
    for (int i = 0; i < graph.getSize(); i++) {
        int parentIndex = dfs.getParent(i);
        if (parentIndex != -1) {
            System.out.println("Parent: " + buildings.get(parentIndex) + ", Child: " + buildings.get(i));
        }
    }

    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
    // Path from Business & Technology to Health Technologies Center, Student Services, and Recreation Center
    System.out.println("\nPath from Business & Technology to Health Technologies Center:");
    int healthTechCenterIndex = buildings.indexOf("Health Technologies Center");
    dfs.printPath(healthTechCenterIndex);
    System.out.println();

    System.out.println("\nPath from Business & Technology to Student Services:");
    int studentServicesIndex = buildings.indexOf("Student Services");
    dfs.printPath(studentServicesIndex);
    System.out.println();

    System.out.println("\nPath from Business & Technology to Recreation Center:");
    int recreationCenterIndex = buildings.indexOf("Recreation Center");
    dfs.printPath(recreationCenterIndex);
    System.out.println();

     // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
    System.out.println("\nDFS Tree:");
    dfs.printTree();
  }
}