package LeetCode;

public class A0167_TwoSumII_InputArrayIsSorted {
    
    public int[] twoSum(int[] nums, int target) {
     
        int lastIndex = findLastSmallerIndex(nums, target);
        
        for (int i=0; i<lastIndex; i++) {
            
            int start = i + 1;
            int end = lastIndex;
            int diff = target - nums[i];

            while (start <= end) {
                int middle = (start + end) / 2;
                
                if (nums[middle] == diff)
                    return new int[] {i+1, middle+1};
                
                if (nums[middle] < diff) {
                    start = middle + 1;
                }
                else {
                    end = middle - 1;
                }
            }
        }
        
        return null;
    }
    
    private int findLastSmallerIndex(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int middle = (start + end) / 2;
            
            // 太小，繼續往後找
            if (nums[middle] < target) {
                
                if (middle+1 < nums.length && nums[middle+1] > target)
                    return middle;
                start = middle + 1;
            }
            // 太大，前回找
            else {
                if (middle-1 >= 0 && nums[middle-1] < target)
                    return middle-1;
                end = middle - 1;
            }
        }
        
        return nums.length - 1;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[] {-3,3,4,90};
        
        int[] n = new A0167_TwoSumII_InputArrayIsSorted().twoSum(nums, 0);
        
        System.out.println(n[0] + "  " + n[1]);
    }
}
