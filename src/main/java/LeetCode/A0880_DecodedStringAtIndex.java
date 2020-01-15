package LeetCode;

public class A0880_DecodedStringAtIndex {

    public String decodeAtIndex(String S, int K) {
     
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c : S.toCharArray()) {
            if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                
                String word = sb.toString();
                
                int cnt = Integer.parseInt(String.valueOf(c));
                for (int j=0; j<cnt-1; j++) {
                    for (char wc : word.toCharArray()) {
                        i++;
                        if (i == K) {
//                            System.out.println(sb);
                            return String.valueOf(wc);
                        }
                        sb.append(wc);
                    }
                }
            }
            else {
                i++;
                if (i == K) {
//                    System.out.println(sb);
                    return String.valueOf(c);
                }

                sb.append(c);
            }
        }
        
        return "";
    }
    
    public static void main(String[] args) {
        String s = new A0880_DecodedStringAtIndex().decodeAtIndex("y959q969u3hb22odq595", 222280369);
        
        System.out.println(s);
    }
}
