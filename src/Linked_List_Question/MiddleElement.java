package Linked_List_Question;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next=null;
	}
}

public class MiddleElement {
	public static int getlength(Node head) {
		int length =0;
		while(head!=null) {
			length++;
			head=head.next;
		}
		return length;
	}
	public static int midindex(Node head) {
		int length = getlength(head);
		int mid_index = (length % 2==0 ? (length/2)-1: length/2);
		while(mid_index>0) {
			head=head.next;
			mid_index--;
		}
		return head.data;
		
	}

	public static void main(String[] args) {
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);
		head.next.next.next.next = new Node(50);
		head.next.next.next.next.next = new Node(60);
		System.out.print(midindex(head));

	}

}
