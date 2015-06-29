public class Tankwaggon extends Waggon {
	// Attribute
	private final double maxFluessigkeit = 2300.5;
	private double mengeFluessigkeit = 0.;
	private boolean fluessigkeitGiftig = false;
	
	// Konstruktor
	public Tankwaggon(int anzAchsen, double spurbreite, double laenge){
		super(anzAchsen, spurbreite, laenge);
	}
	
	// Methoden
	public void setMengeFluessigkeit(double mengeFluessigkeit){
		if ( mengeFluessigkeit <= maxFluessigkeit &&  mengeFluessigkeit >= 0 ) {
			this.mengeFluessigkeit = mengeFluessigkeit;
		} else {
			System.out.println("Tankwaggon-Fehler: Keine gültige Flüssigkeitsmenge angegeben (muss zwischen 0-"+maxFluessigkeit+" sein).");
		}
	}
	
	public double getMengeFluessigkeit(){
		return mengeFluessigkeit;
	}
	
	public void setFluessigkeitGiftig(boolean fluessigkeitGiftig){
		this.fluessigkeitGiftig = fluessigkeitGiftig;
	}
	
	public boolean getFluessigkeitGiftig(){
		return fluessigkeitGiftig;
	}
	
	public double getMaxFluessigkeit(){
		return maxFluessigkeit;
	}
	
	public String toString(){
		return "Tankwaggon mit " + mengeFluessigkeit + "L Flüssigkeit von maximal " + maxFluessigkeit + "L. Giftig: " +  fluessigkeitGiftig;
	}
}