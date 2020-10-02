
class RecentCounter {
    LinkedList<Integer> times;
    public RecentCounter() {
        times = new LinkedList<Integer>();
    }
    
    public int ping(int t) {
        times.add(t);
        while (times.getFirst() < t-3000) {
            times.removeFirst();
        }
        
        return times.size();
    }
}