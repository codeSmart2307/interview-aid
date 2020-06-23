package algorithms.searching;

// Java program to print DFS traversal from a given given graph
import java.util.*;

class DepthFirstSearch {

    // A function used by DFS
    void DFSUtil(Graph g, int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = g.getAdj()[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(g, n, visited);
        }
    }

    // The function to do DFS traversal. It uses recursive DFSUtil()
    void DFS(Graph g, int v) {
        // Mark all the vertices as not visited (Set as false by default in Java)
        boolean visited[] = new boolean[g.getV()];

        // Call the recursive helper function to print DFS traversal
        DFSUtil(g, v, visited);
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        DepthFirstSearch dfs = new DepthFirstSearch();

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal " +
                "(starting from vertex 2)");

        dfs.DFS(g, 2);
    }
}
