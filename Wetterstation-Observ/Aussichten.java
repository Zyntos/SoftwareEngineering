package WEtter;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;


public class Aussichten implements Observer{
	private String vorhersage;
	
	private String[] texte = {
			"regnerisch", "trüb", "neblig", "stürmisch", "wechselhaft bewölkt",
			"sonnig", "heiter", "frostig" 
	};

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		berechneVorhersage(((MessDaten) arg));
		System.out.println("Die weiteren Aussichten: " + vorhersage);
	}
	private void berechneVorhersage(MessDaten daten){
		Random random = new Random();
		int index1 = random.nextInt(texte.length);
		int index2 = random.nextInt(texte.length);
		while(index2 == index1){
			 index2 = random.nextInt(texte.length);
		}
		vorhersage = texte[index1] + " und " + texte[index2];
	}
	
}
