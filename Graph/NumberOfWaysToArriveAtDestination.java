package Graph;


import java.util.*;

class Node implements Comparable<Node> {
    int fromCity;
    int time;

    public Node(int fromCity, int time) {
        this.fromCity = fromCity;
        this.time = time;
    }

    @Override
    public int compareTo(Node n1){
        return Integer.compare(this.time, n1.time);
    }


}

class graph{
    private int vertices;
    ArrayList<ArrayList<Node>> adjacencyList;
    public graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest, int time) {

        adjacencyList.get(src).add(new Node(dest,time));
        adjacencyList.get(dest).add(new Node(src, time));
    }

    public void printEdge() {
        for (int i = 0; i < vertices; i++) {
            List<Node> list = adjacencyList.get(i);
            System.out.print("vertex : " + i + " -> ");
            for (Node n : list) {
                System.out.print("(" + n.fromCity + "," + n.time + ") ");
            }
            System.out.println();
        }
    }


    public int countPaths(int st, int end) {
        int mod = 1000000007;
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>();
        int[] dist = new int[vertices];
        int[] ways = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[st] = 0;
        ways[st] = 1;

        priorityQueue.add(new Node(st,0));
        while (!priorityQueue.isEmpty()) {
            Node node = priorityQueue.poll();
            int currCity = node.fromCity;
            int currTime = node.time;

            if (visited[currCity]) continue;
            visited[currCity] = true;


            for(Node cnode : adjacencyList.get(currCity)){
                int newDist = currTime + cnode.time;
                if(newDist < dist[cnode.fromCity]){
                    dist[cnode.fromCity] = newDist;
                    ways[cnode.fromCity] = ways[currCity];
                    priorityQueue.add(new Node(cnode.fromCity,newDist));
                }else if(newDist == dist[cnode.fromCity]){
                    ways[cnode.fromCity] = (ways[cnode.fromCity] + ways[currCity]) % mod;
                }
            }
        }

        System.out.println(Arrays.toString(dist));
        System.out.println(Arrays.toString(ways));
        return ways[end];


    }
}
public class NumberOfWaysToArriveAtDestination {
    public static void main(String[] args) {
        graph g = new graph(7);
        g.addEdge(0,6,7);
        g.addEdge(0,1,2);
        g.addEdge(1,2,3);
        g.addEdge(1,3,3);
        g.addEdge(6,3,3);
        g.addEdge(3,5,1);
        g.addEdge(6,5,1);
        g.addEdge(2,5,1);
        g.addEdge(0,4,5);
        g.addEdge(4,6,2);

        g.printEdge();

        System.out.println("Total Paths - >"+g.countPaths(0,6));

    }
}
