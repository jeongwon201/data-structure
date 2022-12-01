package com.datastructure.stack.code;

public class Main {
    public static void main(String[] args) {
        stack_array();
        stack_linked_list();
    }

    static void stack_array() {
        System.out.println("--------------- 스택 - 배열 구현 ---------------");
        Stack.Array stack = new Stack.Array();

        stack.push("데이터1");
        System.out.println(stack.peek());

        stack.push("데이터2");
        System.out.println(stack.peek());

        stack.push("데이터3");
        System.out.println(stack.peek());

        stack.push("데이터4");
        System.out.println(stack.peek());

        stack.push("데이터5");
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());
    }

    static void stack_linked_list() {
        System.out.println("--------------- 스택 - 연결 리스트 구현 ---------------");
        Stack.LinkedList stack = new Stack.LinkedList();

        stack.push("데이터1");
        System.out.println(stack.peek());

        stack.push("데이터2");
        System.out.println(stack.peek());

        stack.push("데이터3");
        System.out.println(stack.peek());

        stack.push("데이터4");
        System.out.println(stack.peek());

        stack.push("데이터5");
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());
    }
}
