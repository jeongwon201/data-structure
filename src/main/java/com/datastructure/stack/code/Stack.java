package com.datastructure.stack.code;

public class Stack {
    static class Array {
        final int SIZE = 3;

        int top;
        Object[] stack;

        public Array() {
            top = -1;
            stack = new Object[SIZE];
        }

        void push(Object item) {
            // 스택에 공간이 없으면, 스택 배열의 크기를 증가시킨다.
            if (top == stack.length - 1) {
                Object[] old = stack;
                stack = new Object[stack.length + SIZE];
                for (int i = 0; i < old.length; i++) {
                    stack[i] = old[i];
                }
            }

            stack[++top] = item;
        }

        void pop() {
            if (top == -1) {
                throw new RuntimeException("빈 스택입니다.");
            }

            stack[top] = null;
            top--;
        }

        Object peek() {
            if (top == -1) {
                throw new RuntimeException("빈 스택입니다.");
            }

            return stack[top];
        }
    }

    static class LinkedList {
        class Node {
            // next 는 자기 자신 바로 이전에 들어온 노드를 가리킨다.
            Object data;
            Node next;
        }

        Node top;

        void push(Object data) {
            Node node = new Node();
            node.data = data;
            node.next = top;

            top = node;
        }

        void pop() {
            if (top == null) {
                throw new RuntimeException("빈 스택입니다.");
            }

            top = top.next;
        }

        Object peek() {
            if (top == null) {
                throw new RuntimeException("빈 스택입니다.");
            }

            return top.data;
        }
    }
}
