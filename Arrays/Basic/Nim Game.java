/**
 * LeetCode 292 - Nim Game
 *
 * Problem:
 * There is a heap of n stones.
 * Two players take turns removing
 * 1, 2, or 3 stones.
 *
 * The player who removes the last
 * stone wins.
 *
 * Determine whether you can win
 * assuming both players play optimally.
 *
 * Approach:
 * Mathematical Observation
 *
 * If n is a multiple of 4,
 * the first player always loses.
 *
 * Reason:
 * Whatever the first player removes
 * (1, 2, or 3),
 * the second player can remove
 * (3, 2, or 1) respectively,
 * making the total removed in each
 * round equal to 4.
 *
 * Eventually, the first player is
 * forced to take the last multiple of 4
 * and loses.
 *
 * Therefore:
 * - n % 4 == 0  → Lose
 * - Otherwise   → Win
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean canWinNim(int n) {

        return n % 4 != 0;
    }
}
