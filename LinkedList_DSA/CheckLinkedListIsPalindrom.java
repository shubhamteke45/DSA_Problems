/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        Node prev=null;
        Node curr=slow.next;
        Node Next=null;
        while(curr!=null){
            Next=curr.next;
            curr.next = prev;
            prev=curr;
            curr=Next;
        }
        slow.next = prev;
        slow = slow.next;
        
        while(slow!=null){
            if(slow.data!=head.data){
                return false;
            }
            slow = slow.next;
            head = head.next;
        }
        
        return true;
    }    
}

