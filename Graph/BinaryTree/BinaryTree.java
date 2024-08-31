import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {
    
    static Scanner sc = new Scanner(System.in);
    
    public static Node buildBST() {
        System.out.println("Enter the data (enter -1 to stop): ");
        int data = sc.nextInt();
        
        if (data == -1) {
            return null;
        }
        
        Node root = new Node(data);
        System.out.println("Enter data for inserting in left of " + data);
        root.left = buildBST();
        System.out.println("Enter data for inserting in right of " + data);
        root.right = buildBST();
        
        return root;
    }
    
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        
        return root;
    }
    
    public static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    
    public static void main(String[] args) {
        Node root = null;
        
        // Building the BST
        root = buildBST();
        System.out.println("Binary Search Tree built successfully!");
        
        // Optionally, you can insert nodes explicitly using insert method
        // Example:
        root = insert(root, 8);
         root = insert(root, 3);
         root = insert(root, 10);
        
        // Traversals
        System.out.print("Inorder traversal: ");
        inOrder(root);
        System.out.println();
        
        System.out.print("Preorder traversal: ");
        preOrder(root);
        System.out.println();
        
        System.out.print("Postorder traversal: ");
        postOrder(root);
        System.out.println();
    }
}
