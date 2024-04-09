package com.AVLTreeImplementation;

import com.TreeImplementation.Tree;

public class AVLTree {
    private class Node {
        public int height;
        private int value;
        private Node leftNode;

        private Node rightNode;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;
    private void insert2(int value){
        insert(value, root);
    }
    public Node insert(int value,Node root) {
        if (root == null) {
            return new Node(value);
        } else {
            if (value < root.value) {
                insert(value,root.leftNode);
            } else {
                insert(value,root.rightNode);
            }

        }
        return avlBalance(root);
    }


    //balance factor = height of left node - height of right node
    //if BF => 1 -> Left heavy, perform a right rotation
    //if BF <1 -> Right heavy
    public Node avlBalance(Node root){
        int BF = height(root.leftNode) - height(root.rightNode);
        //If the root is left heavy
        if(BF > 1) {
            System.out.println(root.value + "is Left heavy ");
            rightRotation(root);
        }
        //If the root is right heavy
        else if (BF < -1) {
            System.out.println(root.value + "is Right heavy");
            leftRotation(root);
        }

        return root;
    }

    private Node leftRotation(Node root){
        var newRoot = root.rightNode;
        if(newRoot.leftNode != null) {
            if (newRoot.leftNode.value > root.value &&
                    newRoot.leftNode.value < newRoot.value) {
                root = newRoot.leftNode;
                newRoot.leftNode = root.rightNode;
            } else if (newRoot.leftNode.value < root.value &&
                    newRoot.leftNode.value < newRoot.value) {
                root = newRoot.leftNode;
                newRoot.leftNode = root.leftNode;
            }
        }else {
            root = newRoot.leftNode;
        }
        setHeight(root);
        setHeight(newRoot);
        return newRoot;
    }

    private Node rightRotation(Node root){
        var newRoot = root.leftNode;
        if(newRoot.rightNode != null) {
            if (newRoot.rightNode.value < root.value &&
                    newRoot.leftNode.value > newRoot.value) {
                root = newRoot.rightNode;
                newRoot.rightNode = root.leftNode;
            } else if (newRoot.rightNode.value < root.value &&
                    newRoot.rightNode.value < newRoot.value) {
                root = newRoot.rightNode;
                newRoot.leftNode = root.leftNode;
            }
        }else {
            root = newRoot.rightNode;
        }
        setHeight(root);
        setHeight(newRoot);
        return newRoot;
    }
    private void setHeight(Node node){
        int height = 1 + Math.max(
                height(root.leftNode),
                height(root.rightNode));
    }
    public int height() {

        return height(root);
    }

    private int height(Node root) {
        if (root == null) {
            return -1;
        }
        if (isLeaf(root)) {
            return 0;
        }
        return 1 + Math.max(
                height(root.leftNode),
                height(root.rightNode)
        );
    }
    private boolean isLeaf(Node node)
    {
        return root.leftNode == null && root.rightNode == null;
    }
}



