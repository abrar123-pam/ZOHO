import java.util.*;

class Test4{
	
	public static void deleteElementsFromStart(int n, ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return;
        }
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 1; i < list.size(); i += 2) {
            newList.add(list.get(i));
        }
        list.clear();
        for (int num : newList) {
            list.add(num);
        }
        deleteElementsFromEnd(n, list);
    }

    public static void deleteElementsFromEnd(int n, ArrayList<Integer> list) {
        if (list.size() <= 1) {
            return;
        }
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = list.size() - 2; i >= 0; i -= 2) {
            newList.add(list.get(i));
        }
        list.clear();
        for (int i = newList.size() - 1; i >= 0; i--) {
            list.add(newList.get(i));
        }
        deleteElementsFromStart(n, list);
    }

    public static void delete(int n, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(arr[i]);
        }
        deleteElementsFromStart(n, list);

        System.out.println(list.get(0));
    }

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = i+1;
		}
		
		delete(n,arr);
	}
}