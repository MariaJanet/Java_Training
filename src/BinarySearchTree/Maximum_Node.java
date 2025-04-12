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
class MaximumNode{
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
	public int max(Node root) {
		if(root == null) {
			return -1;
		}
		if(root.right == null) {
			return root.data;
		}
		return max(root.right);
	}
}

public class Maximum_Node {

	public static void main(String[] args) {
		MaximumNode b = new MaximumNode();
	    b.root = b.insert(b.root, 50);
	    b.root = b.insert(b.root, 30);
	    b.root = b.insert(b.root, 20);
	    b.root = b.insert(b.root, 40);
	    b.root = b.insert(b.root, 70);
	    b.root = b.insert(b.root, 60);
	    b.root = b.insert(b.root, 80);
	    
	    int maxValue = b.max(b.root);
        System.out.println("Maximum node value in the BST is: " + maxValue);

	}

}
