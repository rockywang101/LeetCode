package LeetCode;

/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 * 
 * @author rocky
 */
public class A0680_ValidPalindrome_II {
    
    public boolean validPalindrome(String s) {

        char[] arr = s.toCharArray();
        int left = 0; 
        int right = arr.length - 1;

        int errCnt = 0;
        while (left < right) {
            System.out.println(left + " " + right);
            System.out.println(arr[left]);
            System.out.println(arr[right]);
            if (arr[left] != arr[right]) {
                
                if (errCnt++ > 0)
                    return false;
                
                if (arr[left+1] == arr[right])
                    left++;
                else if (arr[left] == arr[right-1])
                    right--;
                else
                    return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        
//        String s = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        String s = "mgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgm";
        
        boolean b = new A0680_ValidPalindrome_II().validPalindrome(s);
        
        System.out.println(b);
    }
}
