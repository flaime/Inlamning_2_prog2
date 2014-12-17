import graphs.ListGraph;



public class TestK�rarKlass {
	
	public static void main(String [] args){
		ListGraph<Platts> lg = new ListGraph<Platts>();
		
		Platts bj�rns� = new Platts("Bj�rns�");
		lg.add(bj�rns�);
		
		Platts stockholm = new Platts("Stokholm");
		lg.add(stockholm);
		
		Platts malm� = new Platts("Malm�");
		lg.add(malm�);
		
		lg.add(new Platts("Uppsala"));
		lg.add(new Platts("Karsdag"));
		lg.add(new Platts("�vik"));
		lg.add(new Platts("V�llingby"));
		lg.add(new Platts("storfors"));
//		lg.add(new Platts("storfors"));
//		lg.add(new Platts("storfors"));
//		lg.add(new Platts("storfors"));
		
		
		lg.connect(stockholm, bj�rns�, "Bil", 10);
		lg.connect(bj�rns�, malm�, "flyg", 2);
		lg.connect(stockholm, malm�, "Bil", 10);
		
//		System.out.println(lg.getEdgesFrom(stockholm));
		System.out.println(lg.toString());
		
//		lg.disconnect(malm�, bj�rns�);
		lg.remove(bj�rns�);
		System.out.println("\n\n");
		
		System.out.println(lg.toString());

		
	}
}
