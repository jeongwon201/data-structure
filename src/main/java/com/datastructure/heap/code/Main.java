package com.datastructure.heap.code;

public class Main {
    public static void main(String[] args) {
        heap();
    }

    static void heap() {
        Heap heap = new Heap(12);

        heap.add(6);
        heap.add(23);
        heap.add(44);
        heap.add(46);
        heap.add(33);
        heap.add(61);
        heap.add(72);
        heap.add(57);
        heap.add(99);
        heap.add(50);

        heap.print();

        heap.add(7);
        heap.print();

        heap.remove();
        heap.print();
    }
}
