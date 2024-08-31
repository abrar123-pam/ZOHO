package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        List<List<Integer>> ans = generateSubset(arr);
        System.out.println(ans);
    }

    private static List<List<Integer>> generateSubset(int[] arr) {

        List<List<Integer>> list = new ArrayList<>();

        int n = 1 << arr.length;
        for (int i = 0; i < n; i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if((i & (1<<j)) != 0){
                    subset.add(arr[j]);
                }

            }
            list.add(subset);
        }

        return list;

    }
}
