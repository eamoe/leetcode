/*
    You have a long flowerbed in which some plots are planted, and some are not.
    However, flowers cannot be planted in adjacent plots.
    Given an integer array flowerbed containing 0's and 1's,
    where 0 means empty and 1 means not empty, and an integer n,
    return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
*/

package em.canplaceflowers;

public class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {

            if (flowerbed[i] == 0) {

                boolean isPreviousEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean isNextEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);

                if (isPreviousEmpty && isNextEmpty) {
                    flowerbed[i] = 1;
                    count++;
                }
            }
        }
        return count >= n;
    }

}
