package LeetCode;

public class A0007_ReverseInteger {

	public int reverse(int x) {
	    
		boolean isNegative = x < 0;
		if (isNegative)
			x = -x;
		
		int ret = 0;
		while (x > 0) {
		
			System.out.print(x + "\t");
			int pop = x % 10;
			x = x / 10;
			
			ret = ret * 10 + pop;
			
			System.out.print(pop + "\t" + x + "\t" + ret);
			System.out.println();
		}
		
		
		if (isNegative)
			ret = -ret;
		
		return ret;
    }
	
	// Runtime: 2 ms, faster than 24.19% of Java online submissions for Reverse Integer.
	// Memory Usage: 33.9 MB, less than 9.44% of Java online submissions for Reverse Integer.
	public int reverseV1(int x) {
    
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
		
		short x = 357;
		
		int r = new A0007_ReverseInteger().reverse(x);
		System.out.println(r);
		
//		System.out.println(Short.MAX_VALUE); // 32767
//		System.out.println(Short.MIN_VALUE); // -32768
//
//		System.out.println(Integer.MAX_VALUE); // 2147483647
//		System.out.println(Integer.MIN_VALUE); // -2147483648
//		long sum = 1;
//		for (int i=1; i<=31; i++) {
//		    sum = sum * 2;
//			System.out.println(i + "\t" + sum);
//		}
		
	}
}
