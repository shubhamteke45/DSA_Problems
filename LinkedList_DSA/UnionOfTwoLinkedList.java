/*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    Node cur=null,start=null;
        
        TreeSet<Integer> s = new TreeSet<Integer>();        
        
        
        while(head1!=null)
        {
            
            s.add(head1.data);
            head1=head1.next;
        }
        while(head2!=null)
        {
            
            s.add(head2.data);
            head2=head2.next;
        }
        for(Integer i : s)
        { 
            Node ptr=new Node(i);
            if(start==null)
            {
                
                start=ptr;
                cur=ptr;
            }
            else
            {
                
                cur.next=ptr;
                cur=ptr;
            }
        }
        return start;
	
	}
}
