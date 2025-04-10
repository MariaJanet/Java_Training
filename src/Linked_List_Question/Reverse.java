package Linked_List_Question;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next=null;
	}
}
public class Reverse {
	Node head,tail;
	public void insert(int data) {
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}
		else {
			tail.next = newnode;
			tail = newnode;
		}
	}
	public void display() {
		Node temp=head;
		while(temp !=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void rev() {
		Node prev=null;
		Node current = head;
		Node next = head.next;
		while(current!=null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head = prev;
		
	}

	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.insert(10);
		r.insert(20);
		r.insert(30);
		r.display();
		System.out.print("reversed:");
		r.rev();
		r.display();

	}

}
