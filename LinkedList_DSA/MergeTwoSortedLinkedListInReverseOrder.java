/* Structure of the node*/
/* class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
} */

class GfG
{
    Node mergeResult(Node node1, Node node2)
    {
	    	if(node1==null){
	    	    return node2;
	    	}
	    	if(node2==null){
	    	    return node1;
	    	}
	    	
	    	if(node1.data>node2.data){
	    	    Node temp=node1;
	    	    node1=node2;
	    	    node2=temp;
	    	}
	    	
	    	Node res=node1;
	    	while(node1!=null && node2!=null){
	    	    Node temp = null;
	    	    while(node1!=null && node1.data<=node2.data){
	    	        temp = node1;
	    	        node1 = node1.next;
	    	    }
	    	    temp.next = node2;
	    	    Node tmp = node1;
	    	    node1=node2;
	    	    node2=tmp;
	    	}
	    	
	    	Node prev=null;
	    	Node curr=res;
	    	Node Next=null;
	    	
	    	while(curr!=null){
	    	    Next = curr.next;
	    	    curr.next=prev;
	    	    prev=curr;
	    	    curr=Next;
	    	}
	    	
	    	return prev;
    }
}
