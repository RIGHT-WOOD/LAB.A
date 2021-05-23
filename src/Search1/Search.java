package Search1;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
public class Search {
    ListGraph graph;
    boolean[] visited;

    public GraphTraversal(Listgraph listGraph) {
        this.graph = ListGraph;
        visited = new boolean[ListGraph.graphs.size()];
    }
    public void DFS(){
        for (int i = 0; i < graph.graphs.size();i++){
            if (!visited[i]){
                DFSTraversal(i);
            }
        }
    }
    public void DFSTraversal(int v){
        if (visited[v]) return;
        visited[v] = true;
        System.out.print(v + "->");
        Iterator<Integer> neighbors = graph.graphs.get(v).listIterator();
        while (neighbors.hasNext()){
            int nextNode = neighbors.next();
            if (！visited[nextNode]){
                DFSTraversal(nextNode);
            }
        }
    }
}
