import java.util.*;

class GraphImplementation{
	
	private LinkedList<Integer> adjacency[];
	
	public GraphImplementation(int v){
		adjacency = new LinkedList[v];
		for(int i=0;i<v;i++){
			adjacency[i] = new LinkedList<Integer>();
		}
	}
	
	public void insertEdge(int s, int d){
		
		adjacency[s].add(d);
		adjacency[d].add(s);
		
		//System.out.println(adjacency[d]);
		//System.out.println(adjacency[s]);
	}
	
	public void bfsTraverse(int src){
		boolean visited[] = new boolean[adjacency.length];
		Queue<Integer> queue = new LinkedList<>();
		queue.add(src);
		visited[src] = true;
		
		while(!queue.isEmpty()){
			int p = queue.poll();
			System.out.print(p + " ");
			
			for(int i:adjacency[p]){
				if(visited[i] != true){
					visited[i] = true;
					queue.add(i);
				}
			}
			
		}
	}
	
	public void dfsTraverse(int src){
		boolean visited[] = new boolean[adjacency.length];
		Stack<Integer> st = new Stack<>();
		
		st.push(src);
		visited[src] = true;
		
		while(!st.isEmpty()){
			int p = st.pop();
			System.out.print(p +" ");
			
			for(int i:adjacency[p]){
				if(visited[i] != true){
					visited[i] = true;
					st.push(i);
				}
			}
			
		}
		
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Nodes : ");
		int nodes = sc.nextInt();
		
		System.out.print("Enter number of Edges : ");
		int edges = sc.nextInt();
		
		GraphImplementation g = new GraphImplementation(nodes);
		System.out.println("Enter edges to connect : ");
		
		for(int i=0;i<edges;i++){
			System.out.print("source : ");
			int source = sc.nextInt();
			System.out.print("destination : ");
			int destination = sc.nextInt();
			
			g.insertEdge(source,destination);
		}
		
		System.out.println("Enter SOurce ");
		int src = sc.nextInt();
		
		g.bfsTraverse(src);
		System.out.println();
		g.dfsTraverse(src);
	}
}







