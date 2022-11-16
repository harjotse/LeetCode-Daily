
 
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

      public class Solution extends GuessGame {
        public int guessNumber(int n) {
            for (int i = 1; i < n; i++)
                if (guess(i) == 0)
                    return i;
            return n;
        }
    }

    //
    /* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

// approach 2 Actual done 
// binary search 
// q is very simple 
// 1 to n is range ok
// now just send mid in guess and it will give -1 1 acc
// do binary search acc to that simple
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
    //https://leetcode.com/problems/guess-number-higher-or-lower/