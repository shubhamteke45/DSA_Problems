class Solution
{
    
    Node reverseList(Node head)
    {
        
        if(head==null){
            return null;
        }
        
        Node prev = null;
        Node curr = head;
        Node Next = curr.next;
        
        while(curr!=null){
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        
        return prev;
    }
}
