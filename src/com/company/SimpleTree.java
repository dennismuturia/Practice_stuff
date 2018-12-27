package com.company;

public class SimpleTree {
    public class Node{
        //FIrst create some privatye global variables to avoid external manipulation
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
}
