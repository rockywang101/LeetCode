package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/self-dividing-numbers/
 *
 * mode 取個數，比較轉字串再轉 int 轉來轉去快多了
 * 
 * Runtime: 1 ms, faster than 99.88% of Java online submissions for Self Dividing Numbers.
 * Memory Usage: 37.2 MB, less than 6.67% of Java online submissions for Self Dividing Numbers.
 * 
 * next => https://leetcode.com/problems/perfect-number/
 * 
 * @author rocky
 */
public class A0728_SelfDividingNumbers_V2 {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> retList = new LinkedList<Integer>();
        
        for (int num=left; num<=right; num++) {
            
            if (isSelfDividingNumber(num))
                retList.add(num);
        }
        
        return retList;
    }
    
    
    private boolean isSelfDividingNumber(int num) {
        
        if (num == 0)
            return false;
        
        int n = num;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || num % digit != 0)
                return false;
            
            n = n / 10;
        }
        
        return true;
    }
}
