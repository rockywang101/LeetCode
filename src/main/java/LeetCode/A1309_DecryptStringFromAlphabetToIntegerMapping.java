package LeetCode;

/**
 * https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Decrypt String from Alphabet to Integer Mapping.
 * Memory Usage: 38 MB, less than 100.00% of Java online submissions for Decrypt String from Alphabet to Integer Mapping.
 * 
 * @author rocky
 */
public class A1309_DecryptStringFromAlphabetToIntegerMapping {

    public String freqAlphabets(String s) {
        
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        for (int i=0; i<charArray.length; i++) {
            // case of 10# ~ 26#
            if (i+2 <= charArray.length-1 && charArray[i+2] == '#') {
                /*
                 10# -> 'j' -> 106 -> 96 + 10
                 11# -> 'j' -> 107 -> 96 + 11
                 ...
                 26# -> 'z' -> 122 -> 96 + 26
                 */
                int num = Character.getNumericValue(charArray[i]) * 10 + Character.getNumericValue(charArray[i+1]);
                sb.append((char) (96 + num));
                i = i + 2;
            }
            // case of 0 ~ 9 
            else {
                // 'a' = 97, '1' = 49, add 48 to let '1' become 'a'   (2 become 'b'... 3 become 'c'
                sb.append((char) (charArray[i] + 48)); 
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println('j' + 0); // to see 'j' int value
    }
}
