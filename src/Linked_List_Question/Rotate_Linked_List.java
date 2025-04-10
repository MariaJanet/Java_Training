package Linked_List_Question;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next=null;
	}
}
public class Rotate_Linked_List {
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
	public void rotate(int k) {
		if (head == null || head.next == null || k == 0) return; 
		int len = 1;
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
			len++;
		}
		temp.next=head;
		k= k%len;
		int newtailposition =len-k;
		 Node newTail = head;
		 for(int i=1;i<newtailposition;i++) {
			 newTail =newTail.next;
		 }
		 head = newTail.next;
		 newTail.next = null;
		
		
	}

	public static void main(String[] args) {
		Rotate_Linked_List r = new Rotate_Linked_List();
		r.insert(10);
		r.insert(20);
		r.insert(30);
		r.insert(40);
		r.insert(50);
		r.insert(60);
		r.display();
		System.out.print("rotation:");
		r.rotate(2);
		r.display();

	}

}
