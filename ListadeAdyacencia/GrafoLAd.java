public class GrafoLAd {
	
	// funcion para añadir aristas, de donde inicio a fin, pero como no es dirigido 
	//no importa mucho
	public static void addEdge(ArrayList<ArrayList<Integer> > adj, int u, int v){
		
		//como es no dirigido si a(nodo) es adyacente a b, entonces b es adyacente al nodo a
		adj.get(u).add(v);
		adj.get(v).add(u);
	}

	public static void printGraph(ArrayList<ArrayList<Integer> > adj)
	{
		for (int i = 0; i < adj.size(); i++) {
            System.out.println("lista de adyacencia del vertice: " + i);
            System.out.print( i);

			//a partir de aqui se imprimen los adyacentes a la cabeza
			for (int j = 0; j < adj.get(i).size(); j++) {
				System.out.print(" -> "+adj.get(i).get(j));
			}
			System.out.println();
		}
	}

	
}
