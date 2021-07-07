/*
class Node
{
int data;
Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class GfG 
{
    public static Node rearrange(Node head)
    {
        Node slow=head;
        Node fast=slow.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        Node node1 = head;
        Node node2 = slow.next;
        slow.next = null;
        
        node2 = reverselist(node1);
        
        head = new Node(0);
        
        Node curr = head;
        
        while(node1!=null || node2!=null){
            if(node1!=null){
                curr.next = node1;
                curr = curr.next;
                node1 = node1.next;
            }
            
            if(node2!=null){
                curr.next = node2;
                curr = curr.next;
                node2 = node2.next;
            }
        }
        
        head = head.next;
        return head;
    }
    
    public static Node reverselist(Node node)
    {
        Node prev = null, curr = node, next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        node = prev;
        return node;
    }
}

