class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        int cnt=0;
        int flag=0;
        if(head==null) return null;
        Node temp=head;
        while(temp.next!=null && p>0){
            temp=temp.next;
            p--;
        }
         Node newNode= new Node(x);
        if(temp.next==null)
        {
           
           
            newNode.prev=temp;
            temp.next=newNode;
            newNode.next=null;
            return head;
        }
           newNode.next=temp.next;
           temp.next.prev=newNode;
           newNode.prev=temp;
           temp.next=newNode;
         return head;
        
    }
       
        // Your code here
}