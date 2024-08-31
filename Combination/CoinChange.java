import java.util.*;

class CoinChange {
    static int count = 0;
    
    static void recursive(int amount, int[] coins, int idx,int temp){
        
        if(temp == amount){
            count++;
            return;
        }

        if(temp > amount || idx == coins.length){
            return;
        }

        recursive(amount,coins,idx,temp+coins[idx]);
        
        recursive(amount,coins,idx+1,temp);
    }

    public static int change(int amount, int[] coins) {
        if(coins.length == 1 && amount == coins[0]){
            return 1;
        }

        
        count = 0;
        recursive(amount, coins,0,0);

        return count;
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int amount = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(change(amount,arr));
	}
}