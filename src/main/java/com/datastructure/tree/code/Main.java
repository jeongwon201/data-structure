package com.datastructure.tree.code;//package com.algorithm.datastructure.tree;


public class Main {
    public static void main(String[] args) {
        tree();
    }

    static void tree() {
        System.out.println("--------------- 트리 ---------------");
        Tree tree = new Tree("루트");
        tree.print(tree.root);

        Tree.Node nodeA = tree.addNode(tree.root, "노드 A");
        Tree.Node nodeB = tree.addNode(tree.root, "노드 B");
        Tree.Node nodeC = tree.addNode(tree.root, "노드 C");

        Tree.Node nodeD = tree.addNode(nodeA, "노드 D");
        Tree.Node nodeE = tree.addNode(nodeA, "노드 E");

        Tree.Node nodeF = tree.addNode(nodeB, "노드 F");
        Tree.Node nodeG = tree.addNode(nodeB, "노드 G");

        Tree.Node nodeH = tree.addNode(nodeC, "노드 H");
        Tree.Node nodeI = tree.addNode(nodeC, "노드 I");

        tree.print(nodeA);
        tree.print(nodeB);
        tree.print(nodeC);
        tree.print(nodeD);
        tree.print(nodeE);
        tree.print(nodeF);
        tree.print(nodeG);
        tree.print(nodeH);
        tree.print(nodeI);
    }
}
