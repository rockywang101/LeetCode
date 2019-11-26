package LeetCode;

/**
 * https://leetcode.com/problems/remove-element/
 *  
 * @author rocky
 */
public class A0027RemoveElement {

    // 一樣的版本，只是移除 System.out.println，這題有趣在要小心處理一些特別的 case，錯了兩次都是沒注意到
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
    // Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Remove Element.
    public int removeElement(int[] nums, int target) {
        
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0] == target ? 0 : 1;
        
        int slow = 0;
        for (int i=1; i<nums.length; i++) {
            // slow 要走到 target 的位置準備被替換
            while (nums[slow] != target && slow < nums.length-1) {
                slow++;
            }
            
            if (i >= slow && nums[i] != target) {
                int tmp = nums[slow];
                nums[slow] = nums[i];
                nums[i] = tmp;
                slow++;
            }
        }
        
        return slow;
    }
    
    public int removeElementV0(int[] nums, int target) {
        
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0] == target ? 0 : 1;
        
        int slow = 0;
        for (int i=1; i<nums.length; i++) {
            
            // slow 要走到 target 的位置準備被替換
            while (nums[slow] != target && slow < nums.length-1) {
                slow++;
//                System.out.println("slow => " + slow);
            }
            
            if (i >= slow && nums[i] != target) {
                int tmp = nums[slow];
                nums[slow] = nums[i];
                nums[i] = tmp;
                slow++;
            }
        }
        
        for (int num : nums)
            System.out.print(num + "  ");
        System.out.println();
        
        return slow;
    }
    
    public static void main(String[] args) {
        A0027RemoveElement obj = new A0027RemoveElement();
//        System.out.println(obj.removeElement(new int[] {3, 2, 2, 3}, 3));
//        System.out.println(obj.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2));
        System.out.println(obj.removeElement(new int[] {2}, 9));
        System.out.println(obj.removeElement(new int[] {9}, 9));
//        System.out.println(obj.removeElement(new int[] {3, 3}, 9));
//        System.out.println(obj.removeElement(new int[] {1, 2, 3, 4}, 9));
    }
}
