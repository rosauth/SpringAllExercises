package Day3;

import java.util.Scanner;

public class BinarySearchTree {

    class Node {

        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
            this.left = this.right = null;
        }
    }
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int value) {
        root = inputValue(root, value);
    }

    Node inputValue(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (value > root.value) {
            root.right = inputValue(root.right, value);
        } else if (value < root.value) {
            root.left = inputValue(root.left, value);
        }
        return root;
    }
    Node search(Node root,int value){
        if(root==null||root.value==value)
            return root;
        if(root.value>value)
            return search(root.left, value);
        else
            return search(root.right,value);
    }
    void printInOrder() {
        System.out.print("In Order : ");
        inOrder(root);
        System.out.println(" ");
    }
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.value+" ");
            inOrder(root.right);
        }
    }
    void printPreOrder(){
        System.out.print("Pre Order : ");
        preOrder(root);
        System.out.println(" ");
    }
    void preOrder(Node root){
        if(root!=null){
            System.out.print(root.value+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    void printPostOrder(){
        System.out.print("Post Order : ");
        postOrder(root);
        System.out.println(" ");
    }
    void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.value+" ");
        }
    }
}

class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner s = new Scanner(System.in);
        int menu;
        do {
            System.out.print("1.input\n2.view\n3.search\n4.exit\ninput : ");
            menu = s.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("masukan value : ");
                    int value =s.nextInt();
                    tree.insert(value);
                    break;
                case 2:
                    tree.printInOrder();
                    tree.printPreOrder();
                    tree.printPostOrder();
                    break;
                case 3:
                    System.out.print("masukan nilai : ");
                    int valueSearch = s.nextInt();
                    BinarySearchTree.Node n =tree.search(tree.root, valueSearch);
                    if(n!=null)
                        System.out.println("Ada!");
                    else
                        System.out.println("Tidak ditemukan");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Salah input menu!!");
                    break;
            }
        }while(menu != 4);
    }
}