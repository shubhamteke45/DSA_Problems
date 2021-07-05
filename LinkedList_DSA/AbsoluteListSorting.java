/* The structure of the node of the Linked List is
class Node
{
   int data;
   Node next;
   Node(int d) {data = d; next = null; }
 }
*/

class GfG
{
	Node sortList(Node head) {
		Node prev=head;
		Node curr=head.next;
		
		while(curr!=null){
		    if(curr.data<prev.data){
		        prev.next = curr.next;
		        curr.next = head;
		        head = curr;
		        curr = prev;
		    }
		    else{
		        prev=curr;
		    }
		    curr = curr.next;
		}
		
		return head;
	}
}
