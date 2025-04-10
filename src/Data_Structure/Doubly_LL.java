package Data_Structure;
import java.util.*;
class DNode{
	int data;
	DNode next;
	DNode prev;
	DNode(int data){
		this.data = data;
		this.next = null; 
		this.prev = null;
	}
}
class DLL{
	DNode head,tail;
	public void Insert_End(int data) {
		DNode newnode = new DNode(data);
		if(tail == null) {
			head = newnode;
			tail = newnode;
		}
		else{
			tail.next = newnode;
			newnode.prev = tail;
			tail = newnode;
		
		}
	}
	public void insert_beginning(int data) {
		DNode newnode = new DNode(data);
		if(head == null) {
			head = newnode;
			tail = newnode;
		}
		else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}
	public void disp() {
		DNode temp = head;
		while(temp !=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

public class Doubly_LL {
	public static void main(String args[]) {
		DLL d =new DLL();
		d.insert_beginning(10);
		d.insert_beginning(20);
		d.insert_beginning(30);
		d.insert_beginning(40);
		d.Insert_End(50);
		d.Insert_End(60);
		d.Insert_End(70);
		d.disp();
		
	}

}
