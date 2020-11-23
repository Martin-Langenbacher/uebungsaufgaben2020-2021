package de.martin.kopfbisfuss;

import de.martin.kopfbisfuss.EnumMartin.Level;

public class Berg {
	String name;
	int höhe;
	private BergHöhle höhle1;
	
	public Berg(String n, int h) {  // ohne public ist es package protected...!
		name = n;
		höhe = h; 
		
		höhle1 = new BergHöhle(3);
		// Normale inner Klasse hat immer eine Instanz auf die äußere Klasse!
	}
	
	
	public BergHöhle getHöhle1() {
		return höhle1;
	}
	
	

	public void setHöhle1(BergHöhle höhle1) {
		this.höhle1 = höhle1;
	}

	public String toString() {
		return name + " " + höhe;
	}
	
	
	// Inner Klasse   *==============================================================================>>>
	public class BergHöhle {
		int AnzahlDerBären;
		// String name = "Name_in_der_inneren_Klasse_BergHöhle";  // sobald dies eingeblendet ist, sobald wird der Name der inneren Klasse verwendet!

		public BergHöhle(int anzahlDerBären) {
			super(); // könnte weggelassen werden; weil automatisch drin!
			AnzahlDerBären = anzahlDerBären;
			
			System.out.println("Ich bin in der Berghöhle und kann hier auf den Namen zugreifen: " + name + " (--> name)");
			System.out.println("Ich bin in der Berghöhle und kann hier auf den Namen zugreifen: " + Berg.this.name + " (--> Berg.this.name)");
		}
	}
	// Ende Innere Klasse !   *=======================================================================>>>
	
	
	// Inner Klasse
		public static class BergGeist { // ohne Bezug zu einem bestimmten Berg!
			int alter;

			public BergGeist(int alter) {
				super(); // könnte weggelassen werden; weil automatisch drin!
				this.alter = alter;
				
				System.out.println("Ich bin in der BergGeist Klasse und kann hier nicht auf den Namen zugreifen; das Feld Alter der Klasse geht natürlich: " + alter);
				
			}
		}
		// Ende Innere Klasse !
		
		enum Level {
			LOW,
			MEDIUM,
			HIGH,
			BERG_SPECIAL
		}
		
}


// Normale innere Klasse: Ich muss immer einen Berg haben, sonst gibt es keine BergHöhle!
// Jetzt statisch: Eine Innere Klasse hat keinen Bezug auf die äußere Klasse !