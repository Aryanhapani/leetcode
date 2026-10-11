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
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return head;
        }
        ListNode i = head;
        ListNode j = head.next;

        while (i != null && j != null) {

            if (i.val != j.val) {
                i.next = j;

                i = i.next;


            }

            if (j.next==null){
                i.next = null;



            }


            j = j.next;


        }

        return head;


        
    }
}