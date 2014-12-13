import graphs.ListGraph;



public class TestKörarKlass {
	
	public static void main(String [] args){
		ListGraph<Platts> lg = new ListGraph<Platts>();
		lg.add(new Platts("Brjönsö"));
		lg.add(new Platts("Stokholm"));
		lg.add(new Platts("Malmö"));
		lg.add(new Platts("Uppsala"));
		lg.add(new Platts("Karsdag"));
		lg.add(new Platts("Övik"));
		lg.add(new Platts("Vällingby"));
		lg.add(new Platts("storfors"));
		lg.add(new Platts("storfors"));
		lg.add(new Platts("storfors"));
		lg.add(new Platts("storfors"));
		
		
		System.out.println(lg.toString());
		
	}
}
