package Linked_List_Question;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		this.next=null;
	}
}
public class Remove_Duplicates {
	public static Node duplicates(Node head) {
		if(head==null) return null;
		Node temp=head;
		while(temp.next!=null) {
			if(temp.data==temp.next.data) {
				temp.next = temp.next.next;
			}
			else {
				temp=temp.next;
			}
		}
		return head;
	}
	public static void display(Node head) {
		Node temp=head;
		while(temp !=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		Remove_Duplicates r=new Remove_Duplicates();
		 Node head = new Node(1);
	        head.next = new Node(1);
	        head.next.next = new Node(2);
	        head.next.next.next = new Node(3);
	        head.next.next.next.next = new Node(3);
	        System.out.print("list:");
	        r.display(head);
	        System.out.print("after removing duplicates:");
	        r.duplicates(head);
	        r.display(head);
	        
	        


	}

}
