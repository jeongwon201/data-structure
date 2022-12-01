package com.datastructure.graph.code;

public class Main {
    public static void main(String[] args) {
        undirected_graph_array();
        undirected_graph_adjacency_list();
        directed_graph_array();
        directed_graph_adjacency_list();
        weighted_graph_array();
        weighted_graph_adjacency_list();
    }

    static void undirected_graph_array() {
        System.out.println("--------------- 무방향 그래프(배열) ---------------");
        UndirectedGraph.Array graph = new UndirectedGraph.Array(5);

        graph.addVertex(0, "데이터A");
        graph.addVertex(1, "데이터B");
        graph.addVertex(2, "데이터C");
        graph.addVertex(3, "데이터D");
        graph.addVertex(4, "데이터E");

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.print();

        graph.removeEdge(2, 3);
        graph.removeEdge(3, 4);
        graph.print();
    }

    static void undirected_graph_adjacency_list() {
        System.out.println("--------------- 무방향 그래프(인접 리스트) ---------------");
        UndirectedGraph.AdjacencyList graph = new UndirectedGraph.AdjacencyList(5);

        graph.addVertex(0, "데이터A");
        graph.addVertex(1, "데이터B");
        graph.addVertex(2, "데이터C");
        graph.addVertex(3, "데이터D");
        graph.addVertex(4, "데이터E");

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.print();

        graph.removeEdge(2, 3);
        graph.removeEdge(3, 4);
        graph.print();
    }

    static void directed_graph_array() {
        System.out.println("--------------- 방향 그래프(배열) ---------------");
        DirectedGraph.Array graph = new DirectedGraph.Array(5);

        graph.addVertex(0, "데이터A");
        graph.addVertex(1, "데이터B");
        graph.addVertex(2, "데이터C");
        graph.addVertex(3, "데이터D");
        graph.addVertex(4, "데이터E");

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.print();

        graph.removeEdge(2, 3);
        graph.removeEdge(3, 4);
        graph.print();
    }

    static void directed_graph_adjacency_list() {
        System.out.println("--------------- 방향 그래프(인접 리스트) ---------------");
        DirectedGraph.AdjacencyList graph = new DirectedGraph.AdjacencyList(5);

        graph.addVertex(0, "데이터A");
        graph.addVertex(1, "데이터B");
        graph.addVertex(2, "데이터C");
        graph.addVertex(3, "데이터D");
        graph.addVertex(4, "데이터E");

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.print();

        graph.removeEdge(2, 3);
        graph.removeEdge(3, 4);
        graph.print();
    }

    static void weighted_graph_array() {
        System.out.println("--------------- 가중치 방향 그래프(배열) ---------------");
        WeightedGraph.Array graph = new WeightedGraph.Array(5);

        graph.addVertex(0, "데이터A");
        graph.addVertex(1, "데이터B");
        graph.addVertex(2, "데이터C");
        graph.addVertex(3, "데이터D");
        graph.addVertex(4, "데이터E");

        graph.addEdge(0,1, 1);
        graph.addEdge(1,2, 1);
        graph.addEdge(2,3, 2);
        graph.addEdge(3,4, 4);
        graph.print();

        graph.removeEdge(2, 3);
        graph.removeEdge(3, 4);
        graph.print();
    }

    static void weighted_graph_adjacency_list() {
        System.out.println("--------------- 가중치 방향 그래프(인접 리스트) ---------------");
        WeightedGraph.AdjacencyList graph = new WeightedGraph.AdjacencyList(5);

        graph.addVertex(0, "데이터A");
        graph.addVertex(1, "데이터B");
        graph.addVertex(2, "데이터C");
        graph.addVertex(3, "데이터D");
        graph.addVertex(4, "데이터E");

        graph.addEdge(0,1, 1);
        graph.addEdge(1,2, 1);
        graph.addEdge(2,3, 2);
        graph.addEdge(3,4, 4);
        graph.print();
        graph.print();

        graph.removeEdge(2, 3);
        graph.removeEdge(3, 4);
        graph.print();
    }
}
