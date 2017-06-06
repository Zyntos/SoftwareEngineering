package WEtter;

import java.util.Observable;
import java.util.Observer;

public class AktuelleBedingungen implements Observer{
	

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("aktuell: " 
				+ ((MessDaten) arg).getTemperatur() + " C " 
				+ ((MessDaten) arg).getFeuchtigkeit() + "% "
				+ ((MessDaten) arg).getDruck() + " hPa ");
	}
}
