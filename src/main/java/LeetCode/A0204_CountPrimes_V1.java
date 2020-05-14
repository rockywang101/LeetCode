package LeetCode;

/**
 * https://leetcode.com/problems/count-primes/
 * 
 * 先用最簡單的方式，過濾法
 * 
 * http://www.csie.ntnu.edu.tw/~u91029/Prime.html#1  這個網頁很詳盡各種方法可參考
 * 
 * Runtime: 59 ms, faster than 21.46% of Java online submissions for Count Primes.
 * Memory Usage: 44.1 MB, less than 5.66% of Java online submissions for Count Primes.
 * 
 * @author rocky
 */
public class A0204_CountPrimes_V1 {

    public int countPrimes(int n) {

        if (n <= 2)
            return 0;
        
        int[] nums = new int[n+1]; // 直接拿 index 當數字來操作，array 註記是否為質數
        
        for (int i=2; i<n; i++) {
            
            if (nums[i] == -1)
                continue;
            
            int times = 2;
            int target = i * times;
            while (target < n) {
                nums[target] = -1; // 被標記為非質數
                target = i * ++times;
            }
        }

        int count = 0;
        for (int i=2; i<n; i++) {
            if (nums[i] == 0) {
                count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        new A0204_CountPrimes_V1().countPrimes(11);
    }
}
