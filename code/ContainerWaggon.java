public class ContainerWaggon extends Waggon {
	// Attribute
	private int containerPlaetze = 0;
	private final int maxContainerPlaetze = 10;
	
	// Konstruktor
	public ContainerWaggon(int anzAchsen, double spurbreite, double laenge){
		super(anzAchsen, spurbreite, laenge);
	}
	
	// Methoden
	public void setContainerPlaetze(int containerPlaetze){
		if ( containerPlaetze <= maxContainerPlaetze && containerPlaetze >= 0 )
			this.containerPlaetze = containerPlaetze;
		else
			System.out.println("ContainerWaggon-Fehler: Keine gültige Containerplatzanzahl angegeben. Gefordert wurde " + containerPlaetze + ", muss aber zwischen 0-" + maxContainerPlaetze + " sein.");
	}
	
	public int getContainerPlaetze(){
		return containerPlaetze;
	}
	
	public int getMaxContainerPlaetze(){
		return maxContainerPlaetze;
	}
	
	public String toString(){
		return "Container-Waggon mit " + containerPlaetze + " belegten Plaetzen von insgesamt " + maxContainerPlaetze;
	}
}
