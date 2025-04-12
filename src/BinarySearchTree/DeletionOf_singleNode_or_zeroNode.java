package BinarySearchTree;
class bnode{
	int data;
	bnode left,right;
	bnode(int data){
		this.data =data;
		this.left=null;
		this.right=null;
	}
}
class deletionbinaryst {
    bnode root;

    public bnode insert(bnode root, int data) {
        if (root == null) {
            return new bnode(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public bnode deletion(bnode root,int data) {
    	if(root== null) {
    		return null;
    	}
    	if(data < root.data) {
    		root.left = deletion(root.left,data);
    	}
    	else if(data > root.data) {
    		root.right =deletion(root.right,data);
    	}
    	else {
    		if(root.left==null) {
    			return root.right;
    		}
    		else if(root.right == null) {
    			return root.left;
    		}
    		else {
    			return root;
    		}
    	}
    	return root;
    }
    public void inorder(bnode root) {
    	if(root != null) {
    		inorder(root.left);
    		System.out.print(root.data+" ");
    		inorder(root.right);
    	}
    }
}
public class DeletionOf_singleNode_or_zeroNode {

	public static void main(String[] args) {
		deletionbinaryst tree = new deletionbinaryst();
		 tree.root = tree.insert(tree.root, 50);
	     tree.root = tree.insert(tree.root, 30);
	     tree.root = tree.insert(tree.root, 70);
	     tree.root = tree.insert(tree.root, 20); 
	     tree.root = tree.insert(tree.root, 40);
	     
	     System.out.println("Inorder before deletion:");
	     tree.inorder(tree.root);
	     
	     
	     tree.root = tree.deletion(tree.root, 20); 
	        tree.root = tree.deletion(tree.root, 40);
//	        tree.root = tree.deletion(tree.root, 70);
	        tree.root = tree.deletion(tree.root,50);
	        
	        System.out.println("Inorder after deletion:");
	        tree.inorder(tree.root);
	}
}
