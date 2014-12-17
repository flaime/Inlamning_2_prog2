import graphs.ListGraph;



public class TestKörarKlass {
	
	public static void main(String [] args){
		ListGraph<Platts> lg = new ListGraph<Platts>();
		
		Platts björnsö = new Platts("Björnsö");
		lg.add(björnsö);
		
		Platts stockholm = new Platts("Stokholm");
		lg.add(stockholm);
		
		Platts malmö = new Platts("Malmö");
		lg.add(malmö);
		
		lg.add(new Platts("Uppsala"));
		lg.add(new Platts("Karsdag"));
		lg.add(new Platts("Övik"));
		lg.add(new Platts("Vällingby"));
		lg.add(new Platts("storfors"));
//		lg.add(new Platts("storfors"));
//		lg.add(new Platts("storfors"));
//		lg.add(new Platts("storfors"));
		
		
		lg.connect(stockholm, björnsö, "Bil", 10);
		lg.connect(björnsö, malmö, "flyg", 2);
		lg.connect(stockholm, malmö, "Bil", 10);
		
//		System.out.println(lg.getEdgesFrom(stockholm));
		System.out.println(lg.toString());
		
//		lg.disconnect(malmö, björnsö);
		lg.remove(björnsö);
		System.out.println("\n\n");
		
		System.out.println(lg.toString());

		
	}
}
