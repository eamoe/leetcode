/*
A chef has collected data on the satisfaction level of his n dishes.
Chef can cook any dish in 1 unit of time.

Like-time coefficient of a dish is defined as the time taken to cook that dish
including previous dishes multiplied by its satisfaction level i.e. time[i] * satisfaction[i].

Return the maximum sum of like-time coefficient that the chef can obtain after dishes preparation.

Dishes can be prepared in any order and the chef can discard some dishes to get this maximum value.
*/

package em.reducingdishes;

import java.util.Arrays;

public class Solution {

    public int maxSatisfaction(int[] satisfaction) {

        Arrays.sort(satisfaction);

        int maxSum = 0;
        int total = 0;
        int n = satisfaction.length;

        for (int i = n - 1; i >= 0 && satisfaction[i] > -total; --i) {
            total += satisfaction[i];
            maxSum += total;
        }

        return maxSum;
    }

}
