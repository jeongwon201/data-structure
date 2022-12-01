package com.datastructure.queue.code;

public class Queue {

    static class Linear {
        final int SIZE = 5;

        int front, rear;
        Object[] queue;

        Linear() {
            front = 0;
            rear = -1;
            queue = new Object[SIZE];
        }

        void enQueue(Object item) {
            if (rear == queue.length - 1) {
                throw new RuntimeException("포화 상태인 큐입니다.");
            }

            queue[++rear] = item;
        }

        void deQueue() {
            if (rear == -1) {
                throw new RuntimeException("비어있는 큐입니다.");
            }

            // 포화 상태로 인식하는 것을 방지하기위해 원소를 재배치한다.
            for (int i = front + 1; i < queue.length; i++) {
                queue[i - 1] = queue[i];
            }

            queue[rear] = null;
            rear--;
        }

        Object peek() {
            return queue[front];
        }

        void print() {
            for (int i = 0; i < queue.length; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }

    static class Circular {
        final int SIZE = 5;

        int front, rear;
        Object[] queue;

        Circular() {
            front = 0;
            rear = 0;
            queue = new Object[SIZE];
        }

        void enQueue(Object item) {
            if (front == (rear + 1) % queue.length) {
                throw new RuntimeException("포화 상태인 큐입니다.");
            }

            rear = (rear + 1) % queue.length;
            queue[rear] = item;
        }

        void deQueue() {
            if (rear == front) {
                throw new RuntimeException("비어있는 큐입니다.");
            }

            queue[front + 1] = null;
            front = (front + 1) % queue.length;
        }

        Object peek() {
            if (front == rear) {
                throw new RuntimeException("비어있는 큐입니다.");
            }

            return queue[front + 1];
        }

        void print() {
            for (int i = 0; i < queue.length; i++) {
                System.out.print(queue[i] + " ");
            }

            System.out.println();
        }
    }

    static class LinkedList {
        class Node {
            Object item;
            Node next;
        }

        Node head;

        LinkedList() {
            head = new Node();
        }

        void enQueue(Object item) {
            Node newNode  = new Node();
            newNode.item = item;

            Node node = head;
            while(node.next != null) {
                node = node.next;
            }

            node.next = newNode;
        }

        void deQueue() {
            if(head.next == null) {
                throw new RuntimeException("비어있는 큐입니다.");
            }

            head.next = head.next.next;
        }

        Node peek() {
            return head.next;
        }

        void print() {
            Node node = head.next;

            while(node.next != null) {
                System.out.print(node.item.toString() + " ");
                node = node.next;
            }

            System.out.println(node.item);
        }
    }
}