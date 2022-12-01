package com.datastructure.linkedlist.code;

public class Main {
    public static void main(String[] args) {

        simpleLinkedList();
        circularLinkedList();
        doublyLinkedList();
    }

    public static void simpleLinkedList() {
        System.out.println("--------------- 단순 연결 리스트 ---------------");

        System.out.println("노드 추가");
        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();
        simpleLinkedList.addNode("데이터1");
        simpleLinkedList.addNode("데이터2");
        simpleLinkedList.addNode("데이터3");
        simpleLinkedList.print();

        System.out.println("중간에 노드 추가");
        simpleLinkedList.addNode(simpleLinkedList.getNode("데이터1"), "데이터1-1");
        simpleLinkedList.print();

        System.out.println("마지막 노드 삭제");
        simpleLinkedList.remove();
        simpleLinkedList.print();

        System.out.println("중간 노드 삭제");
        simpleLinkedList.remove(simpleLinkedList.getNode("데이터1-1"));
        simpleLinkedList.print();
    }

    public static void circularLinkedList() {
        System.out.println("--------------- 원형 연결 리스트 ---------------");

        System.out.println("노드 추가");
        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.addNode("데이터1");
        circularLinkedList.addNode("데이터2");
        circularLinkedList.addNode("데이터3");
        circularLinkedList.print();

        System.out.println("중간에 노드 추가");
        circularLinkedList.addNode(circularLinkedList.getNode("데이터1"), "데이터1-1");
        circularLinkedList.print();

        System.out.println("마지막 노드 삭제");
        circularLinkedList.remove();
        circularLinkedList.print();

        System.out.println("중간 노드 삭제");
        circularLinkedList.remove(circularLinkedList.getNode("데이터1-1"));
        circularLinkedList.print();
    }

    public static void doublyLinkedList() {
        System.out.println("--------------- 이중 연결 리스트 ---------------");

        System.out.println("노드 추가");
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.addNode("데이터1");
        doublyLinkedList.addNode("데이터2");
        doublyLinkedList.addNode("데이터3");
        doublyLinkedList.print();

        System.out.println("중간에 노드 추가");
        doublyLinkedList.addNode(doublyLinkedList.getNode("데이터1"), "데이터1-1");
        doublyLinkedList.print();

        System.out.println("마지막 노드 삭제");
        doublyLinkedList.remove();
        doublyLinkedList.print();

        System.out.println("중간 노드 삭제");
        doublyLinkedList.remove(doublyLinkedList.getNode("데이터1-1"));
        doublyLinkedList.print();
    }
}
