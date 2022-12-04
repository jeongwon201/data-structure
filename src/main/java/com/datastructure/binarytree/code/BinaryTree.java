package com.datastructure.binarytree.code;

public class BinaryTree {

    class Node {
        Object item;
        Node left;
        Node right;
    }

    Node root;

    BinaryTree(Object item) {
        root = new Node();
        root.item = item;
    }

    Node addLeftNode(Node node, Object item) {
        Node newNode = new Node();
        newNode.item = item;

        node.left = newNode;

        return newNode;
    }

    Node addRightNode(Node node, Object item) {
        Node newNode = new Node();
        newNode.item = item;

        node.right = newNode;

        return newNode;
    }

    void deleteLeftNode(Node node) {
        node.left = null;
    }

    void deleteRightNode(Node node) {
        node.right = null;
    }

    void print(Node node) {
        if(node.left != null) {
            System.out.println(node.item + "의 Left Node: " + node.left.item);
        }

        if(node.right != null) {
            System.out.println(node.item + "의 Right Node: " + node.right.item);
        }
    }
}