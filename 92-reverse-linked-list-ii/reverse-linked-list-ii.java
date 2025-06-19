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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode cur=head;
        ListNode prev=null;
        for(int i=0;cur!=null && i<left-1;i++){
            prev=cur;
            cur=cur.next;
        }
        ListNode last=prev;
        ListNode newend =cur;
        
        for(int i=0;cur!=null && i< right-left+1;i++){
            ListNode next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newend.next=cur;
        return head;
    }
}