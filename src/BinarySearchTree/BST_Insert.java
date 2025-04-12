package BinarySearchTree;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
}
class BinaryST{
	Node root;
	public Node insert(Node root,int data) {
		if(root==null) {
			return new Node(data);
		}
		if(data<root.data) {
			root.left=insert(root.left,data);
		}
		else {
			root.right = insert(root.right,data);
		}
		return root;
	}
	public void Inorder(Node root) {
		if (root != null) {
		      Inorder(root.left);
		      System.out.print(root.data + " ");
		      Inorder(root.right);
		    }
	}
	public void preorder(Node root) {
		if(root !=null) {
			System.out.print(root.data+" ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void postorder(Node root) {
		if(root !=null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+" ");
		}
	}
}
public class BST_Insert {

	public static void main(String[] args) {
		BinaryST b = new BinaryST();
	    b.root = b.insert(b.root, 50);
	    b.root = b.insert(b.root, 30);
	    b.root = b.insert(b.root, 20);
	    b.root = b.insert(b.root, 40);
	    b.root = b.insert(b.root, 70);
	    b.root = b.insert(b.root, 60);
	    b.root = b.insert(b.root, 80);

	    System.out.println("Inorder Traversal");
	    b.Inorder(b.root);

	    System.out.println("\nPreOrder Traversal");
	    b.preorder(b.root);

	    System.out.println("\nPostOrder Traversal");
	    b.postorder(b.root);
	}
}
