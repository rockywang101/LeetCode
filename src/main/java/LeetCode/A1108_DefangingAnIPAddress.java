package LeetCode;

public class A1108_DefangingAnIPAddress {

	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
	// Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Defanging an IP Address.
    public String defangIPaddr(String address) {
        
    	StringBuffer sb = new StringBuffer();
    	for (char c : address.toCharArray()) {
    		if (c == '.')
    			sb.append("[.]");
    		else 
    			sb.append(c);
    	}
    	
    	return sb.toString();
    }
	
	// Runtime: 2 ms, faster than 48.34% of Java online submissions for Defanging an IP Address.
	// Memory Usage: 34.5 MB, less than 100.00% of Java online submissions for Defanging an IP Address.
    public String defangIPaddrV1(String address) {
       
    	return address.replaceAll("\\.", "[.]");
    }
}
