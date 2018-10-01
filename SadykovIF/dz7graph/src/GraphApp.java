public class GraphApp {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('K');

        graph.addEdge(0, 1); //AB
        graph.addEdge(1, 2); //BC
        graph.addEdge(2, 3); //CD
        graph.addEdge(0, 4); //AE
        graph.addEdge(4, 5); //EF
        graph.addEdge(5, 3); //FD
        graph.addEdge(0, 6); //AG
        graph.addEdge(6, 7); //GH
        graph.addEdge(7, 8); //HI
        graph.addEdge(8, 3); //ID
        graph.addEdge(0, 9); //AK
        graph.addEdge(9, 3); //KD

        graph.bfs();
    }
}
