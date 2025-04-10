package Linked_List_Question;
class DNode{
	int data;
	DNode next;
	DNode prev;
	DNode(int data){
		this.data = data;
		this.next=null;
		this.prev=null;
	}
}
public class Doubly_Reverse {
	DNode head,tail;
	public void insert(int data) {
		DNode newnode = new DNode(data);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}
		else {
			tail.next = newnode;
			newnode.prev = tail;
			tail = newnode;
		}
	}
	public void display() {
		DNode temp=head;
		while(temp !=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public DNode reverse(DNode curr) {
		if(curr == null) {
			return null;
		}
		DNode temp = curr.prev;
		curr.prev = curr.next;
		curr.next = temp;
		if(curr.prev == null) {
			return curr;
		}
		return reverse(curr.prev);
	}

	public static void main(String[] args) {
		Doubly_Reverse r = new Doubly_Reverse();
		r.insert(10);
		r.insert(20);
		r.insert(30);
		r.display();
		System.out.print("reversed:");
		r.head = r.reverse(r.head);
		r.display();


	}

}
