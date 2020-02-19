package LeetCode;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * 
 * 這題考的是常識或 google 的能力，能快速找到母音 (vowels) 是哪幾個
 * refs: https://www.quora.com/How-many-vowels-and-consonants-are-there-in-English
 * 
 * Runtime: 2 ms, faster than 98.92% of Java online submissions for Reverse Vowels of a String.
 * Memory Usage: 42 MB, less than 6.90% of Java online submissions for Reverse Vowels of a String.
 * 
 * @author rocky
 */
public class A0345_ReverseVowelsOfAString_V1 {
    
    public String reverseVowels(String s) {
        
        if (s == null)
            return s;
        
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            
            while (! isVowels(arr[left]) && left < arr.length-1)
                left++;
            
            while (! isVowels(arr[right]) && right > 0)
                right--;
            
            if (left >= right)
                break;
            
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
        
        return String.valueOf(arr);
    }
    
    private boolean isVowels(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
