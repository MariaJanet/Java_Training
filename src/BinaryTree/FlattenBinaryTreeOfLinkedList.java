package BinaryTree;
class TreeNode{
	int data;
	TreeNode left,right;
	TreeNode(int data){
		this.data = data;
		this.left = null;
		this.right=null;
	}
}


public class FlattenBinaryTreeOfLinkedList {
	private TreeNode prev = null;
	public void flatten(TreeNode root) {
	if(root == null) return;
	flatten(root.right);
	flatten(root.left);
	
	root.right = prev;
	root.left = null;
	prev=root;
	}

	public static void main(String[] args) {
		 TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(5);
	        root.left.left = new TreeNode(3);
	        root.left.right = new TreeNode(4);
	        root.right.right = new TreeNode(6);

	        FlattenBinaryTreeOfLinkedList f = new FlattenBinaryTreeOfLinkedList();
	        f.flatten(root);
	        TreeNode curr = root;
	        while (curr != null) {
	            System.out.print(curr.data + " ");
	            curr = curr.right;
	        }

	}

}
