class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0, right = 0;
        int product = 1;
        int prodCount = 0;
        while (right < nums.length) {
            product *= nums[right];
            while (left <= right && product >= k) {
                product = product / nums[left];
                left++;
            }
            
            prodCount += right - left + 1;
            right++;
        }
        return prodCount;
    }
}