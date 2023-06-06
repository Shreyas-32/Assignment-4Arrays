import java.util.Arrays;

public class Question_8 {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0;
        int j = 0;

        while (i < n) {
            result[j] = nums[i];
            result[j + 1] = nums[i + n];
            i++;
            j += 2;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] shuffledArray = shuffle(nums, n);
        System.out.println(Arrays.toString(shuffledArray));
    }
}
