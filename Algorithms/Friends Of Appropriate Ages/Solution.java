package friends_of_appropriate_ages;

public class Solution {
  public int numFriendRequests(int[] ages) {
    int[] count = new int[121];
    for (int age : ages)
      count[age]++;

    int ans = 0;
    for (int ageA = 0; ageA <= 120; ageA++) {
      int countA = count[ageA];
      for (int ageB = 0; ageB <= 120; ageB++) {
        int countB = count[ageB];
        if (ageA * 0.5 + 7 >= ageB)
          continue;
        if (ageA < ageB)
          continue;
        if (ageA < 100 && 100 < ageB)
          continue;
        ans += countA * countB;
        if (ageA == ageB)
          ans -= countA;
      }
    }

    return ans;
  }
}
