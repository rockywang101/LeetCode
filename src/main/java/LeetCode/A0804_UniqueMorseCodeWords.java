package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://leetcode.com/problems/unique-morse-code-words/
public class A0804_UniqueMorseCodeWords {

	public static void main(String[] args) {
		
		String[] letters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

		for (String letter : letters) {
			System.out.println(letter);
			for (char single : letter.toCharArray()) {
				System.out.println((int)single);
			}
		}
	}

	// 第一名的 1ms 答案拿來貼上也是 2ms，應該是先前案例較少，測到可以有 1ms 的
	
	/**
	 * 初版改良，想到不需要再轉成 map，因為位置都是相對應的，直接用 array 取值就好了
	 * @param words
	 * @return
	 */
	// Runtime: 2 ms, faster than 78.41% of Java online submissions for Unique Morse Code Words.
	// Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Unique Morse Code Words.
    public int uniqueMorseRepresentations(String[] words) {
        
    	String[] tableFor26letters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    	// 用 Set 過濾掉重覆的轉換過後的 morseRepresentation
    	Set<String> morseWords = new HashSet<String>();
    	for (String word : words) {
    		StringBuffer morseWord = new StringBuffer();
    		for (char c : word.toCharArray())
    			morseWord.append(tableFor26letters[c - 'a']);
    		morseWords.add(morseWord.toString());
    	}
    	
    	return morseWords.size();
    }
	
	
	
	/**
	 * 最初版，不考量效能，先以最容易實作為前題
	 * @param words
	 * @return
	 */
	// Runtime: 2 ms, faster than 78.41% of Java online submissions for Unique Morse Code Words.
	// Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Unique Morse Code Words.
    public int uniqueMorseRepresentationsV1(String[] words) {
        
    	String[] tableFor26letters = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    	// 組出字母與 morse 符號對應表
    	Map<String, String> mapping = new HashMap<String, String>();
    	for (int i=0; i<26; i++) {
    		char ch = (char) (97 + i);
    		mapping.put(String.valueOf(ch), tableFor26letters[i]);
    	}

    	// 用 Set 過濾掉重覆的轉換過後的 morseRepresentation
    	Set<String> morseWords = new HashSet<String>();
    	for (String word : words) {
    		StringBuffer morseWord = new StringBuffer();
    		for (char c : word.toCharArray()) {
    			String morse = mapping.get(String.valueOf(c));
    			morseWord.append(morse);
    		}
    		morseWords.add(morseWord.toString());
    	}
    	
    	return morseWords.size();
    }
}
