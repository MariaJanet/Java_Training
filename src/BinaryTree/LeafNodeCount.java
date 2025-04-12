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
class BTree{
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
	public int countleaf(Node root) {
		if(root==null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		return countleaf(root.left) + countleaf(root.right);
	}
	
}
public class LeafNodeCount {

	public static void main(String[] args) {
		BTree tree = new BTree();
		tree.root =  tree.insert(tree.root,4);
		tree.root =  tree.insert(tree.root,2);
		tree.root =  tree.insert(tree.root,1);
		tree.root =  tree.insert(tree.root,3);
		tree.root =  tree.insert(tree.root,5);
		
		int count= tree.countleaf(tree.root);
		System.out.print(count+"");

	}

}
