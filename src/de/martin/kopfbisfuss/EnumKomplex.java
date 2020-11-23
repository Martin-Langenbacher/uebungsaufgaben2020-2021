package de.martin.kopfbisfuss;

public class EnumKomplex {
	
	enum Namen {
		  // "Lead-Gitarre" ist ein Argument, das dem unten deklarierten Konstruktor übergeben wird.
		JERRY("Lead-Gitarre") { public String singt() {                                   // --> (1)
			return "klagend"; }
		}, 
		BOBBY("Rhythmus-Gitarre") { public String singt() {                               // --> (1)
			return "heiser"; }
		},
		PHIL("Bass");
		
		private String instrument;
		
		
		// Konstruktor des Enum. Er wird für jeden deklarierten Enum-Wert einmal ausgeführt (in diesem Fall 3x)
		Namen(String instrument) {
			this.instrument = instrument;
		}
		
		
		public String getInstrument() {
			return this.instrument;
		}
		
		
		public String singt() {
			return "gelegentlich";
		}
		
	}
		
	
	public static void main(String[] args) {
		for (Namen n : Namen.values() ) {                                // <== Jedes Enum besitzt eine eingebaute 'values()'-Methode,
			System.out.print(n);                                         //     die, wie hier gezeigt, üblicherweise einer 'for'-Schleife
			System.out.print(", Instrument: " + n.getInstrument());      //     verwendet wird.
			System.out.println(", singt: " + n.singt());
		}
	}
}
// Beachten Sie, dass die elementare 'singt()'-Methode nur aufgerufen wird, wenn der Enum-Wert keinen konstantenspezifischen Klassen-Body hat.



