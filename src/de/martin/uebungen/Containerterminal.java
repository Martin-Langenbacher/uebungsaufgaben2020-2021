package de.martin.uebungen;

/**
 * Simulation eines Containerterminals
 * @author André Kless <andre.kless@web.de>
 * @version 1.0.0
 */
public class Containerterminal {

	/* Instanzvariablen */

	private int kran; 			// Position des Krans
	private int max;			// maximale Höhe eines Stapels
	private int[] stapel;		// Anzahl der Container von jedem Stapel
	private boolean container;	// Gibt an, ob der Kran einen Container hat.

	/* Konstruktoren */

	public Containerterminal(int kran, int max, int[] stapel) {
		this.kran = kran;
		this.max = max;
		this.stapel = stapel.clone();
		this.container = false;
	}

	/* Instanzmethoden */

	/** bewegt den Krank nach um eine Position nach Links, falls möglich */
	public void kranLinks() {
		if (this.kran > 0)
			this.kran--;
		else
			System.out.println("Kran kann nicht weiter nach links bewegt werden.");
	}

	/** bewegt den Krank nach um eine Position nach Rechts, falls möglich */
	public void kranRechts() {
		if (this.kran < this.stapel.length - 1)
			this.kran++;
		else
			System.out.println("Kran kann nicht weiter nach rechts bewegt werden.");
	}

	/** nimmt mit den Kran einen Container auf, falls möglich */
	public void containerAufnehmen() {
		if (this.container)
			System.out.println("Der Kran hat schon einen Container.");
		else if (this.stapel[kran] == 0)
			System.out.println("Der Stapel ist leer.");
		else {
			this.stapel[this.kran]--;
			this.container = true;
		}
	}

	/** der Kran legt seinen Container auf dem Stapel ab, falls möglich */
	public void containerAblegen() {
		if (!this.container)
			System.out.println("Der Kran hat keinen Container.");
		else if (this.stapel[kran] == this.max)
			System.out.println("Der Stapel hat schon die maximale Höhe erreicht.");
		else {
			this.stapel[this.kran]++;
			this.container = false;
		}
	}
	
	

	@Override
	public String toString() {
		String darstellung = "Containerterminal\n";

		// erste Zeile (Kran)
		for (int i = 0; i < this.stapel.length; i++)
			darstellung += this.kran == i ? " ^" : "  ";
		darstellung += '\n';

		// zweite Zeile (Container, falls vorhanden)
		for (int i = 0; i < this.stapel.length; i++)
			darstellung += this.kran == i && this.container ? " □" : "  ";
		darstellung += '\n';

		// weitere Zeilen (Containerstapel)
		for (int i = this.max - 1; i >= 0; i--) {
			for (int j = 0; j < this.stapel.length; j++)
				darstellung += this.stapel[j] > i ? " □" : "  ";
			darstellung += '\n';
		}

		return darstellung;
	}

	/* Klassenvariablen */


	/* Klassenmethoden */


}
