package LeetCode;

public class A0852_PeakIndexInMountainArray {

	public int peakIndexInMountainArray(int[] A) {
	    
    	for (int i=0; i< A.length; i++) {
    		
    		if (A[i] > A[i+1])
    			return i;
    	}
    	
    	throw new RuntimeException("no matched value");
    }
	
	// 初版，linear search
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Peak Index in a Mountain Array.
	// Memory Usage: 39.3 MB, less than 80.00% of Java online submissions for Peak Index in a Mountain Array.
    public int peakIndexInMountainArrayV1(int[] A) {
    
    	for (int i=0; i< A.length; i++) {
    		
    		if (A[i] > A[i+1])
    			return i;
    	}
    	
    	throw new RuntimeException("no matched value");
    }
    
}
