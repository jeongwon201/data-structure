package com.datastructure.deque.code;

public class Main {
    public static void main(String[] args) {
        deque_array();
        deque_linked_list();
    }

    static void deque_array() {
        System.out.println("--------------- 덱(배열) ---------------");
        Deque.Array deque = new Deque.Array();

        deque.addLast("데이터1");
        deque.addLast("데이터2");
        deque.addFirst("데이터3");
        deque.addFirst("데이터4");

        System.out.println("peekLast -> " + deque.peekLast().toString());
        System.out.println("peekFirst -> " + deque.peekFirst().toString());
        deque.print();

        deque.removeLast();
        deque.removeFirst();

        System.out.println("peekLast -> " + deque.peekLast().toString());
        System.out.println("peekFirst -> " + deque.peekFirst().toString());
        deque.print();
    }

    static void deque_linked_list() {
        System.out.println("--------------- 덱(연결 리스트) ---------------");
        Deque.LinkedList deque = new Deque.LinkedList();

        deque.addLast("데이터1");
        deque.addLast("데이터2");
        deque.addFirst("데이터3");
        deque.addFirst("데이터4");

        System.out.println("peekLast -> " + deque.peekLast().item.toString());
        System.out.println("peekFirst -> " + deque.peekFirst().item.toString());
        deque.print();

        deque.removeLast();
        deque.removeFirst();

        System.out.println("peekLast -> " + deque.peekLast().item.toString());
        System.out.println("peekFirst -> " + deque.peekFirst().item.toString());
        deque.print();
    }
}
