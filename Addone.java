class Solution {
    public Node addOne(Node head) {
    
        int carry=helper(head);
        if (carry==1){
            Node newNode=new Node(1);
            newNode.next=head;
            head=newNode;
        }
        return head;
    }
    int helper(Node temp){// gives carry in each step
          int z=0;
        if(temp==null) return 1;
        
            int carry=helper(temp.next);
            temp.data=temp.data+carry;
            z=temp.data;
            if(z < 10) {
                return 0;
            }
            temp.data = 0; 
            return 1;
    } // closing helper

    }