package graphs;

import java.util.ArrayList;

public class GraphMethods {

	/*
	 * OBS!
	 * 
	 * Obs! F�ljande tv� metoder flyttas ut fr�n klassen ListGraph till klassen
	 * GraphMethods om man f�bereder biblioteket f�r alternativa
	 * implementeringar av grafer. G�r man det s� m�ste �ven argumentlistan
	 * kompletteras.
	 * 
	 * OBS!
	 */

	ListGraph<?> lg;
	public<Typ> boolean pathExists(ListGraph<Typ> lg, Typ fr�n, Typ till){
		this.lg = lg;
		return pathExists(fr�n, till);
		
		// Everything Wrong With the lord of the rings
		//TODO skriv metoden
	}
	
	private<Typ> boolean pathExists(Typ h�r�rJag, Typ till) {
		if (h�r�rJag == till|| h�r�rJag.equals(till)) {//TODO ta reda p� vad det borde vara h�r?
			return true;
		}else {//h�r ska metoden anropas igen med test p� var den ska andropas TODO frts�tt h�r!!
			if(lg.getEdgesFrom(h�r�rJag)){
				
			}
			
		}
		return null;
	}

	/*
	 * tar tv� noder och returnerar true om det finns en v�g genom grafen fr�n
	 * den ena noden till den andra (eventuellt �ver m�nga andra noder), annars
	 * returneras false. Om n�gon av noderna inte finns i grafen returneras
	 * ocks� false. Anv�nder sig av en hj�lpmetod f�r djupet-f�rst-s�kning genom
	 * en graf.
	 */

	public void getPath(){
		//TODO skirv metoden
	}

	/*
	 * tar tv� noder och returnerar en lista (java.util.List) med b�gar som
	 * representerar en v�g mellan dessa noder genom grafen, eller null om det
	 * inte finns n�gon v�g mellan dessa tv� noder. I den enklaste varianten
	 * (f�r betyget E) r�cker det allts� att metoden returnerar n�gon v�g � i en
	 * mer avancerad variant ska den reurnerar den snabbaste v�gen.
	 */
	
}
 