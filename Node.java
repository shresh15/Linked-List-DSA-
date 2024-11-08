class Node{
   int data;
    Node next;

    Node(int data1){//constructor
        this.data=data1;
        this.next=null;
    }
     static Node  convert(int[] arr){

       Node head=new Node(arr[0]); //head is an object
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
     }

     static int lengthofLL(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        return cnt;
     }

     static int checkIfPresent(Node head,int val){
       Node temp=head;
       while(temp!=null){
        if(temp.data==val) return 1;
        temp=temp.next;
        
       }
       return 0;
     }

     

     public static void main(String[] args){
        int[] arr={2,3,5,6,1};
        
        Node head=convert(arr); // head ekta variable..jar moddhe linked list store hocche
        //TRAVERSAL 
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next; 

        }
        System.out.println();
        int l=lengthofLL(head);
         System.out.println(l);
        int s=checkIfPresent(head,5);
        if(s==1)System.out.println("no present");
        else System.out.println("no. not present");
       
         
     }
}