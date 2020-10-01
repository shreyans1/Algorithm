package GFG.LinkedList;

public class Segragate {
    static Node segregate(Node head)
    {
        // add your code here
        int zeros = 0;
        int ones = 0;
        int twos = 0;
        Node temp = head;
        int size = 0;
        while(temp !=null)
        {
            if(temp.data==0) zeros++;
            if(temp.data==1) ones++;
            if(temp.data==2) twos++;

            temp = temp.next;
            
        }
        temp = head;
        while(temp!=null)
        {
            while(zeros>0)
            {
                temp.data = 0;
                temp = temp.next;
                zeros--;

            }
            while(ones>0)
            {
                temp.data = 1;
                temp = temp.next;
                ones--;
                
            }
            while(twos>0)
            {
                temp.data = 2;
                temp = temp.next;
                twos--;
                
            }
        }
        return head;



    }
    
}

class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
