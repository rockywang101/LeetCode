package LeetCode;

/**
 * 第一個比較好懂，但 Map 的排序較耗效能
 * 
 * Runtime: 2 ms, faster than 100.00% of Java online submissions for Sort Characters By Frequency.
 * Memory Usage: 39.2 MB, less than 99.93% of Java online submissions for Sort Characters By Frequency.
 * 
 * @author rocky
 */

public class A0451_SortCharactersByFrequency {

    public String frequencySort(String s) {
        
//        StringBuilder sb = new StringBuilder();
//        Map<Character, Integer> countMap = new HashMap<Character, Integer>();
//        
//        for (char c : s.toCharArray())
//            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
//        
//        countMap.entrySet().stream()
//            .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//            .forEach(e -> {
//                for (int i=0; i<e.getValue(); i++)
//                    sb.append(e.getKey());
//            });
//        
//        return sb.toString();
        
        int[] map = new int[128];
        for (char c : s.toCharArray())
            map[c]++;
        
        char[] res = new char[s.length()];
        int pos = 0;
        while (pos < s.length()) {
            char max = 0;
            for (char c = 0; c < map.length; c++) {
                if (map[c] > map[max])
                    max = c;
            }
            
            int count = map[max];
            for (int i = 0; i < count; i++) {
                res[pos++] = max;
                map[max]--;
            }
        }
        return new String(res);
    }

    
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(new A0451_SortCharactersByFrequency().frequencySort(s));
    }
}
