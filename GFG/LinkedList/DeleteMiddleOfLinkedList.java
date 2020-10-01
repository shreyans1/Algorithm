package GFG.LinkedList;

public class DeleteMiddleOfLinkedList {

    Node deleteMid(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        Node temp = head;
        int i = 0;
        while(temp!=null)
        {
            i++;
            temp = temp.next;
        }

        int mid = i/2;
        temp = head;
        for(int k = 0 ; k < mid-1 ; k++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}

class Node {
    int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
