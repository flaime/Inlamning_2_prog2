package graphs;

/*
 * En klass Edge. Alla värden för instansvariabler i denna klass ska skickas som argument till
 konstruktorn. Objekt av klassen Edge ska inte kunna skapas av klasser utanför graphs-paketet.
 Klassen ska innehålla följande metoder:
 */
public class Edge<T> {
	
	private T dest;
	private int weight;
	private String name;
	
	public Edge(T dest, int weight, String name) {
		this.dest = dest;
		this.weight = weight;
		this.name = name;
		//TODO
	}

	public T getDestination(){
		return dest;
	}

	/*
	 * returnerar den nod som bågen pekar ut.
	 */

	public int getWeight(){
		return weight;
	}

	/*
	 * returnerar bågens vikt
	 */

	public void setWeight(int weight){
		if(weight < 0)
			throw new IllegalArgumentException();
		this.weight = weight;
	}

	/*
	 * tar ett heltal och sätter bågens vikt till det angivna värdet. Om vikten
	 * är negativ ska undantaget IllegalArgumentException genereras.
	 */
	
	public String getName(){
		return name;
	}
	
	/*
	 * returnerar bågens namn.
	 */
	
	public String toString(){
		return "namn = " + name + " wikten = " + weight + " destinationen = " + dest.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		Edge e;
		if(obj == this.getClass())
			e =  (Edge) obj;
		else {
			return false;
		}
		
		if(e.getName().equals(this.name) && e.getWeight() == this.weight) //versalkänslig!
			return true;
		else {
			return false;
		}
	}
	
	/*
	 * returnerar en sträng som innehåller information om den aktuella bågen.
	 */

}
