/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start = 1;
        int end = n;
        int ans = 0;
        while(start <= end) {
            int mid = start + (end-start)/2;
            int guessNum = guess(mid);
            if(guessNum == -1) {
                end = mid - 1;
            }
            else if(guessNum == 1) {
                start = mid + 1;
            }
            else {
                ans = mid;
                break;
            }
        }
        return ans;
    }
}