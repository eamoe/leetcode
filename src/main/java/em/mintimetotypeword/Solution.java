/* There is a special typewriter with lowercase English letters 'a' to 'z'
arranged in a circle with a pointer.
A character can only be typed if the pointer is pointing to that character.
The pointer is initially pointing to the character 'a'.

Each second, you may perform one of the following operations:

Move the pointer one character counterclockwise or clockwise.
Type the character the pointer is currently on.
Given a string word, return the minimum number of seconds to type out the characters in word.
*/

package em.mintimetotypeword;

public class Solution {

    public int minTimeToType(String word) {

        int startIndex = (int) 'a';
        int endIndex = (int) 'z';

        int alphabetLength = endIndex - startIndex + 1;

        int time = 0;
        int currentSymbolCode = startIndex;

        for (int i = 0; i < word.length(); i++) {

            int nextSymbolCode = word.charAt(i);

            int distance = Math.abs((nextSymbolCode - currentSymbolCode) % alphabetLength);

            time += Math.min(distance, alphabetLength - distance) + 1;

            currentSymbolCode = nextSymbolCode;
        }

        return time;
    }

}
