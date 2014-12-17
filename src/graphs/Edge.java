package graphs;

/*
 * En klass Edge. Alla v�rden f�r instansvariabler i denna klass ska skickas som argument till
 konstruktorn. Objekt av klassen Edge ska inte kunna skapas av klasser utanf�r graphs-paketet.
 Klassen ska inneh�lla f�ljande metoder:
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
	 * returnerar den nod som b�gen pekar ut.
	 */

	public int getWeight(){
		return weight;
	}

	/*
	 * returnerar b�gens vikt
	 */

	public void setWeight(int weight){
		if(weight < 0)
			throw new IllegalArgumentException();
		this.weight = weight;
	}

	/*
	 * tar ett heltal och s�tter b�gens vikt till det angivna v�rdet. Om vikten
	 * �r negativ ska undantaget IllegalArgumentException genereras.
	 */
	
	public String getName(){
		return name;
	}
	
	/*
	 * returnerar b�gens namn.
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
		
		if(e.getName().equals(this.name) && e.getWeight() == this.weight) //versalk�nslig!
			return true;
		else {
			return false;
		}
	}
	
	/*
	 * returnerar en str�ng som inneh�ller information om den aktuella b�gen.
	 */

}
