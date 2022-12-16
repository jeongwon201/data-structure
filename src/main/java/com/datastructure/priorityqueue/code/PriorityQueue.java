package com.datastructure.priorityqueue.code;

public class PriorityQueue {

    Integer[] priorityQueue;

    public PriorityQueue(int size) {
        this.priorityQueue = new Integer[size + 1];
    }

    void enQueue(Integer item) {
        int last = 1;

        while (true) {
            if(last > priorityQueue.length) {
                throw new RuntimeException("우선 순위 큐의 크기를 초과했습니다.");
            }

            if (priorityQueue[last] == null) {
                break;
            }

            last++;
        }

        priorityQueue[last] = item;

        int idx = last;

        while (idx > 1) {
            int parentIdx = idx / 2;

            if (priorityQueue[parentIdx] < priorityQueue[idx]) {
                break;
            }

            Integer tmp = priorityQueue[parentIdx];
            priorityQueue[parentIdx] = priorityQueue[idx];
            priorityQueue[idx] = tmp;

            idx = parentIdx;
        }
    }

    void deQueue() {
        if (priorityQueue[1] == null) {
            throw new RuntimeException("비어있는 우선 순위 큐 입니다.");
        }

        int last = 1;
        while (last + 1 < priorityQueue.length && priorityQueue[last + 1] != null) {
            last++;
        }

        priorityQueue[1] = priorityQueue[last];
        priorityQueue[last] = null;

        int idx = 1;

        while (idx * 2 < last) {
            int childIdx = idx * 2;

            if (childIdx + 1 < last && priorityQueue[childIdx] > priorityQueue[childIdx + 1]) {
                childIdx++;
            }

            if (priorityQueue[childIdx] > priorityQueue[idx]) {
                break;
            }

            Integer tmp = priorityQueue[idx];
            priorityQueue[idx] = priorityQueue[childIdx];
            priorityQueue[childIdx] = tmp;

            idx = childIdx;
        }
    }

    Integer peek() {
        if (priorityQueue[1] == null) {
            throw new RuntimeException("비어있는 우선 순위 큐 입니다.");
        }

        return priorityQueue[1];
    }
}
