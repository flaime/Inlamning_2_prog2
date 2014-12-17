package graphs;

import java.nio.channels.IllegalSelectorException;
import java.util.*;


public class ListGraph<Typ> {
	
	private Map<Typ, ArrayList<Edge<Typ>>> nodFörbindelser = new HashMap<>();//inehåler alla noder och förbindelser
	
	
	public boolean add(Typ platts){
		if(nodFörbindelser.containsKey(platts)) {
//			System.out.println("denn finns redan----------------------------------------");
			return false;
		}else {
//			System.out.println("platts = " + platts + " finns ej");
			nodFörbindelser.put(platts, new ArrayList<Edge<Typ>>());
			return true;
		}
	}

	/*
	 * tar emot en nod och stoppar in den i grafen. Om noden redan finns i
	 * grafen blir det ingen förändring.
	 */

	public void connect(Typ nod1, Typ nod2, String namn, int vikt){
		if (existerarNod(nod1, nod2) == false) {
			throw new IllegalArgumentException(); //någon eller båda plattser finns ej
		}
		if(vikt < 0)
			throw new IllegalSelectorException(); //om vikten är mindre än 0 
		
		if (getEdgeBetween(nod1,nod2) != null) {
			throw new IllegalStateException();//om en båge redan finns
		}
		
		//skulle kunna skapa dem direkt när jag lägger in dem...
		Edge<Typ> förbindelseTill = new Edge<Typ>(nod1, vikt, namn); 
		Edge<Typ> förbindelseFrån = new Edge<Typ>(nod2, vikt, namn);
		
			
		nodFörbindelser.get(nod2).add(förbindelseTill);
		nodFörbindelser.get(nod1).add(förbindelseFrån);
		
	}

	/*
	 * – tar två noder, en sträng (namnet på förbindelsen) och ett heltal
	 * (förbindelsens vikt) och kopplar ihop dessa noder med bågar med detta
	 * namn och denna vikt. Om någon av noderna saknas i grafen ska undantaget
	 * NoSuchElementException från paketet java.util genereras. Om vikten är
	 * negativ ska undantaget IllegalArgumentException genereras. Om en båge
	 * redan finns mellan dessa två noder ska undantaget IllegalStateException
	 * genereras (det ska finnas högst en förbindelse mellan två noder). Obs att
	 * grafen ska vara oriktad, d.v.s. bågar riktade mot den andra noden måste
	 * stoppas in hos de båda noderna. I en oriktad graf förekommer ju alltid
	 * bågarna i par: från nod 1 till nod 2 och tvärtom.
	 */

	public void setConnectionWeight(Typ nod1, Typ nod2, int nyVikt){
		if (existerarNod(nod1, nod2) == false) {
			throw new NoSuchElementException();
		}
		if(nyVikt < 0)
			throw new IllegalArgumentException();
		for(Edge<Typ> nodFörbindelse: nodFörbindelser.get(nod1)){ //för ena förbindelsen
			if(nodFörbindelse.getDestination() == nod2){
				nodFörbindelse.setWeight(nyVikt);
				//TODO fråga: om jag borde lägga in en breake här så att den inte går ignom onödigt många?
			}
				
		}
		
		for(Edge<Typ> nodFörbindelse: nodFörbindelser.get(nod2)){//för andra förebindelsen
			if(nodFörbindelse.getDestination() == nod1){
				nodFörbindelse.setWeight(nyVikt);
				//TODO fråga: om jag borde lägga in en breake här så att den inte går ignom onödigt många?
			}
				
		}
		
	}

	/*
	 * ◦ setConnectionWeight – tar två noder och ett heltal (förbindelsens nya
	 * vikt) och sätter denna vikt som den nya vikten hos förbindelsen mellan
	 * dessa två noder. Om någon av noderna saknas i grafen eller ingen båge
	 * finns mellan dessa två noder ska undantaget NoSuchElementException från
	 * paketet java.util genereras. Om vikten är negativ ska undantaget
	 * IllegalArgumentException genereras.
	 */

	public Set<Typ> getNodes(){
		return nodFörbindelser.keySet();
	}

	/*
	 * returnerar en kopia av mängden av alla noder (kopior av referenser till
	 * nodobjekten, nodobjekten själva ska inte kopieras)
	 */

