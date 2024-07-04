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
    public ListNode mergeNodes(ListNode head) {
        ListNode newnode = head.next;
        ListNode nextsum = newnode;
        
        while(nextsum != null){
            int sum = 0;
            while(nextsum.val != 0){
                sum = sum + nextsum.val;
                nextsum = nextsum.next;
            }
            
            newnode.val = sum;
            nextsum = nextsum.next;
            newnode.next = nextsum;
            newnode = newnode.next;
       }
       return head.next;
    }
}
