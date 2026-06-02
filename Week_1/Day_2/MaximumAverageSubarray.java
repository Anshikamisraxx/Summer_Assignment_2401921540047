// Problem: Maximum Average Subarray I
// Platform: LeetCode
// Link: https://leetcode.com/problems/maximum-average-subarray-i/
// Pattern: Sliding Window
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MaximumAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        System.out.println(findMaxAverage(nums, k)); // Output: 12.75
    }
}