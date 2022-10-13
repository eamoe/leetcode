package em.canplaceflowers;

public class Test {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] test1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        boolean result1 = true;

        int[] test2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        boolean result2 = false;

        if (solution.canPlaceFlowers(test1, n1) != result1) {
            System.out.println("Test 1 failed");
        }
        if (solution.canPlaceFlowers(test2, n2) != result2) {
            System.out.println("Test 2 failed");
        }

    }

}
