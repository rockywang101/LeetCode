package LeetCode;

/**
 * https://leetcode.com/problems/long-pressed-name/
 * 
 * 概念很簡單，比對相同後，前進到沒有相同的字元後，再往下一個字元比對
 * 
 * 但有些有小心處理，比如 seed vs sed / pyplrz vs ppyypllr
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Long Pressed Name.
 * Memory Usage: 37.6 MB, less than 8.33% of Java online submissions for Long Pressed Name.
 * 
 * @author rocky
 */
public class A0925_LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        
        char[] nameChars = name.toCharArray();
        char[] typedChars = typed.toCharArray();
        
        if (typedChars.length < nameChars.length)
            return false;

        int i = 0, j = 0;
        while (i < nameChars.length) {
            
            if (i >= nameChars.length || j >= typedChars.length || nameChars[i] != typedChars[j])
                return false; // avoid index out of bounds, example: [pyplrz] [ppyypllr]
            
            // 前進直到沒有相同的字元
            int times = 0;
            while (i < nameChars.length - 2 && nameChars[i] == nameChars[i+1]) {
                i++;
                times++;
            }
            
            while (j < typedChars.length - 2 && typedChars[j] == typedChars[j+1]) {
                j++;
                times--;
            }
            
            if (times > 0)
                return false; // case of name: [seed], typed: [sed]
            
            i++;
            j++;
        }
        
        return true;
    }
}
