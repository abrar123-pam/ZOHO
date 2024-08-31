package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Tree{
    static Scanner sc = new Scanner(System.in);
    public Node buildTree(){
        int data = sc.nextInt();
        if(data == -1){
            return null;
        }
        Node newNode = new Node(data);
        System.out.println("Enter Data for inserting leftNode : " + data);
        newNode.left = buildTree();
        System.out.println("Enter Data for inserting rightNode : "+ data);
        newNode.right = buildTree();

        return newNode;
    }

    public void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()){

            Node temp = q.poll();

            System.out.print(temp.data+" ");
            if(temp.left != null){
                q.add(temp.left);
            }
            if(temp.right != null){
                q.add(temp.right);
            }
        }
    }

    public void dfs(Node root){
        if(root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()){
            Node temp = stack.pop();
            System.out.print(temp.data+" ");
            if(temp.left != null) stack.push(temp.left);
            if(temp.right != null) stack.push(temp.right);
        }
    }
}


public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.buildTree();
        System.out.print("Inorder Traversal : ");
        tree.inOrder(root);
        System.out.print("\nPreorder Traversal : ");
        tree.preOrder(root);
        System.out.print("\nPostorder Traversal : ");
        tree.postOrder(root);
        System.out.print("\nLevel Order Traversal : ");
        tree.levelOrder(root);
        System.out.print("\nDFS Traversal : ");
        tree.dfs(root);
    }
}
