package LeetCode;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 * 
 * 這題考的是常識或 google 的能力，能快速找到母音 (vowels) 是哪幾個
 * refs: https://www.quora.com/How-many-vowels-and-consonants-are-there-in-English
 * 
 * 以 array 當 map，但測起來時間差不多，且比較難懂
 * 
 * Runtime: 2 ms, faster than 98.92% of Java online submissions for Reverse Vowels of a String.
 * Memory Usage: 41.4 MB, less than 17.24% of Java online submissions for Reverse Vowels of a String.
 * 
 * @author rocky
 */
public class A0345_ReverseVowelsOfAString_V2 {
    
    public String reverseVowels(String s) {
        
        if (s == null)
            return s;
        
        boolean[] map = new boolean[256];
        map['a'] = true;
        map['e'] = true;
        map['i'] = true;
        map['o'] = true;
        map['u'] = true;
        map['A'] = true;
        map['E'] = true;
        map['I'] = true;
        map['O'] = true;
        map['U'] = true;
        
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            
            while (! map[arr[left]] && left < arr.length-1)
                left++;
            
            while (! map[arr[right]] && right > 0)
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
}
