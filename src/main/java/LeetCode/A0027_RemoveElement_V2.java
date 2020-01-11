package LeetCode;

/**
 * https://leetcode.com/problems/remove-element/
 *  
 * 原來這題我已經做過，但忘了自己有做過，看了 solution 覺得寫的很棒，練習一下
 *  
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
 * Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Remove Element.
 * @author rocky
 */
public class A0027_RemoveElement_V2 {

    public int removeElement(int[] nums, int val) {

    	int x = 0;
    	for (int i=0; i<nums.length; i++) {
    		
    		if (nums[i] != val) {
    			nums[x] = nums[i];
    			x++;
    		}
    	}
    	
    	return x;
    }
    
    public static void main(String[] args) {
        A0027_RemoveElement_V2 obj = new A0027_RemoveElement_V2();
        System.out.println(obj.removeElement(new int[] {2}, 9));
        System.out.println(obj.removeElement(new int[] {9}, 9));
    }
}
