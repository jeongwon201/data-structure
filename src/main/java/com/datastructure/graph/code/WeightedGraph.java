package com.datastructure.graph.code;

import java.util.ArrayList;

public class WeightedGraph {

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

        void addEdge(int x, int y, int weight) {
            graph[x][y] = weight;
        }

        void removeEdge(int x, int y) {
            graph[x][y] = 0;
        }

        void print() {
            for (int i = 0; i < graph.length; i++) {
                System.out.print(vertex[i] + " > ");
                for (int j = 0; j < graph.length; j++) {
                    if (graph[i][j] > 0) {
                        System.out.print(vertex[j] + "(" + graph[i][j] + ") ");
                    }
                }

                System.out.println();
            }

            System.out.println();
        }
    }

    static class AdjacencyList {

        class Edge {
            int idx;
            int weight;
        }

        Object[] vertex;

        ArrayList<ArrayList<Edge>> graph;

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

        void addEdge(int x, int y, int weight) {
            Edge edge = new Edge();
            edge.idx = y;
            edge.weight = weight;

            graph.get(x).add(edge);
        }

        void removeEdge(int x, int y) {
            int idx = -1;

            for(Edge edge : graph.get(x)) {
                if(edge.idx == y) {
                    idx = graph.get(x).indexOf(edge);
                    break;
                }
            }

            graph.get(x).remove(idx);
        }

        void print() {
            for(ArrayList<Edge> arrayList : graph) {
                System.out.print(vertex[graph.indexOf(arrayList)] + " > ");

                for(Edge edge : arrayList) {
                    System.out.print(vertex[edge.idx] + "(" + edge.weight + ") ");
                }

                System.out.println();
            }

            System.out.println();
        }
    }
}
