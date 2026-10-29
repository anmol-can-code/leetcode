class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int start = 0;
        int end = nums.length;
        int mid;
        int first;
        int last;

        // first index where nums[i] >= target
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        if (start < nums.length && nums[start] == target) {
            first = start;
        } else {
            return new int[]{-1, -1}; // target not present
        }

        // first index where nums[i] > target
        start = 0;
        end = nums.length;
        while (start < end) {
            mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        last = start - 1;

        return new int[]{first, last};
    }
}