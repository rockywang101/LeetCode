package LeetCode;

/**
 * https://leetcode.com/problems/string-compression/
 * 
 * @author rocky
 */
public class A0443_StringCompression {

    public int compress(char[] chars) {

        int i = 0;
        int count = 0;
        int replaceIndex = 0;
        int retCount = 0;
        while (i < chars.length) {
            
            count++;
            while (i+1 < chars.length && chars[i] == chars[i+1]) {
                i++;
                count++;
            }
            
            // because range is only 1 ~ 1000 chars, don't use mode, just use if else
            if (count == 1)
                retCount += 1; // case a
            else if (count >= 2 && count <= 9)
                retCount += 2; // case a2 ~ a9
            else if (count >= 10 && count <= 99)
                retCount += 3; // case a10 ~ a99
            else if (count >= 100 && count <= 999)
                retCount += 4; // case a100 ~ a999
            else
                retCount += 5; // case a1000
            
            // change array content
            char c = chars[i];
            chars[replaceIndex++] = c;
            
            if (count > 1) {
                while (count >= 0) {
                    if (count == 1000) {
                        chars[replaceIndex++] = '1';
                        chars[replaceIndex++] = '0';
                        chars[replaceIndex++] = '0';
                        chars[replaceIndex++] = '0';
                        count = 0;
                    }
                    else if (count >= 100 && count <= 999) {
                        chars[replaceIndex++] = (char) (count / 100 + 48); // '0' int value is 48
                        count = count % 100;
                    }
                    else if (count >= 10 && count <= 99) {
                        chars[replaceIndex++] = (char) (count / 10 + 48);
                        count = count % 10;
                    }
                    else if (count >= 0 && count <= 9) {
                        chars[replaceIndex++] = (char) (count + 48); // notice if this translate is OK
                        count = -1;
                    }
                }
            }
            
            i++;            
        }
        
        return retCount;
    }

    // 留存做個記錄，懂了為什麼這題的讚數 599，負評 1850
    // 因為看範例，以為只是要回傳 int 值而已，原來裡面的 chars 也要真的被變動
    
    public static void main(String[] args) {

        char[] chars = new char[] {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        
        int cnt = new A0443_StringCompression().compress(chars);
        
        for (char c : chars)
            System.out.print(c + " ");
        System.out.println("\n-------");
        System.out.println(cnt);
        
        
    }
}
