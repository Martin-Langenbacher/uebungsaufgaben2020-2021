package de.martin.uebungen;

import de.martin.kopfbisfuss.Berg;
import de.martin.kopfbisfuss.Berg.BergGeist;
import de.martin.kopfbisfuss.Berg.BergHöhle;

public class Markus {
	
	public static void main(String[] args) {
		
		Berg berg = new Berg("MarkusHöhe", 10);      // Wenn ich Zeile 11 weglasse funktioniert Zeile 12; aber nicht Zeile 14 !!!!
		BergGeist bergGeist = new BergGeist(278);    // Weil BergGeist statisch ist benötige ich KEINE Instanz
		//BergHöhle höle = new BergHöhle();             --> so geht es nicht; da nicht statisch !
		BergHöhle höhle1 = berg.getHöhle1();         // BergHöhle ist NICHT statisch --> Darum benötige ich eine Instanz: Die Insanz ist berg! BergHöhle existiert nie ohne Berg.
		
		
		System.out.println(berg);
		System.out.println(bergGeist);
		System.out.println(höhle1);		
	}

}
