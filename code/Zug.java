public class Zug {
	// Attribute
	private int anzLokomotiven;
	private int anzContainerWaggons;
	private int anzTankwaggons;
	Schienenfahrzeug[] lokomotiven;
	Schienenfahrzeug[] containerWaggons;
	Schienenfahrzeug[] tankwaggons;
	
	// Konstruktor
	public Zug(int anzLokomotiven, int anzContainerWaggons, int anzTankwaggons){
		this.anzLokomotiven = anzLokomotiven;
		this.anzContainerWaggons = anzContainerWaggons;
		this.anzTankwaggons = anzTankwaggons;
		
		Schienenfahrzeug[] lokomotiven = new Schienenfahrzeug[anzLokomotiven];
		Schienenfahrzeug[] containerWaggons = new Schienenfahrzeug[anzContainerWaggons];
		Schienenfahrzeug[] tankwaggons = new Schienenfahrzeug[anzTankwaggons];
		
		for(int i=0; i<anzLokomotiven; i++){
			lokomotiven[i] = new Lokomotive(4, 10, true);
		}
		
		for(int i=0; i<anzContainerWaggons; i++){
			containerWaggons[i] = new ContainerWaggon(4, 10, 100);
		}
		
		for(int i=0; i<anzTankwaggons; i++){
			tankwaggons[i] = new Tankwaggon(4, 10, 90);
		}
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
		
		for(int i=0; i<anzLokomotiven; i++){
			result = result + lokomotiven[i] + '\n';
		}
		
		for(int i=0; i<anzContainerWaggons; i++){
			result = result + containerWaggons[i] + '\n';
		}
		
		for(int i=0; i<anzTankwaggons; i++){
			result = result + tankwaggons[i] + '\n';
		}
		
		return result;
	}
}