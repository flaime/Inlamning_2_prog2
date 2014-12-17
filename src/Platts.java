



public class Platts { //implements Comparable{

	private String namn;
	public Platts(String namn) {
		this.namn = namn;
	}
	
	public String getNamn() {
		return namn;
	}
	
	public String toString(){
		return namn;
	}
	

	public int hashCode() {
		int hash = namn.hashCode();
//		if(namn== "storfors")
//	    	System.out.println(hash);
		return 2;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != this.getClass())
			return false;
		Platts p = (Platts) obj;
		if(p.getNamn() == this.namn)
			return true;
		return false;
	}
	
//	public int compareTo(Object o){
//		if(obj != this.getClass())
//			return false;
//		Platts p = (Platts) obj;
//		if(p.getNamn() == this.namn)
//			return true;
//		return false;
//	}
}
