package Queue;
import java.util.*;
class Op {
	int a[] = new int[5];
	int front = -1;
	int rear = -1;
	public void push(int data) {
		if(rear == a.length-1) {
			System.out.println("Full");
		}
		else {
			if(front == -1) {
				front =0;
			}
			rear++;
			System.out.println("Elements:");
			a[rear] = data;
		}
	}
	public void pop() {
		if(front == -1 || front>rear) {
			System.out.println("Empty");
		}
		else {
			System.out.println(a[front]);
			front++;
		}
	}
	public void peek() {
		if(front == -1 || front>rear) {
			System.out.println("Empty");
		}
		else {
			System.out.println(a[front]);
		}
	}
	public void rev() {
		if(front == -1 || front>rear) {
			System.out.println("Empty");
		}
		else {
			for(int i=rear;i>=front;i--) {
				System.out.println(a[i]);
			}
		}
	}
	public void disp() {
		if(front == -1 || front>rear) {
			System.out.println("Empty");
		}
		else {
			for(int i =front;i<=rear;i++) {
				System.out.println( a[i]);
			}
		}
	}

}
public class Q{
public static void main(String args[]) {
	Op q = new Op();
	q.push(10);
	q.push(20);
	q.push(30);
	q.push(40);
	//q.pop();
	q.disp();
	System.out.println("Deleted Elements:");
	q.pop();
	System.out.println("Reversed Elements:");
	q.rev();
	
	
	
	
}
}
