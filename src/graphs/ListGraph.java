package graphs;

import java.util.HashMap;
import java.util.HashSet;

public class ListGraph<Typ> {

	HashSet<Typ> plattser = new HashSet<>();
	public boolean add(Typ platts){
		if(plattser.contains(platts)){
			return false;
		}else {
			plattser.add(platts);
			return true;
		}
	}

	/*
	 * tar emot en nod och stoppar in den i grafen. Om noden redan finns i
	 * grafen blir det ingen förändring.
	 */

	public connect(){
		
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

	public setConnectionWeight(){
		
	}

	/*
	 * ◦ setConnectionWeight – tar två noder och ett heltal (förbindelsens nya
	 * vikt) och sätter denna vikt som den nya vikten hos förbindelsen mellan
	 * dessa två noder. Om någon av noderna saknas i grafen eller ingen båge
	 * finns mellan dessa två noder ska undantaget NoSuchElementException från
	 * paketet java.util genereras. Om vikten är negativ ska undantaget
	 * IllegalArgumentException genereras.
	 */

	public getNodes();

	/*
	 * returnerar en kopia av mängden av alla noder (kopior av referenser till
	 * nodobjekten, nodobjekten själva ska inte kopieras)
	 */

	public getEdgesFrom();

	/*
	 * – tar en nod och returnerar en kopia av samlingen av alla bågar som leder
	 * från denna nod. Om noden saknas i grafen ska undantaget
	 * NoSuchElementException genereras.
	 */

	public getEdgeBetween();

	/*
	 * tar två noder och returnerar bågen mellan dessa noder. Om någon av
	 * noderna saknas i grafen ska undantaget NoSuchElementException genereras.
	 * Om det inte finns någon båge mellan noderna resturneras null.
	 */

	public toString();

	/*
	 * returnerar en lång sträng med strängar tagna från nodernas
	 * toStringmetoder och bågarnas toString-metoder, gärna med radbrytningar så
	 * att man får information om en nod per rad för förbättrad läsbarhet.
	 */

	public disconnect();

	/*
	 * behövs för högre betyg
	 * 
	 * tar två noder och tar bort bågen mellan dem, ger NoSuchElementException
	 * om någon av noderna inte finns i grafen, gör ingenting om noderna inte
	 * har någon direktförbindelse
	 */

	public remove();

	/*
	 * tar en nod och tar bort den och alla bågar från och till den från grafen,
	 * gör ingenting om noden inte finns i grafen
	 */

	/*
	 * OBS!
	 * 
	 * Obs! Följande två metoder flyttas ut från klassen ListGraph till klassen
	 * GraphMethods om man föbereder biblioteket för alternativa
	 * implementeringar av grafer. Gör man det så måste även argumentlistan
	 * kompletteras.
	 * 
	 * OBS!
	 */

	public pathExists();

	/*
	 * tar två noder och returnerar true om det finns en väg genom grafen från
	 * den ena noden till den andra (eventuellt över många andra noder), annars
	 * returneras false. Om någon av noderna inte finns i grafen returneras
	 * också false. Använder sig av en hjälpmetod för djupet-först-sökning genom
	 * en graf.
	 */

	public getPath();

	/*
	 * tar två noder och returnerar en lista (java.util.List) med bågar som
	 * representerar en väg mellan dessa noder genom grafen, eller null om det
	 * inte finns någon väg mellan dessa två noder. I den enklaste varianten
	 * (för betyget E) räcker det alltså att metoden returnerar någon väg – i en
	 * mer avancerad variant ska den reurnerar den snabbaste vägen.
	 */
	
}
