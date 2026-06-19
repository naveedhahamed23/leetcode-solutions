/**
 * LeetCode 1732 - Find the Highest Altitude
 *
 * Problem:
 * A biker starts at altitude 0. Given an array gain,
 * where gain[i] represents the net altitude change
 * between consecutive points, return the highest
 * altitude reached.
 *
 * Approach:
 * Prefix Sum
 *
 * 1. Start from altitude 0
 * 2. Continuously add each altitude gain
 * 3. Track the maximum altitude encountered
 * 4. Return the highest altitude
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public int largestAltitude(int[] gain) {

        int currentAltitude = 0;
        int highestAltitude = 0;

        for (int altitudeGain : gain) {

            currentAltitude += altitudeGain;

            highestAltitude = Math.max(
                    highestAltitude,
                    currentAltitude
            );
        }

        return highestAltitude;
    }
}
