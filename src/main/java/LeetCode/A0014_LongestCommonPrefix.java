package LeetCode;

public class A0014_LongestCommonPrefix {

	// 看了解答，發現這題竟然也是 binary search !
	
	// 錯很多次，而且分數還超差
	// Runtime: 2 ms, faster than 16.23% of Java online submissions for Longest Common Prefix.
	// Memory Usage: 38.1 MB, less than 80.12% of Java online submissions for Longest Common Prefix.
    public static String longestCommonPrefix(String[] strs) {
     
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
		String[] strs = new String[] {"a"};
		
		String pre = longestCommonPrefix(strs);
		System.out.println(pre);
    	
	}
}
