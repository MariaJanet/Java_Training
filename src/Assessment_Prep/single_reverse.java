package Assessment_Prep;
import java.util.*;
class Node{
	int data;
	Node next;
	//tail = head;
	Node(int data){
		this.data = data;
		this.next = null;
		//this.prev = null;
	}
}
class SL{
	Node head,tail;
	public void Insert_End(int data) {
		Node newnode = new Node(data);
		if(tail == null) {
			head = newnode;
			tail = newnode;
		}
		else {
			tail.next = newnode;
			newnode.prev = tail;
			tail = newnode;
		}
	}
	public void rev() {
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		//return head;
	}
	public void disp() {
		Node temp =head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
public class single_reverse {

	public static void main(String[] args) {
		SL s = new SL();
		s.Insert_End(10);
		s.Insert_End(20);
		s.Insert_End(30);
		s.Insert_End(40);
		s.disp();
		System.out.println("After reverse;");

		s.rev();
		s.disp();

	}

}
