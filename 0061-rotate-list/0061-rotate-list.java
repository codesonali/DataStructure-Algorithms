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
    public ListNode rotateRight(ListNode head, int k) 
    {
        //Edge cases
        if(head==null|| head.next==null || k==0)
            return head;
        
        //step1:Calculate length and find tail
        int len=1;
        ListNode tail=head;

        while(tail.next != null)
        {
            tail=tail.next;
            len++;
        }
        // Step 2: Reduce unnecessary rotations
        k=k%len;
        if(k == 0)
            return head;
        // Step 3: Make the list circular
        tail.next=head;
        // Step 4: Find new tail
        int stepsToNewTail=len-k-1;

        ListNode newTail=head;

        for(int i=0;i<stepsToNewTail;i++)
        {
            newTail=newTail.next;
        }
        // Step 5: Find new head
        ListNode newHead=newTail.next;

        //Step 6 Break the circle
        newTail.next=null;

        return newHead;
    }

}