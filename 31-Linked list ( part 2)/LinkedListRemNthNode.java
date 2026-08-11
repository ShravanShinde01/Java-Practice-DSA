public class LinkedListRemNthNode{
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


       public void addFirst(int data){
          // step:1 --> create new Node
          Node newNode = new Node(data);

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

       public void deleteNthFromEnd(int n){
          // calculate size of ll
          int sz = 0;
          Node temp = head;
          while(temp !=  null){
            temp = temp.next;
            sz++;
          }

          if(n==sz){
            head = head.next;
            return;
          }

          //sz-n
          int i = 1;
          int iToFind = sz-n;
          Node prev = head;

          while(i < iToFind){
              prev = prev.next;
              i++;
          }

          prev.next = prev.next.next;
          return;

       }


       public static void main(String[] Args){

          LinkedListRemNthNode ll = new LinkedListRemNthNode();

          ll.addFirst(1);
          ll.addLast(2);
          ll.addLast(3);
          ll.addLast(4);
          ll.addLast(5);
          ll.addLast(6);

          ll.printLL();
          ll.deleteNthFromEnd(4);
          ll.printLL();

       }

}