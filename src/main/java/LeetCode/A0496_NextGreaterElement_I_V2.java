package LeetCode;

/**
 * https://leetcode.com/problems/next-greater-element-i/
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Next Greater Element I.
 * Memory Usage: 36.8 MB, less than 100.00% of Java online submissions for Next Greater Element I.
 * @author rocky
 */
public class A0496_NextGreaterElement_I_V2 {

    // 這題最難的是了解題目到底在說什麼呀
    
    // 這個版本是網路上看到的，submit 會通過，但其實題目並沒有說過數字不會超過 10000，也沒說一定是正數
    // 所以其實 test case 裡的數字超過 10000 時就會報錯了，或是負數，也會報錯
    // 並不可取，且並不好懂，所以以此版改良，產生 V3
    
    // 並且 new int[] 若是大數時，其實效能很差
    // new int[10001] 時效能是 faster than 100%
    // 但當 new int[1000001] 
    // Runtime: 2 ms, faster than 97.21% of Java online submissions for Next Greater Element I.
    // Memory Usage: 37.1 MB, less than 100.00% of Java online submissions for Next Greater Element I.
    // 但當 new int[10000001] 
    // Runtime: 119 ms, faster than 5.89% of Java online submissions for Next Greater Element I.
    // Memory Usage: 77.2 MB, less than 7.41% of Java online submissions for Next Greater Element I.
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] array = new int[10001]; // 10001 就可以過
//        int[] array = new int[Integer.MAX_VALUE]; // Memory Limit Exceeded 
        
        if (nums2.length > 0)
            array[nums2[nums2.length - 1]] = -1;

        for (int i = nums2.length - 2, j; i >= 0; i--) {
            j = i + 1;
            while (nums2[j] < nums2[i]) {
                j = array[nums2[j]];

                if (j < 0)
                    break;
            }
            array[nums2[i]] = j;
        }

        int[] res = new int[nums1.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
            if (array[nums1[i]] >= 0)
                res[i] = nums2[array[nums1[i]]];
        }
        return res;
    }
    
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }
    
}
