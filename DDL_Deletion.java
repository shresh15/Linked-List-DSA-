class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
class Solution {
    public Node deleteNode(Node head, int x) {
        Node temp=head;
        Node back=null;
        Node front=null;
        if(head==null) return null;
        int cnt=1;
        while(temp!=null){
            if(cnt==x){
                front=temp.next;
             back=temp.prev;
                break;
                
            }
            else {
                cnt++;
                temp=temp.next;
            }
            
            
        } // while loop
        
        if(back==null && front==null) return null;
        
        if(back==null){
            front.prev=null;
            head=front;
            return head; 
        }
        if(front==null){
            back.next=null;
            return head;
        }
        
         back.next=front;
         front.prev=back;
        // temp.next=null;
        // temp.back=null; written in cpp not in java
        return head;
        
        // code here
    }
}