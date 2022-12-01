package com.datastructure.tree.code;//package com.algorithm.datastructure.tree;
//
//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        Node nodeA = new Node();
//        Node nodeB = new Node();
//        Node nodeC = new Node();
//        Node nodeD = new Node();
//        Node nodeE = new Node();
//        Node nodeF = new Node();
//        Node nodeG = new Node();
//        Node nodeH = new Node();
//
//        nodeA.setChild(Arrays.asList(nodeB, nodeC, nodeD));
//
//        nodeB.setParent(nodeA);
//        nodeB.setChild(Arrays.asList(nodeB, nodeC, nodeD));
//
//        nodeC.setParent(nodeA);
//
//        nodeD.setParent(nodeA);
//        nodeD.setChild(Arrays.asList(nodeB, nodeC, nodeD));
//
//        nodeE.setParent(nodeB);
//        nodeF.setParent(nodeB);
//        nodeG.setParent(nodeD);
//        nodeH.setParent(nodeD);
//
//        nodeA.print();
//    }
//}
