package Stack;
class S{
	int a[] = new int[5];
	int top = -1;
	public void push(int data) {
		if(top == a.length-1) {
			System.out.println("Stack Full");
		}
		else {
			
			top++;
			a[top] = data;
		}
	}
	public void pop() {
		if(top == -1) {
			System.out.println("Stack Empty");			
		}
		else {
			System.out.println(a[top]);
			top--;
		}
	}
	public void peek() {
		if(top == -1) {
			System.out.println("Stack Empty");			
		}
		else {
			System.out.println(a[top]);
		}
	}
	public void rev(){
		if(top == -1) {
			System.out.println("Stack Empty");			
		}
		else {
			for(int i=top;i>=0;i--) {
				System.out.println(a[i]);	
			}
		}
	}
	public void disp() {
		if(top == -1) {
			System.out.println("Stack Empty");			
		}
		else {
			for(int i= top;i>=0;i--) {
				System.out.println(a[i]);
			}
		}
	}
}

public class Stacks {
	public static void main(String args[]) {
		S st = new S();
		System.out.println("Elements:");
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.disp();
		System.out.println("Reversed element:");
		st.rev();
		System.out.println("Deleted Elements:");
		st.pop();
		st.pop();
		System.out.println("After deletin:");
		st.disp();
		
	}

}
