import java.util.*;

class task3{

	public static int[] findMaxProduct(int[] arr, int n){
		
		int prefix = 1;
		int suffix = 1;
		int maxProd = -1;
		int pidx = 0;
		int sidx = 1;
		
		for(int i=0;i<n;i++){
			
			if(prefix == 0)
				prefix = 1;
				
			if(suffix == 0)
				suffix = 1;
		
			prefix *= arr[i];
			suffix *= arr[n-i-1];
			
			//maxProd = Math.max(maxProd,Math.max(prefix,suffix));
			if (maxProd < Math.max(prefix, suffix)) {
                maxProd = Math.max(prefix, suffix);
                pidx = i;
                sidx = n - i - 1;
            }
		
		}
		
		 
        if (prefix > suffix) {
            return Arrays.copyOfRange(arr, 0, pidx + 1);
        } else {
            return Arrays.copyOfRange(arr, n - sidx - 1, n);
        }
		
		//return maxProd;
		
	}

	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		
		for(int i=0;i<len;i++){
			arr[i] = sc. nextInt();
		}
		
		int[] maxProductSubarray = findMaxProduct(arr, len);
        System.out.println("Subarray with maximum product: " + Arrays.toString(maxProductSubarray));
		//System.out.println(findMaxProduct(arr,len));
	}
}