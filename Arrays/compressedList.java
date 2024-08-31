import java.util.*;

class compressedList{

	public static void findCompressedList(int[] arr, int n){
		List<Integer> list = new ArrayList<>();
		
		int i=0,j=1;
		
		while(i<n && j<n){
			for(int k=0;k<arr[i];k++){
				list.add(arr[j]);
			}
			i+=2;
			j+=2;
		}
		
		for(int value:list){
			System.out.print(value+" ");
		}
		
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length : ");
		int len = sc.nextInt();
		
		int[] arr = new int[len];
		for(int i=0;i<len;i++){
			arr[i] = sc.nextInt();
		}
		
		findCompressedList(arr,len);
		
	}
}