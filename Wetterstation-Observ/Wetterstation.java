package WEtter;


import java.util.Observable;


public class Wetterstation extends Observable{


	MessDaten daten = new MessDaten();
	AktuelleBedingungen aktuelleBedingungen = new AktuelleBedingungen();
	Tendenz tendenz = new Tendenz();
	Aussichten aussichten = new Aussichten();
	
	// wird aufgerufen, wenn neue Messwerte da sind
	public void messwerteGeaendert(MessDaten daten){
		setChanged();
		notifyObservers(daten);
		
	}
	
	// Simulation der Wetterdaten ...
	public void messungSimulieren(){

		addObserver(new Tendenz());
		addObserver(new Aussichten());
		addObserver(new AktuelleBedingungen());
		Thread thread = new Thread(new Runnable(){
			
			public void run(){
				while (true){
					daten.messen();
					messwerteGeaendert(daten);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		thread.start();
	}
	
	
	public Wetterstation(){
		messungSimulieren();
	}

	public static void main(String [] arg){
		new Wetterstation();
		
	}
}
