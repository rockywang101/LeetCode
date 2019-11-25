package LeetCode;

public class A0014_LongestCommonPrefix {

	// 看了 binary search 的說明後，自己來寫看看
	// 其實第一次 submit 是 1 秒
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Common Prefix.
	// Memory Usage: 36.1 MB, less than 100.00% of Java online submissions for Longest Common Prefix.
	public static String longestCommonPrefix(String[] strs) {
		
		if (strs.length == 0)
			return "";
		
		String word = strs[0];
		int low = 0;
		int high = word.length() - 1;
		
		String prefix = "";
		while (low <= high) {
			int mid = (low + high) / 2;
			String testPrefix = word.substring(0, mid+1);
			boolean isMatched = true;
			for (int i=1; i<strs.length; i++) {
				if (! strs[i].startsWith(testPrefix)) {
					isMatched = false;
					break;
				}
			}
			
			if (isMatched) {
				low = mid + 1;
				prefix = testPrefix;
			}
			else {
				high = mid - 1;
			}
		}
		
		return prefix;
	}
	
	
	// 奇怪不知道早上去哪 copy 到這版，現在找不到了，這版算是最好懂效能也不錯的
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Longest Common Prefix.
	// Memory Usage: 37.9 MB, less than 80.70% of Java online submissions for Longest Common Prefix.
	public static String longestCommonPrefixV2(String[] strs) {
	    
		if (strs.length == 0) 
	    	return "";
	    
		String prefix = strs[0];
	    
		for (int i = 1; i < strs.length; i++)
	        while(strs[i].indexOf(prefix) != 0)
	            prefix = prefix.substring(0, prefix.length()-1);
	    
	    return prefix;
	}
	
	
	// 錯很多次，而且分數還超差
	// Runtime: 2 ms, faster than 16.23% of Java online submissions for Longest Common Prefix.
	// Memory Usage: 38.1 MB, less than 80.12% of Java online submissions for Longest Common Prefix.
    public static String longestCommonPrefixV1(String[] strs) {
     
    	if (strs.length == 0 || strs[0].length() == 0)
    		return "";
    	
    	StringBuilder sb = new StringBuilder();
    	
    	int idx = 0;
    	boolean isSame = true;
    	while (idx <= strs[0].length()-1) {
    		char c = strs[0].toCharArray()[idx];
    		for (int i=0; i<strs.length; i++) {
    			// 有任一個 string 長度不夠，即停止
    			if (strs[i].length()-1 < idx) {
    				isSame = false;
    				break;
    			}
    			
    			char compareChar = strs[i].toCharArray()[idx];
    			if (c != compareChar) {
    				isSame = false;
    				break;
    			}
    		}
    		
    		if (isSame)
    			sb.append(c);
    		else
    			break;
    		
    		idx++;
    	}
    	
    	return sb.toString();
    }
    
    public static void main(String[] args) {
		String[] strs = new String[] {"leets", "leetcode", "leetc", "leeds"};
		
		String pre = longestCommonPrefix(strs);
		System.out.println("answer: " + pre);
		
		strs = new String[] {"c","acc","ccc"};
		pre = longestCommonPrefix(strs);
		System.out.println("answer: " + pre);
    	
	}
}
