package BinarySearchTree;
class binnode {
	int data;
	binnode left,right;
	binnode(int data){
		this.data= data;
		this.left=null;
		this.right=null;
	}
}
class smallestknode{
	binnode root;
	int count=0,sum=0;
	public binnode insert(binnode root,int data) {
		if(root == null) {
			return new binnode(data);
		}
		if(data<root.data) {
			root.left = insert(root.left,data);
		}
		else {
			root.right = insert(root.right,data);
		}
		return root;
	}
	 public int minnode(binnode root) {
	        if (root == null) {
	            return -1;
	        }
	        if (root.left == null) {
	            return root.data;
	        }
	        return minnode(root.left);
	    }
	 public int smallnode(binnode root, int data) {
		 sum=0;
		 count=0;
		 inorder(root,data);
		 return sum;
	 }
	 public void inorder(binnode root,int data) {
		 if(root == null || count >= data) {
			 return;
		 }
		 inorder(root.left,data);
		 if(count < data) {
			 sum += root.data;
			 count++;	 
		 }
		 inorder(root.right,data);
	 }

}
public class SumOfKSmallestNode {

	public static void main(String[] args) {
		smallestknode b = new smallestknode();
        b.root = b.insert(b.root, 50);
        b.root = b.insert(b.root, 30);
        b.root = b.insert(b.root, 20);
        b.root = b.insert(b.root, 40);
        b.root = b.insert(b.root, 70);
        b.root = b.insert(b.root, 60);
        b.root = b.insert(b.root, 80);
        
        int k=4;
        int min = b.minnode(b.root);
        int sum = b.smallnode(b.root,data);
        
        System.out.print(min);
        System.out.print(sum);
	}
}
