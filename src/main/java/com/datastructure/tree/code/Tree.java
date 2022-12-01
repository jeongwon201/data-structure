package com.datastructure.tree.code;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    
    class Node {
        Node parent;
        List<Node> child;
        Node() {
            child = new ArrayList<>();
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public void setChild(List<Node> child) {
            this.child = child;
        }
    }
    List<Node> nodes;

    public Tree() {
        this.nodes = new ArrayList<>();
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void addNode(Node node) {
        nodes.add(node);
    }
}