	public ArrayList<Edge<Typ>> getEdgesFrom(Typ nod){
		if (existerarNod(nod) == false) {
			throw new NoSuchElementException();
		}
		return nodFörbindelser.get(nod);
	}

	/*
	 * – tar en nod och returnerar en kopia av samlingen av alla bågar som leder
	 * från denna nod. Om noden saknas i grafen ska undantaget
	 * NoSuchElementException genereras.
	 */

	public Edge<Typ> getEdgeBetween(Typ nod1, Typ nod2){//TODO denna metod tror jag inte gör som den ska/inte funkar
		if (existerarNod(nod1, nod2) == false){
			throw new NoSuchElementException();
		}

		for( Edge<Typ> edge: nodFörbindelser.get(nod1))
		{
			if(nod2 == edge.getDestination())
				return edge;
		}
		return null;
	}
	/*
	 * tar två noder och returnerar bågen mellan dessa noder. Om någon av
	 * noderna saknas i grafen ska undantaget NoSuchElementException genereras.
	 * Om det inte finns någon båge mellan noderna resturneras null.
	 */
	
	public boolean existerarNod(Typ nod1, Typ nod2){
		if((nodFörbindelser.containsKey(nod1) && nodFörbindelser.containsKey(nod2)) == false || (nodFörbindelser.containsKey(nod1) || nodFörbindelser.containsKey(nod2)) == false)
			return false;
		return true;
	}
	public boolean existerarNod(Typ nod1){//TODO chage to private
		if(nodFörbindelser.containsKey(nod1) == false)
			return false;
		return true;
	}
	
	/*
	 * Två metoder för att avgöra om en eller två noder existerar eller ej
	 */
	
	

	public String toString(){
		String innehåll =""; //"[ ";
		for(Typ nykeln : nodFörbindelser.keySet()){
			innehåll += "[Nyckel = " + nykeln;
			for(Edge<Typ> förbindelser: nodFörbindelser.get(nykeln)){
				innehåll += ", " + förbindelser.toString();
			}
			innehåll += "]\n";
		}
//		innehåll += "]";
		
		return innehåll;
	}

	/*
	 * returnerar en lång sträng med strängar tagna från nodernas
	 * toStringmetoder och bågarnas toString-metoder, gärna med radbrytningar så
	 * att man får information om en nod per rad för förbättrad läsbarhet.
	 */

	public void disconnect(Typ nod1, Typ nod2){
		if (existerarNod(nod1, nod2) == false) {
			throw new NoSuchElementException(); //någon eller båda plattser finns ej
		}	
		
		for (Iterator<Edge<Typ>> iterator = nodFörbindelser.get(nod1).iterator(); iterator.hasNext();) {//letar och plocklar bort förbindelser från nod1 först
		    Edge<Typ> edge = iterator.next();
		    if (nod2 == edge.getDestination()) {
		        iterator.remove();
		    }
		}
		
		for (Iterator<Edge<Typ>> iterator = nodFörbindelser.get(nod2).iterator(); iterator.hasNext();) {//letar och plocklar bort förbindelser från nod2 sen
		    Edge<Typ> edge = iterator.next();
		    if (nod1 == edge.getDestination()) {
		        iterator.remove();
		    }
		}		
	}

	/*
	 * behövs för högre betyg
	 * 
	 * tar två noder och tar bort bågen mellan dem, ger NoSuchElementException
	 * om någon av noderna inte finns i grafen, gör ingenting om noderna inte
	 * har någon direktförbindelse
	 */

	public void remove(Typ nod){//TODO detta är inte en bra lösningn men en fungerande skriv om detta!
		if (existerarNod(nod)) {//finns noden? om ja så fortsätt 

			for (int i = 0; i < nodFörbindelser.size(); i++) {
				try {
					for (Iterator<Edge<Typ>> iterator = nodFörbindelser.get(nod).iterator(); iterator.hasNext();) {//letar och plocklar bort förbindelser från nod2 sen
					    Edge<Typ> edge = iterator.next();
						System.out.println("nod = " + nod + " edge destination = " + edge.getDestination());
						    
						    
						    
							disconnect(nod, edge.getDestination());
					}
				} catch (Exception e) {
					//tja inget det är bra för att kunna testa det 
				}
			}
		}
	}

	/*
	 * tar en nod och tar bort den och alla bågar från och till den från grafen,
	 * gör ingenting om noden inte finns i grafen
	 */

	
}
