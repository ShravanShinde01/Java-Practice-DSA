public class LinkedListMergeSort {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head of Linked List
    Node head;

    // Find middle
    private Node getMid(Node head) {

        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge two sorted Linked Lists
    private Node merge(Node head1, Node head2) {

        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {

            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } 
            else {
                temp.next = head2;
                head2 = head2.next;
            }

            temp = temp.next;
        }

        // Remaining nodes of head1
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        // Remaining nodes of head2
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // Merge Sort
    public Node mergeSortLL(Node head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find middle
        Node mid = getMid(head);

        // Divide into two lists
        Node rightHead = mid.next;
        mid.next = null;

        // Sort left
        Node newLeft = mergeSortLL(head);

        // Sort right
        Node newRight = mergeSortLL(rightHead);

        // Merge
        return merge(newLeft, newRight);
    }

    // Add at first
    public void addFirst(int data) {

        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // Print Linked List
    public void print() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        LinkedListMergeSort ll = new LinkedListMergeSort();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        System.out.println("Before sorting:");
        ll.print();

        ll.head = ll.mergeSortLL(ll.head);

        System.out.println("After sorting:");
        ll.print();
    }
}