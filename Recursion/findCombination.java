import java.util.*;

class task1{
	
	public static void findCombination(int count,int[] arr,int k,ArrayList<Integer> list){
		if (count == k) {
            for (int i = 0; i < k; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            return;
        }
		
		for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
                findCombination(count + 1, arr, k, list);
                list.remove(list.size() - 1);
            }
        }
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		findCombination(count,arr,k,list);
	}
}