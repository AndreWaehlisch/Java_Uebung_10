public class Lokomotive extends Schienenfahrzeug {
	// Attribute
	private boolean zugfuehrer;
	
	// Konstruktor
	public Lokomotive(int anzAchsen, double spurbreite, boolean zugfuehrer){
		super(anzAchsen, spurbreite);
		this.zugfuehrer = zugfuehrer;
	}
	
	// Methoden
	public void setZugfuehrer(boolean zugfuehrer){
		this.zugfuehrer = zugfuehrer;
	}
	
	public boolean getZugfuehrer(){
		return zugfuehrer;
	}
	
	public String toString(){
		if ( zugfuehrer )
			return "Lokomotive MIT Zugführer";
		else
			return "Lokomotive OHNE Zugführer";
	}
}
