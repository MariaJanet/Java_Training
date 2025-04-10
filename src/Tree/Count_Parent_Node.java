package Tree;

import java.util.Scanner;

class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
}
class main{
	Node root;
	public Node ins(Node root, int data) {
		if(root==null) {
			return new Node(data);
		}
		if(data < root.data) {
			root.left = ins(root.left,data);
		}
		else {
			root.right = ins(root.right,data);
		}
		return root;
	}
	public int countparent(Node root) {
		if(root ==null) {
			return 0;
		}
		if(root.left != null || root.right !=null){
			return 1+countparent(root.left)+countparent(root.right);
		}
		else {
			return 0;
		}
	}
}
public class Count_Parent_Node {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		main tree = new main();
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
			int data = s.nextInt();
			tree.root = tree.ins(tree.root,data);
		}
		int c=tree.countparent(tree.root);
		System.out.println(c);
	}

}



