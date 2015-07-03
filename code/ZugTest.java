public class ZugTest {
	public static void printZug(Zug input){
		System.out.println( "Zug besteht aus:" );
		System.out.println( input );
		System.out.println( "--------------------" );
	}

	public static void main(String[] args) {
		/////////
		// Zug erstellen
		Zug testzug = new Zug(4, 10., 2, 1, 3); // int anzAchsen, double spurbreite, int anzLokomotiven, int anzContainerWaggons, int anzTankwaggons
		printZug( testzug );

		/////////
		// Erste (beispielsweise vordere) Lokomotive kriegt Zugführer, ein Tankwaggon wird voll mit Gift beladen 
		Lokomotive loko0 = testzug.lokomotiven[0];
		loko0.setZugfuehrer( true );

		Tankwaggon tank0 = testzug.tankwaggons[0];
		tank0.setMengeFluessigkeit( tank0.getMaxFluessigkeit() );
		tank0.setFluessigkeitGiftig( true );

		printZug( testzug );

		/////////
		// Zweiter Tankwaggon mit 10L betanken (ungiftig) und versuchen, Container-Waggon mit ungültiger Menge zu beladen
		Tankwaggon tank1 = testzug.tankwaggons[1];
		tank1.setMengeFluessigkeit( 10 );

		testzug.containerWaggons[0].setContainerPlaetze( 11 ); // ungültige Containeranzahl

		printZug( testzug );

		/////////
		// Ersten Zugführer austeigen lassen und zweiten einsteigen lassen, Tankwagen befüllen/leeren
		loko0.setZugfuehrer( false );

		testzug.lokomotiven[1].setZugfuehrer( true );

		Tankwaggon tank2 = testzug.tankwaggons[2];
		tank2.setMengeFluessigkeit( tank1.getMengeFluessigkeit() );
		tank1.setMengeFluessigkeit( 0 );

		printZug( testzug );
	}
}
