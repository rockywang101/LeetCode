package LeetCode;

public class A0066_PlusOne {
    
    // 這個方法不是真的相加
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
    // Memory Usage: 34.9 MB, less than 99.19% of Java online submissions for Plus One.
    public int[] plusOne(int[] digits) {
        
        // 找到應該進位的 index 位置
        int index = digits.length - 1;
        while (index >= 0 && digits[index] == 9) {
            digits[index] = 0;
            index--;
        }
        
        // 將該進位的地方加 1 並回傳
        if (index >= 0) {
            digits[index] += 1;
            return digits;  
        }
        // 如果 index 走到 -1，代表是 99 或 999 這樣的數字，最終會變 100 或 1000
        else {
            int[] target = new int[digits.length + 1];
            target[0] = 1;
            return target;
        }
    }
    
    
    // untime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
    // Memory Usage: 35.3 MB, less than 97.58% of Java online submissions for Plus One.
    public int[] plusOneV1(int[] digits) {
        boolean needCarry = false;
        int length = digits.length;
        if (digits[length-1] == 9) {
            digits[length-1] = 0;
            needCarry = true;
        }
        else {
            digits[length-1] = digits[length-1] + 1;
        }

        int i = length - 2;
        while (needCarry && i >= 0) {
            needCarry = false;
            if (digits[i] == 9) {
                digits[i] = 0;
                needCarry = true;
            }
            else {
                digits[i] = digits[i] + 1;
            }
            
            i--;
        }
        
        if (needCarry) {
            int[] newDigits = new int[digits.length+1];
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            newDigits[0] = 1;
            digits = newDigits;
        }
        
        for (int d : digits)
            System.out.print(d + " ");
        System.out.println();
        
        return digits;
    }
    
    
    public static void main(String[] args) {
        int[] digits = new int[] {1,9,9};
        new A0066_PlusOne().plusOne(digits);
    }
}
