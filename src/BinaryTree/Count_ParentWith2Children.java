package BinaryTree;

import java.util.Scanner;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
}
class parentCount{
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
	public int countp(Node root) {
		if(root==null) {
			return 0;
		}
		int count=0;
		if(root.left !=null && root.right != null) {
			count =1;
		}
		return countp(root.left) + countp(root.right) + count;
	}
}
public class Count_ParentWith2Children {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		parentCount tree = new parentCount();
		for(int i=0;i<n;i++) {
			int data = s.nextInt();
			tree.root=tree.insert(tree.root, data);
		}
		int p = tree.countp(tree.root);
		System.out.print(p);
	}

}
