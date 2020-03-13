package LeetCode;

/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * 
 * Runtime: 1 ms, faster than 60.15% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
 * Memory Usage: 41.8 MB, less than 100.00% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
 * 
 * @author rocky
 */
public class A1351_CountNegativeNumbersInASortedMatrix_V1 {

    public int countNegatives(int[][] grid) {

    	int rowIndex = grid.length - 1;
    	
    	int count = 0;
    	int limitIndex = 0;
    	
    	while (rowIndex >= 0) {
    		int i = grid[rowIndex].length - 1;
    		for (; i>=limitIndex; i--)
    			if (grid[rowIndex][i] >= 0)
    				break;
    		
			limitIndex = i + 1; // 下次就不用再走前面已經確定是正數的值
			
    		count += grid[rowIndex].length - i -1;
    		
    		rowIndex--; // 由下往上，一行一行進行處理
    	}
    	
    	return count;
    }
}
