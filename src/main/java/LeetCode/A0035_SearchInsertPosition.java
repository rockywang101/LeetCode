package LeetCode;

import java.util.Arrays;

public class A0035_SearchInsertPosition {

	
	/**
     * 可參考 Arrays.binarySearch(nums, target);
     * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int searchInsert(int[] nums, int target) {
		
		int low = 0;
		int high = nums.length - 1;
		
		while (low <= high) {
			
			int mid = (low + high) >>> 1;
			int midVal = nums[mid];

			if (midVal > target) {
				high = mid - 1;
			}
			else if (midVal < target) {
				low = mid + 1;
			}
			else {
				return mid;
			}
		}
		
		return low;
	}
	
	
	// 呃，原本只是想先寫個最簡單的一版，還不是 binary search，結果就 100% 了
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
	// Memory Usage: 39 MB, less than 100.00% of Java online submissions for Search Insert Position.
    public int searchInsertV1(int[] nums, int target) {

    	for (int i=0; i<nums.length; i++) {
    		if (nums[i] >= target) 
    			return i;
    	}
    	
    	return nums.length;
    }
    
    
    public static void main(String[] args) {
        int pos = Arrays.binarySearch(new int[] {1, 3, 5, 7, 9, 10} , 7);
        System.out.println(pos);
    }
    
}
