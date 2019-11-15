package LeetCode;

import java.util.Stack;

public class A0020_ValidParentheses {

    public boolean isValid(String s) {
    	
    	int length = s.length();
    	if (length % 2 != 0)
    		return false;
  
    	int top = -1;
    	char brackets[] = new char[length];
    	
    	for (char aChar : s.toCharArray()) {
    		if (aChar == '{' || aChar == '(' || aChar == '[') {
    			brackets[++top] = aChar;
    		}
    		// 不是開始字元，pop 取出取得對應字元比對是否正確
    		else {
    			if (top == -1)
    				return false;
    			char popChar = brackets[top--];
    			if (aChar == '}' && popChar != '{')
    				return false;
    			else if (aChar == ')' && popChar != '(')
    				return false;
    			else if (aChar == ']' && popChar != '[')
    				return false;
    		}
    	}
    	
    	return top == -1;
    }
    
	
    public boolean isValidV1(String s) {
    	
    	if (s.length() % 2 != 0)
    		return false;

    	Stack<Character> stack = new Stack<Character>();
    	
    	for (char aChar : s.toCharArray()) {
    		if (aChar == '{' || aChar == '(' || aChar == '[') {
    			stack.push(aChar);
    		}
    		// 不是開始字元，pop 取出取得對應字元比對是否正確
    		else {
    			if (stack.size() == 0)
    				return false;
    			char popChar = stack.pop();
    			if (aChar == '}' && popChar != '{')
    				return false;
    			else if (aChar == ')' && popChar != '(')
    				return false;
    			else if (aChar == ']' && popChar != '[')
    				return false;
    		}
    	}
    	
    	return stack.isEmpty();
    }
    
}
