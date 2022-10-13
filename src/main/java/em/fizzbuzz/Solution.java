/*
Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
*/

package em.fizzbuzz;

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

}
