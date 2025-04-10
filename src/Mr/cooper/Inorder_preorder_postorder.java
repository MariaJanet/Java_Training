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
class BinaryTree{
	Node root;
	public Node insert(Node root, int data) {
		if(root == null) {
			return new Node(data);
			
		}
		if(data < root.data) {
			root.left = insert(root.left,data);
		}
		else {
			root.right = insert(root.right,data);
		}
		return root;
	}
	public void inorder(Node root) {
		if(root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data +" ");
		inorder(root.right);
	}
	public void preorder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public void postorder(Node root) {
		if(root == null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
}

public class Inorder_preorder_postorder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		Node root=null;
		int n = s.nextInt();
		for(int i=0;i<n;i++) {
			int val = s.nextInt();
			root = tree.insert(root, val);
		}
		tree.root = root;
		System.out.println("Inorder Traversal:");
		tree.inorder(tree.root);
		System.out.println();
		
		System.out.println("Preorder Traversal:");
		tree.preorder(tree.root);
		System.out.println();
		
		System.out.println("Postorder Traversal:");
		tree.postorder(tree.root);
		System.out.println();

	}

}
