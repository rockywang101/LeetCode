package LeetCode;


public class A0007_ReverseInteger {

	// Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
	// Memory Usage: 33.7 MB, less than 11.66% of Java online submissions for Reverse Integer.
	public int reverse(int x) {
    	int maxDivide10 = Integer.MAX_VALUE / 10;
		int minDivide10 = Integer.MIN_VALUE / 10;

		int ret = 0;
		while (x != 0) {
			int pop = x % 10; // 取出尾數
			x = x / 10;
			
			ret = ret * 10 + pop;
			if (x > 0 && ret > maxDivide10) {
				return 0;
			}
			else if (x < 0 && ret < minDivide10) {
				return 0;
			}
		}
		
		return ret;
    }
	
	// println 沒拿掉，分數會很差
	// Runtime: 22 ms, faster than 5.10% of Java online submissions for Reverse Integer.
	// Memory Usage: 35.7 MB, less than 5.55% of Java online submissions for Reverse Integer.
	public int reverseV2(int x) {
		System.out.println("input x => " + x);
		
		int ret = 0;
		while (x != 0) {
			int pop = x % 10; // 取尾數
			x = x / 10;
			
			ret = ret * 10 + pop;
			System.out.println(x + "    pop:    " + pop + "    ret:    " + ret);
			
			if (x > 0 && ret > Integer.MAX_VALUE / 10) {
				System.out.println("ret " + ret + " is over, return 0");
				return 0;
			}
			else if (x < 0 && ret < Integer.MIN_VALUE / 10) {
				System.out.println("ret " + ret + " is over , return 0");
				return 0;
			}
		}
		
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
		
		System.out.println(new A0007_ReverseInteger().reverse(0));
		
		System.out.println(new A0007_ReverseInteger().reverse(12345));
		
		System.out.println(new A0007_ReverseInteger().reverse(-12345));
		
		System.out.println(new A0007_ReverseInteger().reverse(2147483647));
		
		System.out.println(new A0007_ReverseInteger().reverse(-2147483648));
	}
}
