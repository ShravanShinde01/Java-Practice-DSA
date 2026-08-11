public class PalendroCheck{

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

      // Find mid of LinkedList
      public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null  && fast.next != null ){
             slow = slow.next;
             fast = fast.next.next;
        }
         return slow;
      }

      // check isPalindrom
      public boolean isPalindrom(){
        if(head == null || head.next == null){
           return true;
        }
        // step 1 : find mid
        Node mid = findMid(head);

        //step 2: reverse second half 
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
          next = curr.next;
          curr.next = prev;
          prev = curr;
          curr = next;
        }

        Node right = prev;  // right half head
        Node left = head;

        // check right half & left half
       while(right != null){
         if(left.data != right.data){
           return false;
         }
           left = left.next;
           right = right.next;
       }

       return true;


      }

       public static void main(String[] Args){

          PalendroCheck ll = new PalendroCheck();

          ll.addFirst(1);
          ll.addLast(2);
          ll.addLast(3);
          ll.addLast(3);
          ll.addLast(2);
          ll.addLast(1);

          ll.printLL();

          System.out.print(ll.isPalindrom());
          
          


       }

}