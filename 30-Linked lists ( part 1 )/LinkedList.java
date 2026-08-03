public class LinkedList {

   public static class Node {
        int data;
        Node next;

       public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

       public static Node head;
       public static Node tail;
       public static int size;


       public void addFirst(int data){
          // step:1 --> create new Node
          Node newNode = new Node(data);
          size++;

          if(head==null){
             head = tail = newNode;
             return;
          }

          //step:2 --> newNode next = head
             newNode.next = head; // link

          //step:3 --> head=newNode
             head = newNode; 

       }

       public void addLast(int data){
         Node newNode = new Node(data);
         size++;

         if(head==null){
           head = tail = newNode;
           return;
         }
         tail.next = newNode;
         tail = newNode;
       }

       public void printLL(){
         if(head==null){
            System.out.println("LL is empty");
            return;
         }
           Node temp = head;
            
            while(temp != null ){
              System.out.print(temp.data+"->");
              temp = temp.next;
            }
            System.out.println("Null");
       }


       // insert node in middle
        public void addNodeInMiddle(int idx, int data){
         if(idx==0){
          addFirst(data);
          return;
         }

          Node newNode = new Node(data);
          size++;
          Node temp = head;
          int i= 0; 

          while(i < idx-1){
            temp = temp.next;
            i++;
          }
         
         newNode.next = temp.next;
         temp.next = newNode;

       }

       // to remove first node of LL
       public int removeFirst(){
        if(size==0){
          System.out.print("LL is empty");
        }
        else if(size==1){
           int val = head.data;
           head = tail = null;
           size = 0;
           return val;
        }
          int val = head.data;
          head  = head.next;
          size--;
          return val;
       }

       public int removeLast(){
         if(size==0){
           System.out.print("LL is empty");
           return Integer.MIN_VALUE;
         }
         else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
         }

         Node prev = head;
         for(int i=0; i<size-2; i++){
           prev = prev.next;
         }

         int val= prev.next.data;
         prev.next = null;
         tail = prev;
         size--;
         return val;
       }

    public static void main(String[] args) {

      LinkedList ll = new LinkedList();

       ll.printLL();

       ll.addFirst(2);
       ll.printLL();

       ll.addFirst(1);
       ll.printLL();

       ll.addLast(3);
       ll.printLL();

       ll.addLast(5);
       ll.printLL();

       ll.addNodeInMiddle(3,4);
       ll.printLL();


      System.out.println(ll.size);

      ll.removeFirst();
      ll.printLL();

      ll.removeLast();
      ll.printLL();
       
    }
}