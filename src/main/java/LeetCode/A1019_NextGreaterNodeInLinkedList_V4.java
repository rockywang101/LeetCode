package LeetCode;

/**
 * https://leetcode.com/problems/next-greater-node-in-linked-list/
 * 
 * 看懂了為什麼後，用自己想的流程實作出來
 * 重點就是往回找還沒有答案的地方比對填回，V4 與 V3 其實很像，只是有些像是 pt++ 或 pt-- 的我不寫在一起
 * 因為多幾行可以增加程式易讀性，我選擇讓程式容易被維護而不是簡短
 * 
 * Runtime: 3 ms, faster than 100.00% of Java online submissions for Next Greater Node In Linked List.
 * Memory Usage: 39.9 MB, less than 97.30% of Java online submissions for Next Greater Node In Linked List.
 * 
 * @author rocky
 */
public class A1019_NextGreaterNodeInLinkedList_V4 {
    
    /**
     * @param head
     * @return
     */
    public int[] nextLargerNodes(ListNode head) {

        ListNode curr = head;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        
        int[] rtn = new int[size];
        int[] indices = new int[size];
        int[] values = new int[size];
        curr = head;
        int pt = -1; // pointer of empty index
        for (int i=0; i<size; i++) {
            // 往回找，若現在的值比較大，就填回 rtn
            while (pt >= 0 && curr.val > values[pt]) {
                int idx = indices[pt];
                rtn[idx] = curr.val;
                pt--; // 其實意義就是把存下來的 index 與 value 刷掉
            }
            
            pt++;
            indices[pt] = i; // 把目前這個節點的 index 存下來
            values[pt] = curr.val; // 把目前這個節點的數字存下來
            
            curr = curr.next;
        }
        
        return rtn;
    }
}
