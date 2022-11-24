package graph;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphMatrix g= new GraphMatrix(5);
		g.createGraph();
		g.displayMatrix();
		System.out.println("\n\nDFS--> ");
		g.DFS();
	}

}
