package com.datastructure.tree.code;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    class Node {
        Object item;
        Node parent;
        List<Node> child;
    }

    Node root;

    Tree(Object item) {
        root = new Node();
        root.item = item;
    }

    Node addNode(Node node, Object item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.parent = node;

        if (node.child == null) {
            node.child = new ArrayList<>();
        }

        node.child.add(newNode);

        return newNode;
    }

    void deleteNode(Node node) {
        node.parent.child.remove(node);
    }

    void print(Node node) {
        if (node.parent == null) {
            System.out.println(node.item + "의 Parent: 루트 노드는 최상위 노드로 Parent 노드가 존재하지 않습니다.");
        } else {
            System.out.println(node.item + "의 Parent: " + node.parent.item);
        }

        System.out.print(node.item + "의 Child: ");

        if (node.child == null) {
            System.out.println("Child 없음");
        } else {
            for (Node child : node.child) {
                System.out.print(child.item + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}