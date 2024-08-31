import java.util.*;

// --------------S O R T I N G----------------

class sortingAlgorithms{
	
	public void bubbleSort(int[] arr){
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j] > arr[j+1]){
					swap(j,j+1,arr);
				}
			}
		}
		print(arr);
	}
	
	public void selectionSort(int[] arr){
		int n = arr.length;
		// 8  6 2 5 1
		for(int i=0;i<n-1;i++){
			int min = i;
			
			for(int j=i;j<n;j++){
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			swap(min,i,arr);
			print(arr);
		}
		print(arr);
	}
	
	public void insertionSort(int[] arr){
		int n = arr.length;
		
		for(int i=0;i<n;i++){
			int j = i;
			
			while(j >0 && arr[j-1] >arr[j]){
				swap(j,j-1,arr);
				j--;
			}
		}
		print(arr);
	}
	
	public void mergeSort(int[] arr, int low, int high){
		if(low >= high) return;
		
		int mid = (low+high) / 2;
		
		mergeSort(arr,low, mid);
		mergeSort(arr,mid+1, high);
		merge(arr,low,mid, high);
		
		print(arr);
	}
	
	public static void merge(int[] arr, int low, int mid, int high){
		
		ArrayList<Integer> temp = new ArrayList<>();
		
		int left = low;
		int right = mid+1;
		
		while(left <= mid && right <= high){
			
			if(arr[left] <= arr[right]){
				temp.add(arr[left]);
				left++;
			}else{
				temp.add(arr[right]);
				right++;
			}
		}
		while(left <= mid){
			temp.add(arr[left]);
			left++;
		}
		while(right <= high){
			temp.add(arr[right]);
			right++;
		}
		
		for(int i=low;i<=high;i++){
			arr[i] = temp.get(i-low);
		}
	}
	
	
	public void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pivot = partition(arr, low, high);
        quickSort(arr, low, pivot - 1); // Sort left subarray
        quickSort(arr, pivot + 1, high); // Sort right subarray
    }
    // No need to print inside quickSort, printing should be done after sorting is complete
}

public int partition(int[] arr, int low, int high) {
    int pivot = arr[low];
    int i = low;
    int j = high;

    while (i < j) {
        while (i <= high && arr[i] <= pivot) i++;
        while (j >= low + 1 && arr[j] > pivot) j--;

        if (i < j) swap(i, j, arr);
    }

    swap(j, low, arr);

    return j;
}
	public static void print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int x, int y, int[] arr){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}

public class Main{
	public static void main(String[] args){
		int[] arr = {2,6,8,5,4,10};
		
		sortingAlgorithms sa = new sortingAlgorithms();
		
		//sa.bubbleSort(arr);
		//sa.selectionSort(arr);
		//sa.insertionSort(arr);
		//sa.mergeSort(arr,0,arr.length-1);
		sa.quickSort(arr,0,arr.length-1);
		sa.print(arr);
		
	}
}