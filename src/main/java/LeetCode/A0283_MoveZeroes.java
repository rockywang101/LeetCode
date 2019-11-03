package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class A0283_MoveZeroes {

	/**
	 * 有點取巧的意味，因為題目說不能有一個 copy 的 array
	 * 但沒說到不能用另一個 list 來記錄
	 * @param nums
	 */
	// Runtime: 1 ms, faster than 18.61% of Java online submissions for Move Zeroes.
	// Memory Usage: 38.6 MB, less than 78.32% of Java online submissions for Move Zeroes.
    public void moveZeroes(int[] nums) {
        // 取出非 0 的數字
    	List<Integer> numList = new LinkedList<>();
    	for (int num : nums) {
    		if (num != 0)
    			numList.add(num);
    	}
    	
    	// 填入非零的數字
    	int idx = 0;
    	for (int num : numList)
    		nums[idx++] = num;
    	// 其餘的補上 0 
    	for (int i=idx; i<nums.length; i++) {
    		nums[i] = 0;
    	}
    }
    
}
