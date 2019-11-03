package LeetCode;

import java.util.LinkedList;
import java.util.List;

public class A0283_MoveZeroes {

	/**
	 * @param nums
	 */
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
	// Memory Usage: 37.4 MB, less than 100.00% of Java online submissions for Move Zeroes.
	// 其實記憶體沒有用的比較少，這版第一次用了 38.4 MB，再 submit 一次就變 37.4 MB
    public void moveZeroes(int[] nums) {
    	
    	int pointer = 0;
    	for (int i=0; i<nums.length; i++) {
    		
    		if (nums[i] != 0) {
    			
    			if (pointer != i) {
    				nums[pointer] = nums[i];
    				nums[i] = 0;
    			}
    			pointer++;
    		}
    	}
    }
	
	/**
	 * 這版有點繞圈了
	 * @param nums
	 */
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Move Zeroes.
	// Memory Usage: 38.1 MB, less than 81.82% of Java online submissions for Move Zeroes.
    public void moveZeroesV2(int[] nums) {
    	
    	int pointer = 0;
    	for (int i=0; i<nums.length; i++) {
    		
    		if (nums[i] != 0 && nums[pointer] == 0 && pointer != i) {
    			nums[pointer] = nums[i]; // pointer 與 i 的值互換
    			nums[i] = 0; // 要設成 nums[pointer] 的值，其實就是 0 
    			pointer++;
    		}
    		else if (nums[i]== 0 && nums[pointer] != 0) {
    			pointer = i;
    		}
    	}
    }
	
	/**
	 * 有點取巧的意味，因為題目說不能有一個 copy 的 array
	 * 但沒說到不能用另一個 list 來記錄
	 * @param nums
	 */
	// Runtime: 1 ms, faster than 18.61% of Java online submissions for Move Zeroes.
	// Memory Usage: 38.6 MB, less than 78.32% of Java online submissions for Move Zeroes.
    public void moveZeroesV1(int[] nums) {
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
