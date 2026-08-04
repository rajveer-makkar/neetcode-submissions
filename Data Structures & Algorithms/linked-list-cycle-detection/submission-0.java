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
    public boolean hasCycle(ListNode head) {
        // ListNode slow = head, fast = head;
        // while(fast!=null && slow!=null){
        //     if(fast==slow) return true;
        //     if (fast==null || slow==null) return false;
        //     fast = fast.next.next;
        //     slow = slow.next;
        // }
        HashSet<ListNode> seen = new HashSet<>();
        ListNode cur = head;
        while(cur!=null) {
            if(seen.contains(cur)) return true;
            seen.add(cur);
            cur=cur.next;
        }

        return false;
    }
}
