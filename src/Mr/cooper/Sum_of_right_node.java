package Mr.cooper;
import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;
	}
}
class Tree{
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
	public int rightsum(Node root) {
		if(root == null) {
			return 0;
		}
		int sum = 0;
		if(root.right != null) {
			sum += root.right.data;
		}
		sum += rightsum( root.left);
		sum += rightsum( root.right);
		return sum;
	}
}
public class Sum_of_right_node {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Tree t = new Tree();
		//Node root = null;
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			int val = s.nextInt();
			t.root = t.insert(t.root,val);
		}
		int sum = t.rightsum(t.root);
		System.out.println("Right sum:" + sum);

	}

}
