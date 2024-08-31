import java.util.*;

class XorSubset{
	 static void findSubset(int[]nums, int idx,List<Integer> list , int sub,List<List<Integer>> ans){

        if(idx >= nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(nums[idx]);
        findSubset(nums,idx+1,list,sub,ans);
        list.remove(list.size()-1);
        findSubset(nums,idx+1,list,sub,ans);
    }

    static int findXor(List<Integer>  list){
        int xor = 0;
        for(int i: list){
            xor = xor ^ i;
        }

        return xor;
    }

    public static int subsetXORSum(int[] nums) {
		List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int subcount = 0;
        findSubset(nums,0,list,subcount,ans);
		
		for(List<Integer> al : ans){
			subcount += findXor(al);
		}
		System.out.println(ans);
        return subcount;
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println(subsetXORSum(arr));
	}
}