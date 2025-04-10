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
class BinaryTrees{
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
	public int countnodes(Node root) {
		if(root == null) {
			return 0;
		}
		return 1+countnodes(root.left) + countnodes(root.right);
	}
	
}
public class No_Of_Nodes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BinaryTrees tree = new BinaryTrees();
		int n= s.nextInt();
		Node root = null;
		for(int i=0;i<n;i++) {
			int val= s.nextInt();
			tree.root = tree.insert(tree.root,val);			
		}
		int count = tree.countnodes(tree.root);
		System.out.println("No.of.nodes:" + count);
	}
}
