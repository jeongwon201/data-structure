package com.datastructure.binarysearchtree.code;

public class BinarySearchTree {

    class Node {
        int item;
        Node left;
        Node right;
    }

    Node root;

    Node addNode(int item) {
        Node newNode = new Node();
        newNode.item = item;

        if (root == null) {
            root = newNode;
        } else {
            Node node = root;

            while (true) {
                if (newNode.item < node.item) {
                    if (node.left == null) {
                        node.left = newNode;
                        break;
                    } else {
                        node = node.left;
                    }
                } else {
                    if (node.right == null) {
                        node.right = newNode;
                        break;
                    } else {
                        node = node.right;
                    }
                }
            }
        }

        return newNode;
    }

    void removeNode(Node deleteNode) {

        if (deleteNode != null) {
            Node parent = null;
            Node current = root;

            while (current != deleteNode) {
                parent = current;

                if (deleteNode.item < current.item) {
                    current = current.left;
                } else {
                    current = current.right;
                }
            }

            // 자식 노드가 존재하지 않을 경우
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (parent.item < current.item) {
                        parent.right = null;
                    } else {
                        parent.left = null;
                    }
                }
            }
            // 자식 노드가 모두 존재할 경우
            else if (current.left != null && current.right != null) {
                Node alternateNode = findAlternateNode(deleteNode);

                if (parent.item < current.item) {
                    parent.right = alternateNode;
                } else {
                    parent.left = alternateNode;
                }

                alternateNode.left = current.left;
                alternateNode.right = current.right;
            }
            // 자식 노드가 왼쪽 노드 하나만 존재할 경우
            else if (current.left != null) {
                if (current == root) {
                    root = current;
                } else {
                    if (parent.item < current.item) {
                        parent.right = current.left;
                    } else {
                        parent.left = current.left;
                    }
                }
            }
            // 자식 노드가 오른쪽 노드 하나만 존재할 경우
            else {
                if (current == root) {
                    root = current;
                } else {
                    if (parent.item < current.item) {
                        parent.right = current.right;
                    } else {
                        parent.left = current.right;
                    }
                }
            }

            current.item = -1;
            current.left = null;
            current.right = null;
        }
    }

    private Node findAlternateNode(Node deleteNode) {
        Node parent = deleteNode;
        Node current = deleteNode.right;

        if (current.left != null) {
            while (current.left != null) {
                parent = current;
                current = current.left;
            }

            if (current.right != null) {
                parent.left = current.right;
            }
        }

        return current;
    }

    void print(Node node) {
        if (node.item == -1) {
            System.out.println("Removed !");
        } else {
            if (node.left == null) {
                System.out.print(node.item + "'s left: null, ");
            } else {
                System.out.print(node.item + "'s left: " + node.left.item + ", ");
            }

            if (node.right == null) {
                System.out.print("right: null");
            } else {
                System.out.print("right: " + node.right.item);
            }

            System.out.println();
        }
    }
}