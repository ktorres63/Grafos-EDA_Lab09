
import java.util.ArrayList;

public class Test {
		public static void main(String[] args){
			
			//cantidad de vertices
			int V = 4;
			//se crea un arraylist de los nodos adyacentes al nodo examinado
			ArrayList<ArrayList<Integer> > adj= new ArrayList<ArrayList<Integer> >(V);
			
			//dependiendo de cada nodo yo añado un nuevo array list donde estaran sus adyacentes
			for (int i = 0; i < V; i++)
				adj.add(new ArrayList<Integer>());

			GrafoLAd.addEdge(adj, 0, 1);
			GrafoLAd.addEdge(adj, 1, 3);
			GrafoLAd.addEdge(adj, 3, 2);
			GrafoLAd.addEdge(adj, 2, 0);
			
			
			GrafoLAd.printGraph(adj);
		}
}
