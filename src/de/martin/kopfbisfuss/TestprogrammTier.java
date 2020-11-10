package de.martin.kopfbisfuss;

public class TestprogrammTier {

	public static void main(String[] args) {
		
		Tier[] tiere = new Tier[5];
		
		Hund hund1 = new Hund();
		//
		// Polymorphie -->
		//
		Tier hund2 = new Hund("Benno", "Dalmatiner", 4);
		Tier tier3 = new Katze("Miauiii", "Katze", 7);
		Tier tier4 = new Ente("Quacky", "Ente", 2);
		Tier tier5 = new Fisch("Blubber", "Fisch", 3);
		Tier tierQuatsch = new Tier("QuatschTier", "Gibt-es-NICHT", 0);
		
		Tierbesitzer rudi = new Tierbesitzer();
		
		tiere[0] = hund1;
		tiere[1] = hund2;
		tiere[2] = tier3;
		tiere[3] = tier4;
		tiere[4] = tier5;
		
		
		
		
		
		System.out.println(hund1);
		hund1.bewegen();
		hund1.essen();
		hund1.geräuschMachen();
		hund1.schlafen();
		System.out.println();
		
		System.out.println(hund2);
		hund2.bewegen();
		hund2.essen();
		hund2.geräuschMachen();
		hund2.schlafen();
		System.out.println();
		
		System.out.println(tier3);
		tier3.bewegen();
		tier3.essen();
		tier3.geräuschMachen();
		tier3.schlafen();
		System.out.println();
		
		System.out.println(tier4);
		tier4.bewegen();
		tier4.essen();
		tier4.geräuschMachen();
		tier4.schlafen();
		System.out.println();
		
		System.out.println(tier5);
		tier5.bewegen();
		tier5.essen();
		tier5.geräuschMachen();
		tier5.schlafen();
		System.out.println();
		
		System.out.println("Vor der Schleife: -------------------------------------->");
		for (int i = 0; i < tiere.length; i++) {
			System.out.println(tiere[i]);
			tiere[i].essen();
			tiere[i].geräuschMachen();
			tiere[i].bewegen();
			tiere[i].schlafen();
			System.out.println();
			
		}
		
		System.out.println("Wir rufen den Tierbesitzer auf, der zum Artz geht...");
		rudi.start();
		
		
		System.out.println("mit 'abstract' kann Tier nicht mehr erzeugt werden - nur noch konkrete Tiere!!!");
		System.out.println(tierQuatsch);

	}

}
