/* Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd number
number of even numbers
number of 0s.
6
8
10
4*/
//5 -2 0 7 10 -3 0 4 8 -9 12 0 6 -1 3 0 -6 11 0 2

import java.util.*;

class task10{

	public static void findDatas(int[] arr, int n){
		int pos = 0,neg=0,odd=0,even=0,zero = 0;
		
		for(int i=0;i<n;i++){
			if(arr[i] > 0){
				pos++;
				if(arr[i] %2 == 0){
					even++;
				}else{
					odd++;
				}
			}else if(arr[i] < 0){
				neg++;
			}else if(arr[i] == 0){
				zero++;
			}
		
			
		}
		
		System.out.println("Number of positive numbers: "+pos);
		System.out.println("Number of negative numbers: "+neg);
		System.out.println("Number of odd numbers: "+odd);
		System.out.println("Number of even numbers: "+even);
		System.out.println("Number of zeros: "+zero);

		
		
		
	}

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 20 elements : " );
		
		int[] arr = new int[20];
		for(int i=0;i<20;i++){
			arr[i] = sc.nextInt();
		}
		
		findDatas(arr,20);
	}
}