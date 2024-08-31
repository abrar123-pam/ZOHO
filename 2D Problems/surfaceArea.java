import java.util.*;

class surfaceArea3D{
	public static int surfaceArea(int[][] grid) {
        int count = 0;
        int n = grid.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    count += 2;
                }
                if(j==0){
                    count += grid[i][j];
                }else{
                    int temp = grid[i][j-1]-grid[i][j];
                    if(temp > 0) count += temp;
                }

                if(j==n-1){
                    count += grid[i][j];
                }else{
                    int temp = grid[i][j+1]-grid[i][j];
                    if(temp > 0) count += temp;
                }

                if(i==0){
                    count += grid[i][j];
                }else{
                    int temp = grid[i-1][j]-grid[i][j];
                    if(temp > 0) count += temp;
                }

                if(i==n-1){
                    count += grid[i][j];
                }else{
                    int temp = grid[i+1][j]-grid[i][j];
                    if(temp > 0) count += temp;
                }


            }
        }

        return count;
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
		
		System.out.println(surfaceArea(arr));
		
	}
}