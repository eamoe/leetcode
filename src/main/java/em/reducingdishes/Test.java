package em.reducingdishes;

public class Test {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] satisfaction1 = {-1, -8, 0, 5, -9};
        int output1 = 14;

        int[] satisfaction2 = {4, 3, 2};
        int output2 = 20;

        int[] satisfaction3 = {-1, -4, -5};
        int output3 = 0;

        if (solution.maxSatisfaction(satisfaction1) != output1) {
            System.out.println("Test 1 failed");
        }
        if (solution.maxSatisfaction(satisfaction2) != output2) {
            System.out.println("Test 2 failed");
        }
        if (solution.maxSatisfaction(satisfaction3) != output3) {
            System.out.println("Test 3 failed");
        }

    }

}
