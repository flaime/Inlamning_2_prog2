import graphs.ListGraph;



public class TestK�rarKlass {
	
	public static void main(String [] args){
		ListGraph<Platts> lg = new ListGraph<Platts>();
		lg.add(new Platts("Brj�ns�"));
		lg.add(new Platts("Stokholm"));
		lg.add(new Platts("Malm�"));
		lg.add(new Platts("Uppsala"));
		lg.add(new Platts("Karsdag"));
		lg.add(new Platts("�vik"));
		lg.add(new Platts("V�llingby"));
		lg.add(new Platts("storfors"));
		lg.add(new Platts("storfors"));
		lg.add(new Platts("storfors"));
		lg.add(new Platts("storfors"));
		
		
		System.out.println(lg.toString());
		
	}
}
