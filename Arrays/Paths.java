import java.util.*;

class Paths{
	public static void main(String[] args){
		int[][] arr = {{7,1,3,5,3,6,1,1,7,5},
					   {2,3,6,1,1,6,6,6,1,2},
					   {6,1,7,2,1,4,7,6,6,2},
					   {6,6,7,1,3,3,5,1,3,4},
					   {5,5,6,1,5,4,6,1,7,4},
					   {3,5,5,2,7,5,3,4,3,6},
					   {4,1,4,3,6,4,5,3,2,6},
					   {4,4,1,7,4,3,3,1,4,2},
					   {4,4,5,1,5,2,3,5,3,5},
					   {3,6,3,5,2,2,6,4,2,1}};
		
		recursion(arr);
	}
	
	public static void recursion(int[][] arr){
		boolean[][] visited = new boolean[arr.length][arr[0].length];
		System.out.println(checkRecursion(arr,0,0,new int[1000][2],0,visited));
	}
	
	public static boolean checkRecursion(int[][] arr, int i, int j, int[][] ans, int index, boolean[][] visited){
		
		if(i >= arr.length||j >= arr[0].length || i<0 || j<0 || visited[i][j]){
			return false;
		}
		
		if(i == arr.length-1 && j == arr[0].length-1){
			ans[index][0] = i;
			ans[index][1] = j;
			print(ans, index+1);
			return true;
		}
		
		int k = arr[i][j];
		visited[i][j] = true;
		ans[index][0] = i;
		ans[index][1] = j;
		if(checkRecursion(arr,i+k,j,ans,index+1,visited)) return true;
		if(checkRecursion(arr,i,j+k,ans,index+1,visited)) return true;
		if(checkRecursion(arr,i-k,j,ans,index+1,visited)) return true;
		if(checkRecursion(arr,i,j-k,ans,index+1,visited)) return true;
		
		visited[i][j] = false;
		return false;
	}
	
	public static void print(int[][] arr, int n){
		
		for(int i=0;i<n;i++){
			System.out.print("(" + arr[i][0] + "," + arr[i][1] + ")");
		}
		System.out.println();
	}
}