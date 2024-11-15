class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}

class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        Node zerohead=new Node(-1);
        Node onehead=new Node(-1);
        Node twohead=new Node(-1);
        Node one=onehead;
        Node zero=zerohead;
        Node two=twohead;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){ zero.next=temp; zero=zero.next;}
            else if(temp.data==1){ one.next=temp; one=one.next;}
            else{ two.next=temp; two=two.next;}
            temp=temp.next;
            
        }
        
        //zero.next= (onehead.next)? onehead.next: twohead.next;
        if(onehead.next!=null) zero.next=onehead.next;
        else zero.next=twohead.next;
        one.next=twohead.next;
        two.next=null;
        return zerohead.next;
        
    }
}