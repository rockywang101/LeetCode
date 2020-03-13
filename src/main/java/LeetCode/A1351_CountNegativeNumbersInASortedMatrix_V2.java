package LeetCode;

/**
 * https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
 * Memory Usage: 42.1 MB, less than 100.00% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
 * 
 * @author rocky
 */
public class A1351_CountNegativeNumbersInASortedMatrix_V2 {

    public int countNegatives(int[][] grid) {

    	int total = 0;
    	for (int i=0; i<grid.length; i++) {
    		int j = 0;
    		for (; j<grid[i].length; j++)
    			if (grid[i][j] < 0)
    				break;
    		
    		total += grid[i].length - j;
    	}
    	
    	return total;
    }
}
