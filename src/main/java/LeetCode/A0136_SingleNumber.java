package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class A0136_SingleNumber {
	
	public int singleNumber(int[] nums) {
		// XOR http://www.86duino.com/?p=1411&lang=TW
		
		int result = nums[0];
		for (int i=1; i<nums.length; i++)
			result = result ^ nums[i];
		
		return result;
	}
	
	
	// 7 ms	39.2 MB
	// 比對 Map 有就移除，沒有就放入，取最終剩下的那個
    public int singleNumberV2(int[] nums) {
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
        for (int i=0; i<nums.length; i++) {
        	if (map.containsKey(nums[i])) 
        		map.remove(nums[i]);
        	else
				map.put(nums[i], nums[i]);
        }

        for (Integer num : map.keySet())
        	return num;
        
        throw new RuntimeException("no integer matched");
    }

    // 9 ms	39.6 MB
    // 計算次數，但我忽略了題目提示只跑一次迴圈  
    public int singleNumberV1(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {

        	Integer cnt = map.get(nums[i]);
        	if (cnt == null) {
        		map.put(nums[i], 1);
        	}
        	else {
        		map.put(nums[i], cnt+1);
        	}
        }
        
        for (Integer num : map.keySet()) {
        	if (map.get(num) == 1)
        		return num;
        }
        
        throw new RuntimeException("no integer matched");
    }
}
