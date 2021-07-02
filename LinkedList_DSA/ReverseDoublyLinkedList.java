class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

*/
public static Node reverseDLL(Node  head)
{
    if(head == null || head.next == null)
    return head;
    
    Node curr = head, temp = null;
    
    while(curr != null){
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;
        
        curr = curr.prev;
    }
    return temp.prev;
}
