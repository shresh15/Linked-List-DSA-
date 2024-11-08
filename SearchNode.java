// Given a linked list of n nodes and a key , the task is to check if the key is present in the linked list or not.
 //GFG
 
 Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}

class Solution {
    static boolean searchKey(int n, Node head, int key) {
        Node temp=head;
        int flag=0;
        while(temp.next!=null){
            if (temp.data==key) {flag=1; break;}
            temp=temp.next;
        }
        if(flag==1) return true;
        else return false;
        
    }
}