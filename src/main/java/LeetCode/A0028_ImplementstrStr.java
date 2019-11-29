package LeetCode;

public class A0028_ImplementstrStr {

	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().
	// Memory Usage: 37.5 MB, less than 72.52% of Java online submissions for Implement strStr().
	public int strStr(String haystack, String needle) {
	
		if ("".equals(needle) || needle.equals(haystack))
			return 0;
		
		int haystackLength = haystack.length();
		int needleLength = needle.length();
		if (haystackLength < needleLength)
			return -1;
		
		int threshold = haystackLength - needleLength;
		 
		for (int i=0; i <= threshold; i++) {
			String subHaystack = haystack.substring(i, needleLength+i);
			if (subHaystack.equals(needle))
				return i;
		}
		
		return -1;
	}
	
	
	// Runtime: 185 ms, faster than 9.79% of Java online submissions for Implement strStr().
	// Memory Usage: 37.4 MB, less than 85.50% of Java online submissions for Implement strStr().
    public int strStrV1(String haystack, String needle) {
     
    	if ("".equals(needle) || haystack == needle)
    		return 0;
    	
    	char[] needleChars = needle.toCharArray();
    	char[] haystackChars = haystack.toCharArray();
    	for (int i=0; i< haystackChars.length; i++) {

    		if (haystackChars[i] == needleChars[0]) {
    			boolean isMatch = true;
    			for (int j=1; j<needleChars.length; j++) {
    		
    				if (i+j >= haystackChars.length || haystackChars[i+j] != needleChars[j]) {
    					isMatch = false;
    					break;
    				}
    			}
    			
    			if (isMatch)
    				return i;
    		}
    	}
    	
    	return -1;
    }
    
    public static void main(String[] args) {
    	
    	String haystack = "ippi";
    	String needle = "pi";
    	
    	A0028_ImplementstrStr obj = new A0028_ImplementstrStr();
    	obj.strStr(haystack, needle);
    	
		
    	
	}
}
