package BinarySearchTree;
class binode{
	int data;
	binode left,right;
	binode(int data){
		this.data =data;
		this.left=null;
		this.right=null;
	}
}
class deletionbinarystree {
    binode root;

    public binode insert(binode root, int data) {
        if (root == null) {
            return new binode(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }
    public binode findmin(binode root) {
    	while(root.left != null) {
    		root = root.left;
    	}
    	return root;
    }
    public binode deletion(binode root,int data) {
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
    		binode successor = findmin(root.right); 
            root.data = successor.data;        
            root.right = deletion(root.right, successor.data);
    	}
    	return root;
    }
    public void inorder(binode root) {
    	if(root != null) {
    		inorder(root.left);
    		System.out.print(root.data+" ");
    		inorder(root.right);
    	}
    }
    
}
public class Deleting_Two_childernode {

	public static void main(String[] args) {
		deletionbinarystree tree = new deletionbinarystree();
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 70);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 60);
        tree.root = tree.insert(tree.root, 80);

        System.out.println("Inorder before deletion:");
        tree.inorder(tree.root);

        tree.root = tree.deletion(tree.root, 50); 

        System.out.println("Inorder after deleting 50:");
        tree.inorder(tree.root);
	}
}
