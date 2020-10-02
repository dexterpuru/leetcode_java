class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 0; i < timeSeries.length; i++) {
            if (i == timeSeries.length - 1) {
                sum += duration;
            } else {
                sum += Math.min(timeSeries[i + 1] - timeSeries[i], duration);
            }
        }
        return sum;
    }
}