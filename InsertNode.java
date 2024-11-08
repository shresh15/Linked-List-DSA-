import java.util.*;
import java.io.*;
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}


class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        Node temp=head;
         Node newNode=new Node(x);
        if(head==null) // No element
        return newNode;
        else if(head.next==null) // 1 element
        {
            head.next=newNode;
            newNode.next=null;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
       
        temp.next=newNode;
        newNode.next=null;
        // code here
        return head;
    }
}



