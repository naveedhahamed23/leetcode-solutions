/**
 * LeetCode 1190 - Reverse Substrings Between Each Pair of Parentheses
 *
 * Problem:
 * Given a string s containing lowercase English letters and parentheses,
 * reverse the strings inside each pair of matching parentheses.
 *
 * Approach:
 * 1. Use a stack to store characters.
 * 2. Push every character onto the stack.
 * 3. When a closing parenthesis ')' is found:
 *    - Pop characters until '(' is reached.
 *    - The popped characters are already in reverse order.
 *    - Remove the opening '('.
 *    - Push the reversed characters back onto the stack.
 * 4. After processing the entire string, pop the remaining characters
 *    and reverse the result to restore their original order.
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

import java.util.Stack;

class Solution {

    public String reverseParentheses(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == ')') {

                StringBuilder sb = new StringBuilder();

                // Pop characters until '('
                while (!stack.isEmpty() && stack.peek() != '(') {
                    sb.append(stack.pop());
                }

                // Remove '('
                if (!stack.isEmpty()) {
                    stack.pop();
                }

                // Push reversed characters back
                for (int i = 0; i < sb.length(); i++) {
                    stack.push(sb.charAt(i));
                }

            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.reverse().toString();
    }
}
