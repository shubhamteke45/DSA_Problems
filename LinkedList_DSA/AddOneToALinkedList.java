/*
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
} 
*/

class Solution
{
    public static Node reverse(Node head) 
    {
        Node prev = null;
        Node current = head;
        Node next;
        
        while (current != null) 
        { 
            next = current.next;     
            current.next = prev;     
            prev = current;           
            current = next;           
        }
        
        return prev; 
    } 

    public static Node addOne(Node head) 
    { 
        head = reverse(head);           
        
        Node current = head;
        int carry = 1;
        
        while(carry!=0)
        {
            current.data += 1;         
            
            if(current.data < 10)return reverse(head);
                
            else current.data = 0;
                
            
            if(current.next == null) break;
                
            else current = current.next;
                
        }
        
        current.next = new Node(1);  
        return reverse(head);
    }
}
