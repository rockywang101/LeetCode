package LeetCode;

/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * 
 * time conmplexity: O(N), space complexity: O(N)
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Squares of a Sorted Array.
 * Memory Usage: 42.4 MB, less than 47.56% of Java online submissions for Squares of a Sorted Array.
 * 
 * @author rocky
 */
public class A0977_SquaresOfASortedArray_V1 {

    public int[] sortedSquares(int[] A) {
    	
    	int left = A.length-1; // 先給預設值，以免取不到正數
    	int right = A.length; // 先給一個超過的值，以免 [-1] 這個案例會取不到
    	for (int i=0; i<A.length; i++) {
    		if (A[i] < 0)
    			continue;
    		
    		right = i; // 開始是正數的位置
    		left = i - 1; // 開始是負數的位置
    		break;
    	}

    	int i = 0;
    	int[] retArr = new int[A.length];
    	while (left >= 0 || right < A.length) {
    		if (left < 0) {
    			while (right < A.length) {
    				retArr[i++] = A[right] * A[right];
    				right++;
    			}
    		}
    		else if (right > A.length-1) {
    			while (left >= 0) {
    				retArr[i++] = A[left] * A[left];
    				left--;
    			}
    		}
    		else {
    			// 絕對值後左邊比較小，取左邊
    			if (A[right] > -A[left]) {
    				retArr[i++] = A[left] * A[left];
    				left--;
    			}
    			// 絕對值後右邊比較小，取右邊
    			else {
    				retArr[i++] = A[right] * A[right];
    				right++;
    			}
    		}
    	}
    	
    	return retArr;
    }
    
    public static void main(String[] args) {
		
    	int[] A = new int[] {-1};
    	
    	int[] ans = new A0977_SquaresOfASortedArray_V1().sortedSquares(A);
    	for (int num : ans) {
    		System.out.print(num + "  ");
    	}
	}
}
