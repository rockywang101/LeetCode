package LeetCode;

/**
 * https://leetcode.com/problems/delete-node-in-a-linked-list/
 * 
 * 這題最難的應該還是看懂題目說什麼，看了爛遠比讚多，直接看討論後也懂了，真的很爛，我也跟著按了一個爛
 * 
 * 題目意思大概是指 [4, 5, 1, 9], node = 5 的時候
 * method 裡面傳入的參數 node 指的就是 5 這個要被刪掉的 node
 * 因為沒有前後，所以解法就是把自己的值改成下一個的值，把自己偽裝在下一個，指標指向 9
 * 其實有點意味著反而是 1 這個 node 被刪掉了  冏
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
 * Memory Usage: 37 MB, less than 100.00% of Java online submissions for Delete Node in a Linked List.
 * 
 * @author rocky
 */
public class A0237_DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
     
    	ListNode nextNode = node.next;
    	
    	node.val = nextNode.val;
    	node.next = nextNode.next;
    }
}
