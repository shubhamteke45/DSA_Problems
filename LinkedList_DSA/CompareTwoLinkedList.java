/*  Structure of Node
class Node
 {
    char data;
    Node next;
 
    // Constructor to create a new node
    Node(char d) 
    {
       data = d;
       next = null;
    }
 }*/

class GfG
{
    int compare(Node node1, Node node2)
    {
        
      if (node1 == null && node2 == null) {
            return 1;
        }
        while (node1 != null && node2 != null && node1.data == node2.data) {
            node1 = node1.next;
            node2 = node2.next;
        }

        if (node1 != null && node2 != null) {
            return (node1.data > node2.data ? 1 : -1);
        }

        if (node1 != null && node2 == null) {
            return 1;
        }
        if (node1 == null && node2 != null) {
            return -1;
        }
        return 0;
    }
}
