package BinaryTree;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
}
class BinaryTree{
	Node root;
	public Node insert(Node root,int data) {
		if(root==null) {
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
	public void Inorder(Node root) {
		if(root==null) {
			return;
		}
		Inorder(root.left);
		System.out.print(root.data + " ");
		Inorder(root.right);
	}
	public void Preorder(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data + " ");
		Preorder(root.left);
		Preorder(root.right);
	}
	public void Postorder(Node root) {
		if(root==null) {
			return;
		}
		Postorder(root.left);
		Postorder(root.right);
		System.out.print(root.data + " ");
	}
	
	
}


public class Inorder_Preorder_Postorder {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root =  tree.insert(tree.root,4);
		tree.root =  tree.insert(tree.root,2);
		tree.root =  tree.insert(tree.root,1);
		tree.root =  tree.insert(tree.root,3);
		tree.root =  tree.insert(tree.root,5);
		
		System.out.println("Inorder traversal");
		tree.Inorder(tree.root);
		System.out.println();
		
		System.out.println("preorder traversal");
		tree.Preorder(tree.root);
		System.out.println();
		
		System.out.println("Postorder traversal");
		tree.Postorder(tree.root);
		System.out.println();
	}
}
