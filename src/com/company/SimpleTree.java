package com.company;

public class SimpleTree {
    public static class Node{
        //FIrst create some private global variables to avoid external manipulation
        private Node left;
        private Node right;
        private int V;


        public Node(Node left, Node right, int V){
            this.left = left;
            this.right = right;
            this.V = V;
        }

        //Create Getters in this method
        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public int getV() {
            return V;
        }
    }
    //Since we have all what it takes to code for a binary tree  lets start with
    //Checking if its a Binary search tree or not

    public static class BinarySearchTree{
        //Assign root a node
        Node root;
        //Is it a binary search tree or not
        boolean isBST(){
            return (isBSTUtl(root, Integer.MIN_VALUE, Integer.MAX_VALUE));//Will create this method later on.
        }
        boolean isBSTUtl(Node node, int min, int max){
            if(node == null)
                return true;
            if((node.getV() < min) || (node.getV() > max))
                return false;

            //Otherwise check the tree recursively tightenning the min and max values
            return (isBSTUtl(node.left, min,node.getV()-1) &&isBSTUtl(node.right, node.getV()-1, max));
        }
    }
}
