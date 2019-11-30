package LeetCode;

public class A0058_LengthofLastWord {

	
	// 反過來想，從後面來
	// Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
	// Memory Usage: 35.8 MB, less than 100.00% of Java online submissions for Length of Last Word.
	public int lengthOfLastWord(String s) {

		int count = 0;
		for (int i=s.length()-1; i>=0; i--) {
			if (s.charAt(i) != ' ') {
				count++;
			}
			else {
				if (count > 0)
					return count;
			}
		}
		
		return count;
    }
	
	// Runtime: 1 ms, faster than 49.30% of Java online submissions for Length of Last Word.
	// Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Length of Last Word.
    public int lengthOfLastWordV1(String s) {
     
        String[] tokens = s.split(" ");
    	
        if (tokens.length == 0)
        	return 0;
        
    	return tokens[tokens.length-1].length();   
    }
    
    public static void main(String[] args) {
		String string = "wwe ";
		int length;
		
		A0058_LengthofLastWord obj = new A0058_LengthofLastWord();
		
		length = obj.lengthOfLastWord(string);
		
		System.out.println(length);
		
	}
}
