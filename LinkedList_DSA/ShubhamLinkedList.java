package linkedList;

public class ShubhamLinkedList {

	Node head;
	int size;
	
	static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	
	//add new node in linked list
	public void add(int data) {
		Node toAdd = new Node(data);
		Node temp = head;
		if(isEmpty()) {
			head = toAdd;
			size++;
			return;
		}
		else {
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = toAdd;
		}
		size++;
	}
	
	//show all the elements present in the linked list
	public void show() {
		if(isEmpty()) {
			System.out.println("Linked List is Empty!!!!");
			return;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				System.out.print(temp.data+"--->");
				temp = temp.next;
			}
			System.out.print(temp.data);
		}
		
		System.out.println();
	}
	
	//get the element of specific position
	int get(int position) {
		int elm=-1;
		int cn=0;
		if(isEmpty()) {
			System.out.println("Linked List is Empty");
		}
		else if(position>size){
			throw new ElementOutOfSize("tried to access element out of size");
		}
		else {
			if(position==1) {
				elm=head.data;
			}
			else {
				Node temp = head;
				while(cn<position-1) {
					temp = temp.next;
					cn++;
				}
				elm = temp.data;
			}
		}
		return elm;
	}
	
	void remove(int position) {
		if(isEmpty()) {
			System.out.println("Linked List is Empty");
			return;
		}
		else if(head.next==null && position==1) {
			head=null;
		}
		else if(position>size){
			throw new ElementOutOfSize("tried to access element out of size");
		}
		else if(position == size) {
			Node temp=head;
			while(temp.next!=null) {
				temp =temp.next;
			}
			temp.next=null;
			
		}
		else {
			int cn=0;
			Node temp=head;
			while(cn<position-1) {
				temp = temp.next;
			}
			temp.data = (temp.next).data;
			temp.next = (temp.next).next;
			
		}
		size--;
	}
	
	void insert(int data, int position) {
		Node toAdd = new Node(data);
		if(isEmpty()) {
			head = toAdd;
			size++;
			return;
		}
		else if(position>size){
			throw new ElementOutOfSizeForInseration("position for inseration not valid");
		}
		else if(position == size) {
			Node temp=head;
			while(temp.next!=null) {
				temp = temp.next;
			}
			Node temp1 = temp.next;
			temp.next = toAdd;
			toAdd.next = temp1;
		}
		else {
			int cn=1;
			Node temp=head;
			while(cn<position-1) {
				temp = temp.next;
			}
			Node temp1 = temp.next;
			temp.next = toAdd;
			toAdd.next = temp1;
		}
		size++;
	}
	
	//return linked list is empty or not
	boolean isEmpty() {
		if(head==null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//reverse given linked list
	void reverse() {
		Node prev = null;
		Node curr = head;
		Node Next = null;
		if(isEmpty()) {
			System.out.println("Linked List is empty");
			return;
		}
		else if(head.next == null) {
			return;
		}
		else {
			while(curr!=null) {
				Next = curr.next;
				curr.next = prev;
				prev = curr;
				curr = Next;
			}
		}
		head = prev;
		
	}
	
	//return the size of linked list
	int size() {
		if(isEmpty()) {
			size=0;
		}
		return size;
	}
	
	public static void main(String[] args) {
		

	}
}

//throw user defined exception
class ElementOutOfSize extends RuntimeException{
	ElementOutOfSize(String s){
		super(s);
	}
}

class ElementOutOfSizeForInseration extends RuntimeException{
	ElementOutOfSizeForInseration(String s){
		super(s);
	}
}
