/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class gfg
{
        // Function  to split a circular LinkedList
	    void splitList(circular_LinkedList list) {
	        
             Node s=list.head;
             Node f=list.head;
             
             while(f.next.next!=list.head && f.next!=list.head){
                 f = f.next.next;
                 s = s.next;
             }
             
             if(f.next.next==list.head){
                 f = f.next;
             }
             
             list.head1=list.head;
             
             if(list.head.next != list.head){
                 list.head2=s.next;
             }
             
             f.next=s.next;
             s.next=list.head;
	 }
}
