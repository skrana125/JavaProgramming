package com.advanceDsa;


class BinarySearchTreeOperations {

    public static void main(String[] args){
        Node root;
        root = insert(null, 20);
        root = insert(root, 10);
        root = insert(root, 30);
        root = insert(root, 15);
        root = insert(root, 5);
        root = insert(root, 18);
        root = insert(root, 4);
        root = insert(root, 13);
        root = insert(root, 50);
        root = insert(root, 27);
        System.out.println("Inorder of the BST is ");
        inOrder(root);
        System.out.println();
        search(root, 5);
        search(root, 1);
        search(root, 27);
        search(root, 32);
        search(root, 50);

        delete(root, 52);

        delete(root, 5);
        System.out.println("Inorder of the BST is ");
        inOrder(root);
        System.out.println();

        delete(root, 27);
        System.out.println("Inorder of the BST is ");
        inOrder(root);
        System.out.println();


    }

    private static Node insert(Node root, int data){
        Node newNode = new Node(data);
        return insert(root, newNode);
    }

    private static Node insert(Node root, Node newNode){
        if(root == null){
            return newNode;
        }
        if(root.data < newNode.data){
            root.right = insert(root.right, newNode);
        }else{
            root.left = insert(root.left, newNode);
        }
        return root;
    }

    private static void search(Node root, int data){
        if(root == null){
            System.out.println(data + " is not present in the BST");
            return;
        }
        if(root.data == data){
            System.out.println(data + " is present in the BST");
            return;
        }
        if(root.data < data){
            search(root.right, data);
        }else{
            search(root.left, data);
        }
    }

    private static Node delete(Node root, int data){
        if(root == null){
            System.out.println(data + " is not in the tree");
            return null;
        }
        if(root.data < data){
            root.right = delete(root.right, data);
            return root;
        }else if (root.data > data){
            root.left = delete(root.left, data);
            return root;
        }

        if(root.left == null && root.right == null){

            return null;
        }else if(root.left == null){
            root = root.right;
            return root;
        }else if(root.right == null){
            root = root.left;
            return root;
        }else{


            Node replacingNode = findMax(root.left);
            root.data = replacingNode.data;
            root.left = delete(root.left, replacingNode.data);

            /*
             Node replacingNode = findMin(root.right);
             root.data = replacingNode.data;
             root.right = delete(root.right, replacingNode.data);
            */

        }
        return root;

    }

    private static Node findMax(Node root){
        while(root.right != null){
            root = root.right;
        }
        return root;
    }

    private static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
}