class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        DLLNode temp=head;
        DLLNode front=null;
        DLLNode back=null;
        
        while(temp!=null){
            front=temp.next;
          
           temp.next=back;
           back = temp;
           temp=front;
        }
        return back;
        // Your code here
    }
}