/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        if (head==null) return null;
        
        ListNode root = head;
        if(root.next!=null){
            head = reverseList(root.next);
            root.next.next = root;
        }
        root.next = null;
        return head;
    }
}
