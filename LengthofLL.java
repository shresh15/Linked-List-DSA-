class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}


// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        Node slow=head;
        Node fast=head;
        int flag=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=1;
                break;
            }
        }
        if (flag==1){
            int cnt=1;
            fast=fast.next;
            while(slow!=fast){
                cnt++;
                 fast=fast.next;
            }
            return cnt;
        }
        else return 0;
        // Add your code here.
    }
}