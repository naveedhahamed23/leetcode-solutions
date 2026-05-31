import java.util.Stack;

/**
 * LeetCode 20 - Valid Parentheses
 *
 * Problem:
 * Given a string s containing:
 * - '('
 * - ')'
 * - '{'
 * - '}'
 * - '['
 * - ']'
 *
 * Determine whether the input string is valid.
 *
 * A string is valid if:
 * 1. Open brackets are closed
 *    by the same type of brackets
 * 2. Open brackets are closed
 *    in the correct order
 *
 * Approach:
 * Stack
 *
 * 1. Traverse characters in the string
 * 2. For every opening bracket:
 *      push its expected closing bracket
 * 3. For every closing bracket:
 *      check stack top
 * 4. If mismatch occurs:
 *      return false
 * 5. At the end,
 *      stack must be empty
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {

    public boolean isValid(String s) {

        // Odd length can never be valid
        if (s.length() % 2 != 0) {

            return false;
        }

        Stack<Character> stack =
                new Stack<>();

        // Traverse string
        for (char ch : s.toCharArray()) {

            // Opening brackets
            if (ch == '(') {

                stack.push(')');
            }

            else if (ch == '{') {

                stack.push('}');
            }

            else if (ch == '[') {

                stack.push(']');
            }

            // Closing brackets
            else {

                // Invalid sequence
                if (stack.isEmpty()
                        ||
                    stack.pop() != ch) {

                    return false;
                }
            }
        }

        // Stack must be empty
        return stack.isEmpty();
    }
}
