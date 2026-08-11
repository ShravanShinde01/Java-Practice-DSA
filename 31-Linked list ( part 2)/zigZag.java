public class zigZag{

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

      // zig zag in LL
      public void zigZag(){

         // step : 1 find mid
         Node slow = head;
         Node fast = head;

          while(fast != null && fast.next != null){
               slow = slow.next;
               fast = fast.next.next;
          }
          Node mid = slow;

         // step 2 : reverse 2nd half

         Node curr = mid.next;
         mid.next = null;
         Node prev = null;
         Node next;

         while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
         }

          Node left = head;
          Node right = prev;
          Node nextL; 
          Node nextR;

         //step 3: alter merge - Zigzag merge
         while(left != null && right != null){
             nextL = left.next;
             left.next = right;
             nextR = right.next;
             right.next = nextL;

             left = nextL;
             right = nextR;
         }

      }

       public static void main(String[] Args){

          zigZag ll = new zigZag();

          ll.addFirst(1);
          ll.addLast(2);
          ll.addLast(3);
          ll.addLast(3);
          ll.addLast(2);
          ll.addLast(1);

          ll.printLL();
          ll.zigZag();
          ll.printLL();



          
          
          


       }

} 
