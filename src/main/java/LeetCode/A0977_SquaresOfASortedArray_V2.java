package LeetCode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * 
 * time conmplexity: O(N log N), space complexity: O(N)
 * 
 * Runtime: 2 ms, faster than 59.66% of Java online submissions for Squares of a Sorted Array.
 * Memory Usage: 42.1 MB, less than 81.71% of Java online submissions for Squares of a Sorted Array.
 * 
 * @author rocky
 */
public class A0977_SquaresOfASortedArray_V2 {

    public int[] sortedSquares(int[] A) {
    	
    	for (int i=0; i<A.length; i++)
    		A[i] = A[i] * A[i];
    	
    	Arrays.sort(A);
    	
    	return A;
    }
}
