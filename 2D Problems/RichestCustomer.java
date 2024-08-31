import java.util.*;

class RichestCustomer{

	public static int FindRichest(int[][] arr, int r, int c){
		
		int rich = 0;
		
		for(int i=0;i<r;i++){
			int sum = 0;
			for(int j=0;j<c;j++){
				sum += arr[i][j];
			}
			rich = Math.max(sum,rich);
		}
		
		return rich;
	}

	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter rows : ");
		int r = sc.nextInt();
		System.out.print("Enter cols : ");
		int c = sc.nextInt();
		
		int[][] arr = new int[r][c];
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(FindRichest(arr,r,c));
	}
}