import java.util.*;

class task12D{

	public static boolean findString(char[][] arr, int r, int c, String s){
		
		if(s.length() != r){
			return false;
		}
		int rcount = 0,ccount = 0;
		
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				if(arr[i][j] == s.charAt(i)){
					rcount++;
				}
				
				if(arr[j][i] == s.charAt(i)){
					ccount++;
				}
			}
		}
		
		if(rcount == s.length() || ccount == s.length()){
			return true;
		}
		
		return false;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		char[][] arr = new char[r][c];
		
		for(int i = 0; i < r; i++){
            String row = sc.next();
            for(int j = 0; j < c; j++){
                arr[i][j] = row.charAt(j);
            }
        }
		String target = sc.next();
		
		if(findString(arr,r,c,target)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}