class No{
    int data;
    No next;

    No(int data1){//constructor
        this.data=data1;
        this.next=null;
    }
    
    public static void main(String[] args){
        int[] arr={2,5,6,9,1};
        No ob =new No(arr[0]);
        System.out.println(ob.data);
      
    }
}