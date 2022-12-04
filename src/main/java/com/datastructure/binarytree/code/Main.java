package com.datastructure.binarytree.code;

public class Main {
    public static void main(String[] args) {
        binary_tree();
        complete_binary_tree();
        perfect_binary_tree();
    }

    static void binary_tree() {
        System.out.println("--------------- 이진 트리 ---------------");
        BinaryTree binaryTree = new BinaryTree("Root");

        BinaryTree.Node nodeA = binaryTree.addLeftNode(binaryTree.root, "Node A");
        BinaryTree.Node nodeB = binaryTree.addRightNode(binaryTree.root, "Node B");

        BinaryTree.Node nodeC = binaryTree.addRightNode(nodeA, "Node C");

        BinaryTree.Node nodeD = binaryTree.addLeftNode(nodeB, "Node D");
        BinaryTree.Node nodeE = binaryTree.addRightNode(nodeB, "Node E");

        binaryTree.print(binaryTree.root);
        binaryTree.print(nodeA);
        binaryTree.print(nodeB);
        binaryTree.print(nodeC);
        binaryTree.print(nodeD);
        binaryTree.print(nodeE);
    }

    static void complete_binary_tree() {
        System.out.println("--------------- 완전 이진 트리 ---------------");
        BinaryTree binaryTree = new BinaryTree("Root");

        BinaryTree.Node nodeA = binaryTree.addLeftNode(binaryTree.root, "Node A");
        BinaryTree.Node nodeB = binaryTree.addRightNode(binaryTree.root, "Node B");

        BinaryTree.Node nodeC = binaryTree.addLeftNode(nodeA, "Node C");

        BinaryTree.Node nodeD = binaryTree.addLeftNode(nodeB, "Node D");

        binaryTree.print(binaryTree.root);
        binaryTree.print(nodeA);
        binaryTree.print(nodeB);
        binaryTree.print(nodeC);
        binaryTree.print(nodeD);
    }

    static void perfect_binary_tree() {
        System.out.println("--------------- 포화 이진 트리 ---------------");
        BinaryTree binaryTree = new BinaryTree("Root");

        BinaryTree.Node nodeA = binaryTree.addLeftNode(binaryTree.root, "Node A");
        BinaryTree.Node nodeB = binaryTree.addRightNode(binaryTree.root, "Node B");

        BinaryTree.Node nodeC = binaryTree.addLeftNode(nodeA, "Node C");
        BinaryTree.Node nodeD = binaryTree.addRightNode(nodeA, "Node D");

        BinaryTree.Node nodeE = binaryTree.addLeftNode(nodeB, "Node E");
        BinaryTree.Node nodeF = binaryTree.addRightNode(nodeB, "Node F");

        binaryTree.print(binaryTree.root);
        binaryTree.print(nodeA);
        binaryTree.print(nodeB);
        binaryTree.print(nodeC);
        binaryTree.print(nodeD);
        binaryTree.print(nodeE);
    }
}