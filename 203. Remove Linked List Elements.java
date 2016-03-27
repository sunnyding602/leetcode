/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode cur = head;
        ListNode prev = null;
        while(cur!=null){
            if(cur.val == val){
                if(prev == null && cur.next == null){
                    return null;
                }else if(prev == null && head == cur){
                    head = head.next;
                    cur = cur.next;
                    continue;
                }else{
                    prev.next = cur.next;
                    cur = cur.next;
                    continue;
                }
            }
            
            prev = cur;
            cur = cur.next;
            
            
        }
        return head;
    }
}
