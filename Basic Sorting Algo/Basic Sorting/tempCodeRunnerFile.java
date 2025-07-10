import java.util.Arrays;

public class Practice {

    public static int[] threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < n-2; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    return new int[] { nums[i], nums[left], nums[right] };
                } else if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                }

            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.print(Arrays.toString(threeSum(nums)));
        System.out.println();

    }
}
