package LeetCode;

import java.util.ArrayList;
import java.util.Collections;

public class RankTransformMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {7,7},
                {7,7}
        };

        int[][] ans = matrixRankTransform(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] matrixRankTransform(int[][] arr) {
        int[][] ans = new int[arr.length][arr[0].length];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                ans[i][j] = findRank(arr,i,j,arr[i][j]);
            }
        }
        return ans;
    }

    private static int findRank(int[][] arr, int r, int c, int curr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int k = 0; k < arr.length; k++) {
            list.add(arr[r][k]);
            list.add(arr[k][c]);
        }

        Collections.sort(list);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == curr) {
                return i+1;
            }
        }
        return -1;

    }
}
