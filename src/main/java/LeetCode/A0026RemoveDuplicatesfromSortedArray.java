package LeetCode;

public class A0026RemoveDuplicatesfromSortedArray {
	
	public int removeDuplicates(int[] nums) {
		
		int i = 0;
		for (int j=1, length=nums.length; j<length; j++) {
			
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		
		return i + 1;
	}
	
	// 錯的，要更動 array 裡前面的值
    public int removeDuplicatesWrong(int[] nums) {
        
    	int cnt = 1;
    	for (int i=0; i<nums.length-1; i++) {
    		if (nums[i] != nums[i+1]) {
    			cnt++;
    		}
    	}
    	
    	return cnt;
    }
    
    
    public static void main(String[] args) {
		int num = new A0026RemoveDuplicatesfromSortedArray().removeDuplicates(new int[] {0, 1, 1, 2, 2, 2, 3, 3, 3, 3});
		System.out.println(num);
	}
}
