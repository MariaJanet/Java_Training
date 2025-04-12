package BinaryTree;
import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
}
class Tree{
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
	public int countnode(Node root) {
		if(root==null) {
			return 0;
		}
		return 1+countnode(root.left)+countnode(root.right);
	}
	
}
public class Count_Number_Of_Nodes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		Tree tree = new Tree();
		for(int i=0;i<n;i++) {
			int data = s.nextInt();
			tree.root=tree.insert(tree.root, data);
		}
		
		int count=tree.countnode(tree.root);
		System.out.println(count);
	}
}
