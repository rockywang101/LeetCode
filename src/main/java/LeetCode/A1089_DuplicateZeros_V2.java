package LeetCode;

/**
 * https://leetcode.com/problems/duplicate-zeros/
 * 
 * 走訪兩次，第一次先算出有多少個元素會被擠出去 array 外
 * 
 * @author rocky
 */
public class A1089_DuplicateZeros_V2 {
    
	/*
[1,0,2,0,3,0,4,0]  fail
	
[0]
[1]
[1,2]
[0,1]
[1,0]
[0,0,0,1]
[1,2,0,0]
[1,0,2,0,3,0,4,0]
[1,0,0,2,0,0,3,0,4,0]
[1,0,2,3,0,4,5,0]
[1,0,0,2,3,0,4,5]
	 */
    public void duplicateZeros(int[] arr) {
    	
    	int count = 0;
    	int left = 0;
    	for (; left<arr.length; left++) {
    		count++;
    		if (arr[left]== 0)
    			count++;

    		if (count >= arr.length)
    			break;
    	}
    	
    	int right = arr.length - 1;
    	while (left < right) {
    		arr[right--] = arr[left];
    		if (arr[left] == 0)
    			arr[right--] = 0;
    		
    		left--;
    	}
    }
}
