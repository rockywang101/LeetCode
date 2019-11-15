package LeetCode;

public class A0007_ReverseInteger {

	// Runtime: 2 ms, faster than 24.19% of Java online submissions for Reverse Integer.
	// Memory Usage: 33.9 MB, less than 9.44% of Java online submissions for Reverse Integer.
	public int reverse(int x) {
    
		boolean isNegative = x < 0;
		if (isNegative)
			x = -x;

		String sx = String.valueOf(x);
		
		char[] charArray = sx.toCharArray();
		char[] reverseCharArray = new char[charArray.length];
		
		int j = 0;
		for (int i = charArray.length - 1; i >= 0; i--) {
			reverseCharArray[j++] = charArray[i];
		}

		try {
			int reverseX = Integer.parseInt(new String(reverseCharArray));
			if (isNegative)
				reverseX = -reverseX;
			
			return (int)reverseX;	
		}
		catch (NumberFormatException e) {
			return 0;
		}
    }
	
	public static void main(String[] args) {
		
		int x = 1534236469;
		
		int r = new A0007_ReverseInteger().reverse(x);
		System.out.println(r);
	}
}
