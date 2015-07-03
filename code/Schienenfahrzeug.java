public abstract class Schienenfahrzeug {
	// Attribute
	private int anzAchsen;
	private double spurbreite;
	
	// Konstruktor
	public Schienenfahrzeug(int anzAchsen, double spurbreite){
		this.anzAchsen = anzAchsen;
		this.spurbreite = spurbreite;
	}
	
	// Methoden
	public int getAnzAchsen(){
		return anzAchsen;
	};
	
	public double getSpurbreite(){
		return spurbreite;
	};
}
