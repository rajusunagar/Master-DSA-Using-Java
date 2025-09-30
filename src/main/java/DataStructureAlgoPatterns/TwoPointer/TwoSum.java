package DataStructureAlgoPatterns.TwoPointer;

import java.util.Arrays;
// code
public class TwoSum {
    
    public int[] twoSum(int[] nums, int target) {
        int[][] indexed = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            indexed[i] = new int[]{nums[i], i};
        }
        Arrays.sort(indexed, (a, b) -> a[0] - b[0]);
        
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = indexed[left][0] + indexed[right][0];
            if (sum == target) {
                return new int[]{indexed[left][1], indexed[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
    }
}