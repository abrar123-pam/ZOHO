package test;

public class repeates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int count = 1;
        int index = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,2,3,3};

        int k = removeDuplicates(arr);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Print a new line after the array elements
    }
}
