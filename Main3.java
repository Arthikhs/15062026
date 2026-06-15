import java.util.*;

class Main {

    // Class to store node and weight
    static class Pair {

        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of vertices and edges
        int n = sc.nextInt();
        int e = sc.nextInt();

        // Adjacency List
        List<List<Pair>> graph = new ArrayList<>();

        // Create empty lists
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Read all edges
        for (int i = 0; i < e; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            // Undirected graph
            graph.get(u).add(new Pair(v, w));
            graph.get(v).add(new Pair(u, w));
        }

        // Min Heap based on edge weight
        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> a.weight - b.weight);

        // Track visited nodes
        boolean[] visited = new boolean[n + 1];

        // Start from node 1
        pq.add(new Pair(1, 0));

        int mstCost = 0;

        // Prim's Algorithm
        while (!pq.isEmpty()) {

            // Get minimum weight edge
            Pair current = pq.poll();

            int node = current.node;
            int weight = current.weight;

            // Skip if already visited
            if (visited[node]) {
                continue;
            }

            // Mark visited
            visited[node] = true;

            // Add weight to MST cost
            mstCost += weight;

            // Visit neighbors
            for (Pair neighbor : graph.get(node)) {

                // Add unvisited neighbors
                if (!visited[neighbor.node]) {
                    pq.add(new Pair(neighbor.node,
                                    neighbor.weight));
                }
            }
        }

        // Print minimum cost
        System.out.println(mstCost);
    }
}