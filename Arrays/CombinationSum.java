package Practice;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] arr = {2,3,5};
        int target = 8;
        List<List<Integer>> ans = findCombinationSum(arr,target);

        System.out.println(ans);
    }

    private static List<List<Integer>> findCombinationSum(int[] arr, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        recursive(arr,ans,list,target,0,0);

        return ans;
    }
   // Input: candidates = [2,3,5], target = 8
   // Output: [[2,2,2,2],[2,3,3],[3,5]]
    private static void recursive(int[] arr, List<List<Integer>> ans, List<Integer> list,int target,int sum,int idx) {

        if(idx == arr.length || sum > target){
            return;
        }

        if(sum == target){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[idx]);
        recursive(arr,ans,list,target,sum+arr[idx],idx);
        list.remove(list.size()-1);
        recursive(arr,ans,list,target,sum,idx+1);


//        for(int i=idx; i<arr.length; i++){
//            list.add(arr[i]);
//            recursive(arr,ans,list,target,sum+arr[i],i+1);
//            list.remove(list.size()-1);
//        }
    }
}
