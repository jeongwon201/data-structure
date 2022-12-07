package com.datastructure.binarysearchtree.code;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        binary_search_tree();
    }

    static void binary_search_tree() {
        // README.md 에서 마지막 그림의 이중 탐색 트리와 동일한 트리이다
        // 그림을 보면서 비교해보면 이해하기 쉬울 것

        System.out.println("--------------- 이진 탐색 트리 ---------------");

        BinarySearchTree bst = new BinarySearchTree();
        BinarySearchTree.Node node1 = bst.addNode(50);
        BinarySearchTree.Node node2 = bst.addNode(70);
        BinarySearchTree.Node node3 = bst.addNode(24);
        BinarySearchTree.Node node4 = bst.addNode(10);
        BinarySearchTree.Node node5 = bst.addNode(38);
        BinarySearchTree.Node node6 = bst.addNode(55);
        BinarySearchTree.Node node7 = bst.addNode(78);
        BinarySearchTree.Node node8 = bst.addNode(5);
        BinarySearchTree.Node node9 = bst.addNode(17);
        BinarySearchTree.Node node10 = bst.addNode(30);
        BinarySearchTree.Node node11 = bst.addNode(45);
        BinarySearchTree.Node node12 = bst.addNode(51);
        BinarySearchTree.Node node13 = bst.addNode(61);
        BinarySearchTree.Node node14 = bst.addNode(72);
        BinarySearchTree.Node node15 = bst.addNode(83);
        BinarySearchTree.Node node16 = bst.addNode(1);
        BinarySearchTree.Node node17 = bst.addNode(8);
        BinarySearchTree.Node node18 = bst.addNode(14);
        BinarySearchTree.Node node19 = bst.addNode(23);
        BinarySearchTree.Node node20 = bst.addNode(25);
        BinarySearchTree.Node node21 = bst.addNode(34);
        BinarySearchTree.Node node22 = bst.addNode(41);
        BinarySearchTree.Node node23 = bst.addNode(48);
        BinarySearchTree.Node node24 = bst.addNode(28);

        // 자식 노드가 모두 존재하는 경우
        bst.removeNode(node3);

        // 자식 노드가 존재하지 않는 경우(1, 23)
        bst.removeNode(node16);
        bst.removeNode(node19);

        //자식 노드가 왼쪽 노드 하나만 존재하는 경우
        bst.removeNode(node9);

        //자식 노드가 오른쪽 노드 하나만 존재하는 경우
        bst.removeNode(node8);

        bst.print(node1);
        bst.print(node2);
        bst.print(node3);
        bst.print(node4);
        bst.print(node5);
        bst.print(node6);
        bst.print(node7);
        bst.print(node8);
        bst.print(node9);
        bst.print(node10);
        bst.print(node11);
        bst.print(node12);
        bst.print(node13);
        bst.print(node14);
        bst.print(node15);
        bst.print(node16);
        bst.print(node17);
        bst.print(node18);
        bst.print(node19);
        bst.print(node20);
        bst.print(node21);
        bst.print(node22);
        bst.print(node23);
        bst.print(node24);
    }
}
