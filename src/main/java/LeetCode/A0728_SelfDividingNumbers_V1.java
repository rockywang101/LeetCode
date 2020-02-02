package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers/
 * 
 * char 轉成 int 的數值 =>  int n = '3' - '0'; // n = 3
 *
 * Runtime: 8 ms, faster than 10.69% of Java online submissions for Self Dividing Numbers.
 * Memory Usage: 41.7 MB, less than 6.67% of Java online submissions for Self Dividing Numbers.
 * 
 * @author rocky
 */
public class A0728_SelfDividingNumbers_V1 {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> retList = new LinkedList<Integer>();
        
        for (int num=left; num<= right; num++) {

            if (isSelfDividingNumber(num))
                retList.add(num);
        }
        
        return retList;
    }

    
    private boolean isSelfDividingNumber(int num) {
        
        for (char c : String.valueOf(num).toCharArray()) {
            if (c == '0')
                return false;

            int n = c - '0'; // convert to int digit value
            if (num % n != 0)
                return false;
        }
        
        return true;
    }
}
