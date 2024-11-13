public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null || head.next==null) return true;
        if(head.next.next==null){
            ListNode temp=head;
            if(temp.val==temp.next.val)return true;
            else return false;
        } 
        while(fast.next!=null &&fast.next.next!=null){
            // if(head!=head.next)
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode revhead=reverseLL(slow.next);
        ListNode first=head;
        ListNode second=revhead;
        while(second!=null){
            if(first.val!=second.val){
                reverseLL(second);
                return false;
            }
            second=second.next; first=first.next;
        }
        reverseLL(revhead);
        return true;    
    }
    public ListNode reverseLL(ListNode head){
         if(head==null || head.next==null) return head;
        ListNode newHead=reverseLL(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }

    
}