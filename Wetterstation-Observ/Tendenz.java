package WEtter;

import java.util.Observable;
import java.util.Observer;

public class Tendenz implements Observer{
	int lastTemp;
	int lastFeucht;
	int lastDruck;
	@Override
	public void update(Observable o, Object arg) {
		int temp = ((MessDaten) arg).getTemperatur();
		int feucht = ((MessDaten) arg).getFeuchtigkeit();
		int druck = ((MessDaten) arg).getDruck();
		
		System.out.print("Tendenz: ");

		if (temp >= lastTemp){
			System.out.print("Temp + ");
		}
		else {
			System.out.print("Temp - ");
		}
		
		if (feucht >= lastFeucht){
			System.out.print("Feucht + ");
		}
		else {
			System.out.print("Feucht - ");
		}
		
		if (druck >= lastDruck){
			System.out.println("Druck + ");
		}
		else {
			System.out.println("Druck - ");
		}
		
		lastTemp = temp;
		lastFeucht = feucht;
		lastDruck = druck;
		
	}
}
