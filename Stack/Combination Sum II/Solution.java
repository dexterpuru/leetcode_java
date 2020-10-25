import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		Set<List<Integer>> result = new HashSet<>();
		findSumII(candidates, 0, 0, new ArrayDeque<>(), target, result);
		return List.copyOf(result);
	}

	private void findSumII(int[] candidates, int candidatesIndex, int currentSum, Deque<Integer> currentCandidates,
			Integer target, Set<List<Integer>> result) {
		if (candidatesIndex >= candidates.length) {
			return;
		}
		Integer currentValue = candidates[candidatesIndex];
		if (currentValue + currentSum > target) {
			return;
		}
		if (currentValue + currentSum == target) {
			currentCandidates.add(currentValue);
			result.add(List.copyOf(currentCandidates));
			currentCandidates.pollLast();
			return;
		}
		findSumII(candidates, ++candidatesIndex, currentSum, currentCandidates, target, result);
		currentCandidates.add(currentValue);
		findSumII(candidates, candidatesIndex, currentSum + currentValue, currentCandidates, target, result);
		currentCandidates.pollLast();
	}
}