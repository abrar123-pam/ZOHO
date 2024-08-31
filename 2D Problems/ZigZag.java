

public class ZigZag{
	
	public static void main(String[] args){
		
		String s = "PAYPALISHIRING";
		int idx = 4;
		char[][] arr = new char[idx][14];
		int n = arr.length;
		int m = arr[0].length;
		
		
		
		
		for(int q=0;q<n;q++){
			for(int w=0;w<m;w++){
				arr[q][w] = '-';
				
			}
			
		}
		
		int k =0;
		
		
		int i=0,j=0;
		while(k < s.length()){
			
			while(i<n && k < s.length()){
				arr[i][j] = s.charAt(k++);
				i++;
			}
			i =i-2;
			j++;
			while(i>0 && k < s.length()){
				arr[i][j] = s.charAt(k++);
				i--;
				j++;
				
			}
		}
		
		for(int q=0;q<n;q++){
			for(int w=0;w<m;w++){
				System.out.print(arr[q][w]+ " ");
			}
			System.out.println();
		}
		
		StringBuilder sb = new StringBuilder();
        for(int q=0;q<n;q++){
			for(int w=0;w<m;w++){
				if(arr[q][w] != '-'){
					sb.append(arr[q][w]);
				}
				
			}
			
		}
		
		System.out.println(sb.toString());
	}
}