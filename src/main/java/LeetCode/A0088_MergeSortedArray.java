package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class A0088_MergeSortedArray {
    
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
    // Memory Usage: 36.5 MB, less than 100.00% of Java online submissions for Merge Sorted Array.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = 0, j = 0, k = 0;
        int[] tmp = new int[m+n];
        
        while (i < m || j < n) {
            // 代表 nums1 已經沒了
            if (i == m) {
                tmp[k++] = nums2[j++];
            }
            // 代表 nums2 已經沒了
            else if (j == n) {
                tmp[k++] = nums1[i++];
            }
            // 看 nums1 與 nums2 哪個比較小就先取出
            else {
                tmp[k++] = nums1[i] < nums2[j] ? nums1[i++] : nums2[j++];
            }
        }
        
        System.arraycopy(tmp, 0, nums1, 0, m+n);
    }
    
    // Runtime: 2 ms, faster than 10.68% of Java online submissions for Merge Sorted Array.
    // Memory Usage: 37.8 MB, less than 5.94% of Java online submissions for Merge Sorted Array.
    public void mergeV1(int[] nums1, int m, int[] nums2, int n) {
    
        List<Integer> numsList = new ArrayList<Integer>();
        
        for (int i=0; i<m; i++)
            numsList.add(nums1[i]);
        
        for (int i=0; i<n; i++)
            numsList.add(nums2[i]);
        
        numsList = quicksort(numsList);
        
        for (int i=0; i<numsList.size(); i++)
            nums1[i] = numsList.get(i);
    }
    

    private List<Integer> quicksort(List<Integer> numsList) {
        
        if (numsList == null || numsList.size() <= 1)
            return numsList;
        
        if (numsList.size() == 2) {

            if (numsList.get(0) > numsList.get(1)) {
                int tmp = numsList.get(0);
                numsList.set(0, numsList.get(1));
                numsList.set(1, tmp);
            }
            return numsList;
        }
        
        List<Integer> leftList = new ArrayList<Integer>();
        List<Integer> rightList = new ArrayList<Integer>();
        int middleIndex = numsList.size() / 2; // 取最後一個數當 quick sort 的中間值
        int middleNum = numsList.get(middleIndex);

        // 判斷大小往左右丟
        for (int i=0; i<numsList.size(); i++) {
            if (i == middleIndex)
                continue;
            
            if (numsList.get(i) < middleNum)
                leftList.add(numsList.get(i));
            else
                rightList.add(numsList.get(i));
        }
        
        List<Integer> result = quicksort(leftList);
        result.add(middleNum);
        result.addAll(quicksort(rightList));
        
        return result;
    }
    
    
    public static void main(String[] args) {
        
        A0088_MergeSortedArray obj = new A0088_MergeSortedArray();
        
//        int[] nums1 = new int[] {1,2,3,0,0,0};
//        int m = 3;
//        int[] nums2 = new int[] {2,5,6};       
//        int n = 3;
        
        int[] nums1 = new int[] {4, 5, 6, 0, 0, 0};       
        int n = 3;
        int[] nums2 = new int[] {1, 2, 3};
        int m = 3;
        
        
        obj.merge(nums1, m, nums2, n);
    }
}
