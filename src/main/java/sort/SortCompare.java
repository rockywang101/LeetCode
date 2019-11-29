package sort;

import java.util.Arrays;
import java.util.Random;


public class SortCompare {
    

	public static void main(String[] args) {
	    
	    int numsLength = 72000000;
		
	    int[] nums = createNums(numsLength);

	    for (int i=0; i<30; i++) {
	        
	        int wantIndex = new Random().nextInt(nums.length);
	        int target = nums[wantIndex];
	        System.out.println("find num: " + target);
	        
	        doSearch(nums, target);
	    }
	    
	    int times = (int) (Math.log10(numsLength)/Math.log10(2));
	    System.out.println("log2("+numsLength+") = " + times + " times");
	}
	
	
	private static int[] createNums(int length) {
	    Random random = new Random();
        
        // 產生一個排序過的 array
        int[] nums = new int[length];
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = random.nextInt(2) + 1;
            num = num + n;
            nums[i] = num;
        }
        
        System.out.println("nums length " + length + " created, min value: " + nums[0] + ", max value: " + nums[nums.length-1] + "\n");
        
        return nums;
	}
	
	
    private static void doSearch(int[] nums, int target) {
        
        long beginTime;
        long diffTime;
        int position;
        
        // binarySearch 查找
        beginTime = System.currentTimeMillis();
        position = Arrays.binarySearch(nums, target);
        diffTime = System.currentTimeMillis() - beginTime;
        // 查看結果
        System.out.println("binary search, find at position " + position + ", spent time " + diffTime);
        
        // linearSearch 查找的邏輯
        beginTime = System.currentTimeMillis();
        position = searchInsert(nums, target);
        diffTime = System.currentTimeMillis() - beginTime;
        System.out.println("linear search, find at position " + position + ", spent time " + diffTime);
        
        System.out.println();
    }
    
    
    /**
     * linear search
     * 
     * @param nums
     * @param target
     * @return
     */
    private static int searchInsert(int[] nums, int target) {
        // 找出是否存在
        int position = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                position = i;
                break;
            }
        }       
        return position;
    }
}
