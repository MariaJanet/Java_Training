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
class Asce{
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
	public void asec(Node root) {
		if(root == null) {
			return ;
		}
		asec(root.left);
		System.out.print(root.data +" ");
		asec(root.right);
	}
}

public class AscendingOrder_OF_Tree {

	public static void main(String[] args) {
		Asce b = new Asce();
		b.root = b.insert(b.root, 50);
	    b.root = b.insert(b.root, 30);
	    b.root = b.insert(b.root, 20);
	    b.root = b.insert(b.root, 40);
	    b.root = b.insert(b.root, 70);
	    b.root = b.insert(b.root, 60);
	    b.root = b.insert(b.root, 80);
	    
	    b.asec(b.root);
	}
}
