package com.datastructure.priorityqueue.code;

import com.datastructure.heap.code.Heap;

public class Main {
    public static void main(String[] args) {
        priority_queue();
    }

    static void priority_queue() {
        PriorityQueue priorityQueue = new PriorityQueue(10);

        priorityQueue.enQueue(6);
        priorityQueue.enQueue(23);
        priorityQueue.enQueue(44);
        priorityQueue.enQueue(46);
        priorityQueue.enQueue(33);
        priorityQueue.enQueue(61);
        priorityQueue.enQueue(72);
        priorityQueue.enQueue(57);
        priorityQueue.enQueue(99);
        priorityQueue.enQueue(50);

        for(int i=0; i<10; i++) {
            System.out.print(priorityQueue.peek().intValue() + " ");
            priorityQueue.deQueue();
        }
    }
}