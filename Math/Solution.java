class Solution {
    
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return isPowerOfTwo(n, 0);
    }
    
    private boolean isPowerOfTwo(int num, int exp) {
        if (Math.pow(2, exp) == num) return true;
        if (Math.pow(2, exp) > num) return false;
        return isPowerOfTwo(num, exp+1);
    }
    
}