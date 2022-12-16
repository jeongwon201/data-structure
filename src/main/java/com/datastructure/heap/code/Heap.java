package com.datastructure.heap.code;


import java.util.Arrays;

public class Heap {
    Integer[] heap;

    Heap(int size) {
        this.heap = new Integer[size + 1];
    }

    void add(Integer item) {
        int last = 1;
        while (true) {
            if(last > heap.length) {
                throw new RuntimeException("힙의 크기를 초과했습니다.");
            }
            if (heap[last] == null) {
                break;
            }

            last++;
        }

        heap[last] = item;

        int idx = last;

        while (idx > 1) {
            int parentIdx = idx / 2;

            if (heap[parentIdx] < heap[idx]) {
                break;
            }

            Integer tmp = heap[parentIdx];
            heap[parentIdx] = heap[idx];
            heap[idx] = tmp;

            idx = parentIdx;
        }
    }

    void remove() {
        if (heap[1] == null) {
            throw new RuntimeException("비어있는 힙 입니다.");
        }

        int last = 1;
        while (last + 1 < heap.length && heap[last + 1] != null) {
            last++;
        }

        heap[1] = heap[last];
        heap[last] = null;

        int idx = 1;

        while (idx * 2 < last) {
            int childIdx = idx * 2;

            if (childIdx + 1 < last && heap[childIdx] > heap[childIdx + 1]) {
                childIdx++;
            }

            if (heap[childIdx] > heap[idx]) {
                break;
            }

            Integer tmp = heap[idx];
            heap[idx] = heap[childIdx];
            heap[childIdx] = tmp;

            idx = childIdx;
        }
    }

    void print() {
        System.out.println(Arrays.toString(heap));
    }
}
