package Graph;

import java.util.List;
import java.util.ArrayList;

public class GraphNode<E> {
    List<GraphNode<E>> supers;
    List<GraphNode<E>> subs;
    E data;

    public GraphNode(E data) {
        supers = new ArrayList();
        subs = new ArrayList();
        this.data = data;
    }
    

    public List<GraphNode<E>> getSupers() {
        return supers;
    }

    public void setSuper(GraphNode<E> node) {
        this.supers.add(node);
    }

    public List<GraphNode<E>> getSubs() {
        return subs;
    }

    public void setSub(GraphNode<E> node) {
        this.subs.add(node);
    }
}
