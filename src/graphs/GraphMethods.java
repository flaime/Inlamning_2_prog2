package graphs;

import java.util.ArrayList;

public class GraphMethods {

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

	ListGraph<?> lg;
	public<Typ> boolean pathExists(ListGraph<Typ> lg, Typ från, Typ till){
		this.lg = lg;
		return pathExists(från, till);
		
		// Everything Wrong With the lord of the rings
		//TODO skriv metoden
	}
	
	private<Typ> boolean pathExists(Typ härÄrJag, Typ till) {
		if (härÄrJag == till|| härÄrJag.equals(till)) {//TODO ta reda på vad det borde vara här?
			return true;
		}else {//här ska metoden anropas igen med test på var den ska andropas TODO frtsätt här!!
			if(lg.getEdgesFrom(härÄrJag)){
				
			}
			
		}
		return null;
	}

	/*
	 * tar två noder och returnerar true om det finns en väg genom grafen från
	 * den ena noden till den andra (eventuellt över många andra noder), annars
	 * returneras false. Om någon av noderna inte finns i grafen returneras
	 * också false. Använder sig av en hjälpmetod för djupet-först-sökning genom
	 * en graf.
	 */

	public void getPath(){
		//TODO skirv metoden
	}

	/*
	 * tar två noder och returnerar en lista (java.util.List) med bågar som
	 * representerar en väg mellan dessa noder genom grafen, eller null om det
	 * inte finns någon väg mellan dessa två noder. I den enklaste varianten
	 * (för betyget E) räcker det alltså att metoden returnerar någon väg – i en
	 * mer avancerad variant ska den reurnerar den snabbaste vägen.
	 */
	
}
 