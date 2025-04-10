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
class BT{
	Node root;
	public Node insert(Node root,int data) {
		if(root == null ) {
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
	public int leftnode(Node root) {
		if(root == null) {
			return 0;
		}
		int sum =0;
		if(root.left != null) {
			sum += root.left.data;
		}
		sum += leftnode(root.left);
		sum += leftnode(root.right);
		return sum;
	}
}
public class sum_of_left_node {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BT b = new BT();
		Node root = null;
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int val = s.nextInt();
			b.root = b.insert(b.root, val);
		}
		int sum = b.leftnode(b.root);
		System.out.println("Sum of nodes:" +sum);

	}

}
