package com.datastructure.binarysearchtree.code;

public class BinarySearchTree {

    class Node {
        int item;
        Node left;
        Node right;
    }

    Node root;

    void addNode(int item) {
        if(root == null) {
            root = new Node();
            root.item = item;
        } else {
            Node newNode = new Node();
            newNode.item = item;

            Node node = root;

            while (true) {
                if(newNode.item < node.item) {
                    if(node.left == null) {
                        node.left = newNode;
                        break;
                    } else {
                        node = node.left;
                    }
                } else {
                    if(node.right == null) {
                        node.right = newNode;
                        break;
                    } else {
                        node = node.right;
                    }
                }
            }
        }
    }

    void removeNode() {

    }

    void print() {

    }
}
