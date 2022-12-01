package com.datastructure.linkedlist.code;

public class DoublyLinkedList {
    static class Node {
        String data;
        Node pre;
        Node next;
    }

    Node head;

    public DoublyLinkedList() {
        head = new Node();
        head.pre = head;
        head.next = head;
    }

    // 노드 추가
    public void addNode(String data) {
        Node newNode = new Node();
        newNode.data = data;

        head.pre.next = newNode;
        newNode.pre = head.pre;
        head.pre = newNode;
        newNode.next = this.head;
    }

    // 중간에 노드 추가
    public void addNode(Node pre, String data) {
        Node newNode = new Node();
        newNode.data = data;

        if (pre == null || pre.next == head) {
            throw new RuntimeException("입력한 노드가 마지막 노드이거나, 존재하지않는 노드입니다.");
        }

        pre.next.pre = newNode;
        newNode.next = pre.next;
        pre.next = newNode;
        newNode.pre = pre;
    }

    // 마지막 노드의 삭제
    public void remove() {
        Node node = head;

        node.pre.pre.next = head;
        head.pre = node.pre.pre;
    }

    // 중간 노드의 삭제
    public void remove(Node node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    // 노드 검색
    public Node getNode(String data) {
        Node node = head;

        while (node.next != head) {
            if (node.next.data.equals(data)) {
                return node.next;
            } else {
                node = node.next;
            }
        }

        throw new RuntimeException(data + " 데이터를 가진 노드가 존재하지 않습니다.");
    }

    public void print() {
        Node node = head;

        if (node.next == head) {
            throw new RuntimeException("빈 연결 리스트입니다.");
        }

        node = node.next;

        while (node.next != head) {
            System.out.print(node.data + " => ");
            node = node.next;
        }

        System.out.println(node.data);
        System.out.println();
    }
}