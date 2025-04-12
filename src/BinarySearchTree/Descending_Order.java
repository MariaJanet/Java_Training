package BinarySearchTree;
class Node1{
	int data;
	Node1 left;
	Node1 right;
	Node1(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
}
class Desce{
	Node1 root;
	public Node1 insert(Node1 root,int data) {
		if(root == null) {
			return new Node1(data);
		}
		if(data < root.data) {
			root.left = insert(root.left,data);
		}
		else {
			root.right = insert(root.right,data);
		}
		return root;
	}
	public void desec(Node1 root) {
		if(root == null) {
			return ;
		}
		desec(root.right);
		System.out.print(root.data +" ");
		desec(root.left);
	}
}

public class Descending_Order {

	public static void main(String[] args) {
		Desce b = new Desce();
		b.root = b.insert(b.root, 50);
	    b.root = b.insert(b.root, 30);
	    b.root = b.insert(b.root, 20);
	    b.root = b.insert(b.root, 40);
	    b.root = b.insert(b.root, 70);
	    b.root = b.insert(b.root, 60);
	    b.root = b.insert(b.root, 80);
	    
	    b.desec(b.root);


	}

}
