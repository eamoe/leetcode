package em.mintimetotypeword;

public class Test {

    public static void main(String[] args) {

        String word1 = "abc";
        int minTime1 = 5;

        String word2 = "bza";
        int minTime2 = 7;

        String word3 = "zjpc";
        int minTime3 = 34;

        Solution solution = new Solution();

        if (solution.minTimeToType(word1) != minTime1) {
            System.out.println("Test 1 failed");
        }

        if (solution.minTimeToType(word2) != minTime2) {
            System.out.println("Test 2 failed");
        }

        if (solution.minTimeToType(word3) != minTime3) {
            System.out.println("Test 3 failed");
        }

    }

}
