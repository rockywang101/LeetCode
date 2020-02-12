package LeetCode;

import java.util.List;

public class A1324_PrintWordsVertically {

    public List<String> printVertically(String s) {
    
        String[] tokens = s.trim().split(" ");
        
        return null;
    }
    
    private String[] splitWords(String s) {
        
        return s.trim().split(" ");
    }
    
    public static void main(String[] args) {
        String string = "a b c d ";
        String[] arr = string.split(" ");
        
        for (String string2 : arr) {
            System.out.println(string2);
        }
        
    }
    
    
}
