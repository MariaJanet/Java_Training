package Mr.cooper;
import java.util.*;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
class Trees{
	Node root;
	public Node insert(Node root,int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		if(data < root.data) {
			root.left = insert(root.left,data);
		}
		else {
			root.right = insert(root.right,data);
		}
		return root;
	}
	public int sumofnode(Node root) {
		if(root == null) {
			return 0 ;
		}
		return root.data + sumofnode(root.left) + sumofnode(root.right);
	}
	
}
public class Sum_Of_Node {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Trees t = new Trees();
		Node root = null;
		int n= s.nextInt();
		for(int i =0;i<n;i++) {
			int val = s.nextInt();
			t.root = t.insert(t.root, val);
		}
		int sums = t.sumofnode(t.root);
		System.out.println("sum :" + sums);

	}

}
