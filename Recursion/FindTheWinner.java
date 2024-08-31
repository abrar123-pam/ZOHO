import java.util.*;

class FindTheWinner{
	
	
	public static int findTheWinner(int n, int k) {
        int ans = solve(n,k)+1;
        return ans;
    }

    public static int solve(int n, int k){
        if(n==1){
            return 0;
        }

        return (solve(n-1,k)+k) % n;
    }
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(findTheWinner( n,  k));
	}
}