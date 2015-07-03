public class Zug{
	// Attribute
	private int anzLokomotiven;
	private int anzContainerWaggons;
	private int anzTankwaggons;
	
	public Lokomotive[] lokomotiven;
	public ContainerWaggon[] containerWaggons;
	public Tankwaggon[] tankwaggons;
	
	// Konstruktor
	public Zug(int anzAchsen, double spurbreite, int anzLokomotiven, int anzContainerWaggons, int anzTankwaggons){
		this.anzLokomotiven = anzLokomotiven;
		this.anzContainerWaggons = anzContainerWaggons;
		this.anzTankwaggons = anzTankwaggons;
		
		lokomotiven = new Lokomotive[anzLokomotiven];
		containerWaggons = new ContainerWaggon[anzContainerWaggons];
		tankwaggons = new Tankwaggon[anzTankwaggons];
		
		for(int i=0; i<anzLokomotiven; i++)
			lokomotiven[i] = new Lokomotive(anzAchsen, spurbreite, false); // int anzAchsen, double spurbreite, boolean zugfuehrer
		
		for(int i=0; i<anzContainerWaggons; i++)
			containerWaggons[i] = new ContainerWaggon(anzAchsen, spurbreite, 100.); // int anzAchsen, double spurbreite, double laenge
		
		for(int i=0; i<anzTankwaggons; i++)
			tankwaggons[i] = new Tankwaggon(anzAchsen, spurbreite, 90.); // int anzAchsen, double spurbreite, double laenge
	}
	
	// Methoden
	public int getAnzLokomotiven(){
		return anzLokomotiven;
	}
	
	public int getAnzContainerWaggons(){
		return anzContainerWaggons;
	}
	
	public int getAnzTankwaggons(){
		return anzTankwaggons;
	}
	
	public String toString(){
		String result = "";
		
		for(int i=0; i<anzLokomotiven; i++)
			result = result + lokomotiven[i] + '\n';
		
		for(int i=0; i<anzContainerWaggons; i++)
			result = result + containerWaggons[i] + '\n';
		
		for(int i=0; i<anzTankwaggons; i++)
			result = result + tankwaggons[i] + '\n';
		
		return result;
	}
}
