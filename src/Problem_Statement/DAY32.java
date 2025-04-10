package Problem_Statement;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next=null;
	}
}
class linkedlist{
	Node head;
	
	void insert(int data) {
		Node newnode = new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
	}
	Node findmidd() {
		if(head==null) {
			return null;
		}
		Node slow=head,fast=head;
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
public class DAY32 {
	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);

		Node mid = list.findmidd();
		if (mid != null) {
		    System.out.println("Middle Element: " + mid.data);
		} else {
		    System.out.println("The list is empty.");
		}

	}
}