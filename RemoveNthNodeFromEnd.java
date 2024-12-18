//iven the head of a linked list, remove the nth node from the end of the list and return its head.

 public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        if(head==null || head.next==null) return null;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){// Nth node from end is head
            return head.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
       // ListNode delNode=slow.next;
        slow.next=slow.next.next;
        return head;
    }
}