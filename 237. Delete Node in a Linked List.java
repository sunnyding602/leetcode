/**o(n)
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
public class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode prev = null;
        ListNode cur = node;
        ListNode next = node.next;
        while(cur != null && next != null){
            cur.val = next.val;
            prev = cur;
            cur = next;
            next = next.next;
        }
        prev.next = null;
        
    }
}
