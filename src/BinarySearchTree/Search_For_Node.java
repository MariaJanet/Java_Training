package BinarySearchTree;

public class Search_For_Node {

    static class node {
        int data;
        node left, right;

        node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class search {
        node root;

        public node insert(node root, int data) {
            if (root == null) {
                return new node(data);
            }
            if (data < root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
            return root;
        }

        public node searchNode(node root, int data) {
            if (root == null || root.data == data) {
                return root;
            }
            if (data < root.data) {
                return searchNode(root.left, data);
            } else {
                return searchNode(root.right, data);
            }
        }
    }

    public static void main(String[] args) {
        search b = new search();
        b.root = b.insert(b.root, 50);
        b.root = b.insert(b.root, 30);
        b.root = b.insert(b.root, 20);
        b.root = b.insert(b.root, 40);
        b.root = b.insert(b.root, 70);
        b.root = b.insert(b.root, 60);
        b.root = b.insert(b.root, 80);

        node res = b.searchNode(b.root, 60);
        if (res != null) {
            System.out.println("Node found: " + res.data);
        } else {
            System.out.println("Node not found.");
        }
    }
}
