package com.datastructure.deque.code;

public class Deque {

    static class Array {
        final int SIZE = 5;

        int front;
        int rear;
        Object[] deque;

        Array() {
            front = 0;
            rear = 0;
            deque = new Object[SIZE];
        }

        void addFirst(Object item) {
            if ((front - 1 + deque.length) % deque.length == rear) {
                throw new RuntimeException("포화 상태인 덱입니다.");
            }

            deque[front] = item;
            front = (front - 1 + deque.length) % deque.length;
            deque[front] = "front";
        }

        void addLast(Object item) {
            if ((rear + 1) % deque.length == front) {
                throw new RuntimeException("포화 상태인 덱입니다.");
            }

            rear = (rear + 1) % deque.length;
            deque[rear] = item;
        }

        void removeFirst() {
            if (front == rear) {
                throw new RuntimeException("비어있는 덱입니다.");
            }

            deque[front] = null;
            front = (front + 1) % deque.length;
            deque[front] = "front";
        }

        void removeLast() {
            if (front == rear) {
                throw new RuntimeException("비어있는 덱입니다.");
            }

            deque[rear] = null;
            rear = (rear - 1 + deque.length) % deque.length;
        }

        Object peekFirst() {
            return deque[(front + 1) % deque.length];
        }

        Object peekLast() {
            return deque[rear];
        }

        void print() {
            for (int i = 0; i < deque.length; i++) {
                System.out.print(deque[i] + " ");
            }

            System.out.println();
        }
    }

    static class LinkedList {

        class Node {
            Object item;
            Node prev;
            Node next;
        }

        Node head;
        Node tail;

        LinkedList() {
            head = new Node();
            tail = new Node();
            head.next = tail;
            tail.prev = head;
        }

        void addFirst(Object item) {
            Node node = new Node();
            node.item = item;

            node.next = head.next;
            head.next.prev = node;

            node.prev = head;
            head.next = node;
        }

        void addLast(Object item) {
            Node node = new Node();
            node.item = item;

            node.prev = tail.prev;
            tail.prev.next = node;

            node.next = tail;
            tail.prev = node;
        }

        void removeFirst() {
            if (head.next == tail) {
                throw new RuntimeException("비어있는 덱입니다.");
            }

            head.next = head.next.next;
            head.next.prev = head;
        }

        void removeLast() {
            if (tail.prev == null) {
                throw new RuntimeException("비어있는 덱입니다.");
            }

            tail.prev = tail.prev.prev;
            tail.prev.next = tail;
        }

        Node peekFirst() {
            return head.next;
        }

        Node peekLast() {
            return tail.prev;
        }

        void print() {
            Node node = head.next;

            while (node.next != tail) {
                System.out.print(node.item + " ");
                node = node.next;
            }

            System.out.println(node.item);
        }
    }
}
