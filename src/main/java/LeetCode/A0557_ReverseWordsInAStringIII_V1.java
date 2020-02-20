package LeetCode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * 
 * Runtime: 8 ms, faster than 45.67% of Java online submissions for Reverse Words in a String III.
 * Memory Usage: 42 MB, less than 8.77% of Java online submissions for Reverse Words in a String III.
 * 
 * @author rocky
 */
public class A0557_ReverseWordsInAStringIII_V1 {

    public String reverseWords(String s) {
        
        if (s == null || s.equals(""))
            return s;
        
        List<String> wordList = new LinkedList<String>();
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {

            if (c == ' ') {
                wordList.add(sb.toString());
                sb = new StringBuilder();
            }
            else {
                sb.append(c);
            }
        }
        
        if (sb.length() > 0)
            wordList.add(sb.toString());

        sb = new StringBuilder();
        for (String word : wordList) {

            char[] chars = word.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left < right) {
                char tmp = chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
            
            sb.append(chars).append(' ');
        }
        
        return sb.substring(0, sb.length()-1);
    }
}
