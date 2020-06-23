package algorithms.searching;

// Java program to print BFS traversal from a given source vertex.

import java.util.*;

class BreadthFirstSearch {

    // Prints BFS traversal from a given source s
    void BFS(int s, Graph g) {
        // Mark all the vertices as not visited (By default set as false)
        boolean visited[] = new boolean[g.getV()];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s.
            // If a adjacent has not been visited, then mark it visited and enqueue it
            Iterator<Integer> i = g.getAdj()[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        Graph g = new Graph(4);
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");

        bfs.BFS(2, g);
    }
}
