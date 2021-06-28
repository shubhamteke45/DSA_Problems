class Gfg {
    Node rotateP (Node head, int p){
        Node pthNode = head, tail = head;
        while(tail.next != null){
            tail = tail.next;
            
            if(--p > 0){
                pthNode = pthNode.next;
            }
        }
        
        tail.next = head;
        head = pthNode.next;
        tail = pthNode;
        pthNode.next = null;
        
        return head;   
    }
}
