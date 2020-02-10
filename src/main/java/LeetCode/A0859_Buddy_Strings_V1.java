package LeetCode;

/**
 * https://leetcode.com/problems/buddy-strings/
 * 
 * @author rocky
 */
public class A0859_Buddy_Strings_V1 {

    public boolean buddyStrings(String A, String B) {

        if (A.length() != B.length())
            return false;
        
        char[] aCharArray = A.toCharArray();
        char[] bCharArray = B.toCharArray();
        
        // find difference
        int firstDiffIndex = 0;
        int secondDiffIndex = 0;
        for (int i=0; i<aCharArray.length; i++) {
            if (aCharArray[i] != bCharArray[i]) {
                firstDiffIndex = i;
                break;
            }
        }
        
        for (int i=firstDiffIndex+1; i<aCharArray.length; i++) {
            if (aCharArray[i] != bCharArray[i]) {
                secondDiffIndex = i;
                break;
            }
        }
        
        if (aCharArray[firstDiffIndex] != bCharArray[secondDiffIndex] || aCharArray[secondDiffIndex] != bCharArray[firstDiffIndex])
            return false;
        
        for (int i=secondDiffIndex+1; i<aCharArray.length; i++) {
            if (aCharArray[i] != bCharArray[i])
                return false;
        }
        
        return secondDiffIndex != 0;
    }
}
