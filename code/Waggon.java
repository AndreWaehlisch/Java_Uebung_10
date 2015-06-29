public abstract class Waggon extends Schienenfahrzeug {
	// Attribute
	private double laenge;
	
	// Konstruktor
	public Waggon(int anzAchsen, double spurbreite, double laenge){
		super(anzAchsen, spurbreite);
		this.laenge = laenge;
	}
	
	// Methoden
	public double getLaenge(){
		return laenge;
	}
	
	public String toString(){
		return "Waggon-Länge: " +  laenge;
	}
}