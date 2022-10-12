/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/

package em.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private final String phrase1 = "FizzBuzz";
    private final String phrase2 = "Fizz";
    private final String phrase3 = "Buzz";
    private int phrase4;
    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            boolean divisibleBy3 = (i % 3 == 0);
            boolean divisibleBy5 = (i % 5 == 0);

            if (divisibleBy3 && divisibleBy5) {
                list.add(phrase1);
            }
            else if (divisibleBy3) {
                list.add(phrase2);
            }
            else if (divisibleBy5) {
                list.add(phrase3);
            }
            else {
                list.add(Integer.toString(i));
            }

        }
        return list;
    }

    public static void main(String[] args) {

        Solution solution = new Solution();

        List<String> test1 = List.of("1","2","Fizz");
        List<String> test2 = List.of("1","2","Fizz","4","Buzz");
        List<String> test3 = List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");

        List<String> list1 = solution.fizzBuzz(3);
        List<String> list2 = solution.fizzBuzz(5);
        List<String> list3 = solution.fizzBuzz(15);

        if (!list1.equals(test1)) {
            System.out.println("Test 1 failed");
        }
        if (!list2.equals(test2)) {
            System.out.println("Test 2 failed");
        }
        if (!list3.equals(test3)) {
            System.out.println("Test 3 failed");
        }
    }

}
