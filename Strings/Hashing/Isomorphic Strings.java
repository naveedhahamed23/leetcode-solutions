/**
 * LeetCode 205 - Isomorphic Strings
 *
 * Problem:
 * Given two strings s and t, determine whether
 * they are isomorphic.
 *
 * Two strings are isomorphic if the characters
 * in s can be replaced to get t while preserving
 * the order of characters.
 *
 * Each character must map to exactly one
 * character, and no two characters may map
 * to the same character.
 *
 * Approach:
 * Two HashMaps
 *
 * 1. Maintain a mapping from s → t.
 * 2. Maintain another mapping from t → s.
 * 3. If either mapping conflicts, return false.
 * 4. Otherwise, build the mappings and continue.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * (At most 256 characters for ASCII.)
 */

import java.util.HashMap;

class Solution {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i);

            // Check mapping from s → t
            if (mapS.containsKey(charS)) {

                if (mapS.get(charS) != charT) {
                    return false;
                }

            } else {

                mapS.put(charS, charT);
            }

            // Check mapping from t → s
            if (mapT.containsKey(charT)) {

                if (mapT.get(charT) != charS) {
                    return false;
                }

            } else {

                mapT.put(charT, charS);
            }
        }

        return true;
    }
}
