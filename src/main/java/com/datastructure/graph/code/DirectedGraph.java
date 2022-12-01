package com.datastructure.graph.code;

import java.util.ArrayList;

public class DirectedGraph {

    static class Array {
        int[][] graph;
        Object[] vertex;

        Array(int n) {
            graph = new int[n][n];
            vertex = new Object[n];
        }

        void addVertex(int idx, Object item) {
            vertex[idx] = item;
        }

        void addEdge(int x, int y) {
            graph[x][y] = 1;
        }

        void removeEdge(int x, int y) {
            graph[x][y] = 0;
        }

        void print() {
            for (int i = 0; i < graph.length; i++) {
                System.out.print(vertex[i] + " > ");
                for (int j = 0; j < graph.length; j++) {
                    if (graph[i][j] == 1) {
                        System.out.print(vertex[j] + " ");
                    }
                }

                System.out.println();
            }

            System.out.println();
        }
    }

    static class AdjacencyList {

        Object[] vertex;

        ArrayList<ArrayList<Integer>> graph;

        AdjacencyList(int n) {
            vertex = new Object[n];
            graph = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                graph.add(new ArrayList<>());
            }
        }

        void addVertex(int idx, Object item) {
            vertex[idx] = item;
        }

        void addEdge(int x, int y) {
            graph.get(x).add(y);
        }

        void removeEdge(int x, int y) {
            graph.get(x).remove(graph.get(x).indexOf(y));
        }

        void print() {
            for (int i = 0; i < graph.size(); i++) {
                System.out.print(vertex[i] + " > ");

                for (int j = 0; j < graph.get(i).size(); j++) {
                    System.out.print(vertex[graph.get(i).get(j)] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }
    }
}
