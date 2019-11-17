package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class A0242_ValidAnagram {
    
	public boolean isAnagram(String s, String t) {
    
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (char c : s.toCharArray()) {
			String s1 = String.valueOf(c);
			Integer cnt = map.get(s1);
			if (cnt != null) {
				map.put(s1, cnt+1);
			}
			else {
				map.put(s1, 1);
			}
		}
		
		for (char c : t.toCharArray()) {
			String s1 = String.valueOf(c);
			Integer cnt = map.get(s1);
			if (cnt == null || cnt == 0) {
				return false;
			}
			else {
				map.put(s1, cnt-1);
			}
		}
		
		for (Integer cnt : map.values()) {
			if (cnt != 0)
				return false;
		}
		
		return true;
    }
}
