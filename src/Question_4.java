import java.util.Arrays;

public class Question_4 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;

        for (int i = 0; i < nums.length - 1; i += 2) {
            maxSum += nums[i];
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        int maxSum = arrayPairSum(nums);
        System.out.println(maxSum);
    }
}
