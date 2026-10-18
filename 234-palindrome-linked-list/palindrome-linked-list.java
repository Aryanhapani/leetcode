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
    public ListNode getmid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public ListNode rev(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;

        while(curr != null){
            next=curr.next;

            curr.next=prev;

            prev=curr;
            curr=next;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }

        if(head.next==null){
            return true;
        }

        //find mid

        ListNode list2=getmid(head);

        //create seprate list 1

        ListNode temp=head;

        while(temp.next != list2){
            temp=temp.next;
        }

        temp.next=null;
 

       //rev list2
        ListNode head2=rev(list2);

   //compare two list

        ListNode temp1=head;
        ListNode temp2=head2;

        while(temp1 != null && temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            }else{
                temp1=temp1.next;
                temp2=temp2.next;
            }
        }


        return true;

        
    }
}