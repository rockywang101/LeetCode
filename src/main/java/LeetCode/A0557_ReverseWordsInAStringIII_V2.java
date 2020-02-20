package LeetCode;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 * 
 * Runtime: 2 ms, faster than 99.68% of Java online submissions for Reverse Words in a String III.
 * Memory Usage: 41 MB, less than 21.05% of Java online submissions for Reverse Words in a String III.
 * 
 * @author rocky
 */
public class A0557_ReverseWordsInAStringIII_V2 {

    public String reverseWords(String s) {
        
        if (s == null || s.equals(""))
            return s;

        char[] charArr = s.toCharArray();
        
        int left = 0;
        int right = 0;
        for (char c : charArr) {
            if (c == ' ') {
                reverse(charArr, left, right-1);
                right++;
                left = right;
            }
            else {
                right++;
            }
        }
        
        reverse(charArr, left, right-1); // reverse last one word
        
        return new String(charArr);
    }
    
    private void reverse(char[] charArr, int left, int right) {
        while (left < right) {
            char tmp = charArr[left];
            charArr[left] = charArr[right];
            charArr[right] = tmp;
            left++;
            right--;
        }
    }
    
    public static void main(String[] args) {
        String word = new A0557_ReverseWordsInAStringIII_V2().reverseWords("123 456 789");
        System.out.println(word);
    }
}
