//User function Template for Java

/* structure of list Node:

class Node 
{
    int data;
    Node next;
    
    Node(int a)
        {
            data = a;
            next = null;
        }
}

*/

class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        HashSet<Integer> st = new HashSet<Integer>();
        while(head2!=null)
        {
            st.add(head2.data);
            head2 = head2.next;
        }
        
        Node newHead=null, newTail=null;
        
        while(head1!=null)
        {
            if( st.contains(head1.data) )
            {
                if(newHead==null)
                    newHead = newTail = new Node(head1.data);
                else
                {
                    newTail.next = new Node(head1.data);
                    newTail = newTail.next;
                }
            }
            head1 = head1.next;
        }
        
        return newHead;
    }
}
