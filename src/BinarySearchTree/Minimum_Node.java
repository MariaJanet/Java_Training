package BinarySearchTree;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
}
class minnode{
	Node root;
	public Node insert(Node root,int data) {
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
	public int minnode(Node root) {
		if(root == null) {
			return -1;
		}
		if(root.left == null) {
			return root.data;
		}
		return minnode(root.left);
	}
}
public class Minimum_Node {

	public static void main(String[] args) {
		minnode b = new minnode();
		b.root = b.insert(b.root, 50);
	    b.root = b.insert(b.root, 30);
	    b.root = b.insert(b.root, 20);
	    b.root = b.insert(b.root, 40);
	    b.root = b.insert(b.root, 70);
	    b.root = b.insert(b.root, 60);
	    b.root = b.insert(b.root, 80);
	    
	    int min = b.minnode(b.root);
	    System.out.print(min);

	}

}
