public abstract class Schienenfahrzeug {
	private int anzAchsen;
	private double spurbreite;
	
	public int getAchsen(){
		return anzAchsen;
	};
	
	public double getSpurbreite(){
		return spurbreite;
	};
	
	public Schienenfahrzeug(int anzAchsen, double spurbreite){
		this.anzAchsen = anzAchsen;
		this.spurbreite = spurbreite;
	}
}