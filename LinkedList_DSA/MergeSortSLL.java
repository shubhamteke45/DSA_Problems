/*
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
} */

class Solution
{
    //Function to sort the given linked list using Merge Sort.
    static Node mergeSort(Node head)
    {
        if(head==null || head.next==null){
            return head;
        }
        
        Node temp = split(head);
        Node head2 = temp.next;
        temp.next = null;
        
        Node newHead1 = mergeSort(head);
        Node newHead2 = mergeSort(head2);
        Node finalHead = sort(newHead1, newHead2);
        
        return finalHead;
    }
    
    static Node sort(Node head1, Node head2){
        
        Node merged = new Node(-1);
        Node temp = merged;
        
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        
        return merged.next;
    }
    
    static Node split(Node head){
        Node slow=head;
        Node fast=head;
        
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return slow;
    }
}
