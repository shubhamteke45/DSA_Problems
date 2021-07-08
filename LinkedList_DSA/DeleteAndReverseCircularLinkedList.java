/*class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data=d;next=null;
    }
}*/

class GFG
{
    //This method returns the head of the LL after deleting node with value d.
    public static Node deleteNode(Node head,int d)
    {
        Node temp=head;
        Node prev=null;
        
        if(temp!=null && temp.data==d){
            head = temp.next;
            return head;
        }
        
        while(temp!=null && temp.data!=d){
            prev=temp;
            temp=temp.next;
        }
        
        prev.next = temp.next;
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node Next ;
        do{
            Next = current.next;
            current.next = prev;
            prev = current;
            current = Next;
        }while(current!=node);
        
        node.next = prev;
        node = prev;
        
        return node;
    }
}
