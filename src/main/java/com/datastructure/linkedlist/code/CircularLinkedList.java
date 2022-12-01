package com.datastructure.linkedlist.code;

public class CircularLinkedList {
    static class Node {
        String data;
        Node next;
    }

    Node head;

    public CircularLinkedList() {
        head = new Node();
        head.next = head;
    }

    // 노드 추가
    public void addNode(String data) {
        Node newNode = new Node();
        newNode.data = data;

        Node node = head;
        while (node.next != head) {
            node = node.next;
        }

        node.next = newNode;
        newNode.next = head;
    }

    // 중간에 노드 추가
    public void addNode(Node pre, String data) {
        Node newNode = new Node();
        newNode.data = data;

        if (pre == null || pre.next == null) {
            throw new RuntimeException("입력한 노드가 마지막 노드이거나, 존재하지않는 노드입니다.");
        }

        newNode.next = pre.next;
        pre.next = newNode;
    }

    // 마지막 노드의 삭제
    // 단순 연결 리스트와는 다르게 하나의 반복문에서 해결이 가능
    public void remove() {
        Node node = head;
        Node last = null;

        while (true) {
            node = node.next;

            if (last == null && node.next == head) {
                last = node;
            }

            if (last != null && node.next == last) {
                node.next = head;
                break;
            }
        }
    }

    // 중간 노드의 삭제
    // 삭제하려는 노드를 A 노드, A 노드의 다음 노드를 B 노드라고 할 때,
    // 단순 연결 리스트는 이전 노드를 참조할 수 없으므로 B 노드를 A 노드에 복사하여 B 노드의 링크를 끊어주는 방식으로 삭제를 수행한다.
    public void remove(Node node) {
        if (node == null || node.next == head) {
            throw new RuntimeException("입력한 노드가 마지막 노드이거나, 존재하지않는 노드입니다.");
        }

        Node next = node.next;
        node.data = next.data;
        node.next = next.next;
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

        if (node.next == null) {
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