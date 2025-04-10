package Data_Structure;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next = null;
	}
}
	class SLL{
		Node head,tail;
		public void Insert_end(int data) {
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
		public void Insert_beginning(int data) {
			Node newnode = new Node(data);
			if(head == null) {
				head = newnode;
				tail = newnode;
			}
			else {
				newnode.next = head;
				head = newnode;
			}
		}
		public void disp()
		{
			Node temp = head;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		
	}
	


public class Singly_Linked_List {
	public static void main(String args[]) {
		SLL s = new SLL();
		s.Insert_beginning(10);	
		s.Insert_beginning(20);	
		s.Insert_beginning(30);	
		s.Insert_beginning(40);	
		s.Insert_end(50);
		s.Insert_end(60);
		s.Insert_end(70);
		s.disp();
		
		
	}

}
