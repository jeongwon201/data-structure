package com.datastructure.queue.code;

public class Main {
    public static void main(String[] args) {
        queue_linear();
        queue_circular();
        queue_linked_list();
    }

    static void queue_linear() {
        System.out.println("--------------- 선형 큐(배열) ---------------");
        Queue.Linear queue = new Queue.Linear();

        queue.enQueue("데이터1");
        queue.enQueue("데이터2");
        queue.enQueue("데이터3");
        queue.enQueue("데이터4");
        queue.enQueue("데이터5");

        System.out.println("peek -> " + queue.peek().toString());
        queue.print();

        queue.deQueue();
        queue.deQueue();

        System.out.println("peek -> " + queue.peek().toString());
        queue.print();
    }

    static void queue_circular() {
        System.out.println("--------------- 원형 큐(배열) ---------------");
        Queue.Circular queue = new Queue.Circular();

        queue.enQueue("데이터1");
        queue.enQueue("데이터2");
        queue.enQueue("데이터3");
        queue.enQueue("데이터4");

        System.out.println("peek -> " + queue.peek().toString());
        queue.print();

        queue.deQueue();
        queue.deQueue();

        System.out.println("peek -> " + queue.peek().toString());
        queue.print();
    }

    static void queue_linked_list() {
        System.out.println("--------------- 큐(연결 리스트) ---------------");
        Queue.LinkedList queue = new Queue.LinkedList();

        queue.enQueue("데이터1");
        queue.enQueue("데이터2");
        queue.enQueue("데이터3");
        queue.enQueue("데이터4");
        queue.enQueue("데이터5");

        System.out.println("peek -> " + queue.peek().item.toString());
        queue.print();

        queue.deQueue();
        queue.deQueue();

        System.out.println("peek -> " + queue.peek().item.toString());
        queue.print();
    }
}
