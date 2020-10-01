package GFG.LinkedList;

public class InsertInSortedLinkedList {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        if(key<head1.data)
        {
            Node x = new Node(key);
            x.next = head1;
            return x;
        }
        else
        {
            Node temp = head1;
            while(key>temp.next.data)
            {
                temp = temp.next;

                if(temp.next==null)
                break;
            }

            if(temp.next==null)
            {
                Node x = new Node(key);
            temp.next = x;
            }

            else{
            Node n = temp.next;
            Node x = new Node(key);
            temp.next = x;
            x.next = n;
            }

            return head1;
        }
    }
}

class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
