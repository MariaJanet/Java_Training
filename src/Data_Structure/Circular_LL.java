package Data_Structure;
import java.util.*;
class CNode{
	int data;
	CNode next;
	CNode(int data){
		this.data = data;
		this.next = next;
	}
}
class CLL{
	CNode head,tail;
	public void Insert_End(int data) {
		CNode newnode = new CNode(data);
		if(head == null) {
			head = newnode;
			tail = newnode;
			newnode.next = head;
		}
		else {
			tail.next = newnode;
			tail = newnode;
		}
	}
	public void Insert_Beginning(int data) {
		CNode newnode = new CNode(data);
		if(head == null) {
			head = newnode;
			tail = newnode;
			newnode.next = head;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	public void disp() {
		CNode temp = head;
		while(temp !=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}

public class Circular_LL {
	public static void main(String args[])
	{
		CLL c = new CLL();
		c.Insert_Beginning(10);
		c.Insert_Beginning(20);
		c.Insert_Beginning(30);
		c.Insert_Beginning(40);
		c.Insert_End(50);
		c.Insert_End(60);
		c.Insert_End(70);
		c.disp();
	}
}
