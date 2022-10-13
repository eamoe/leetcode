package em.fizzbuzz;

import java.util.List;

public class Test {

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
