package de.martin.uebungen;

public class Containerterminal_testprogramm {
	
	/** Testprogramm für das Cotnainerterminal */
	public static void main(String[] args) {

		Containerterminal terminal = new Containerterminal(2, 3, new int[] {1, 2, 1, 3, 2});
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Legende");
		System.out.println("^: Kran");
		System.out.println("□: Container");
		while (true) {
			System.out.println();
			System.out.println(terminal);
			System.out.println("Menü");
			System.out.println("W: Aufnehmen");
			System.out.println("A: Links");
			System.out.println("S: Ablegen");
			System.out.println("D: Rechts");
			System.out.println("X: Beenden");
			System.out.println();
			System.out.print("Befehl: ");
			switch (sc.next()) {
			case "w":
				terminal.containerAufnehmen();
				break;
			case "a":
				terminal.kranLinks();
				break;
			case "s":
				terminal.containerAblegen();
				break;
			case "d":
				terminal.kranRechts();
				break;
			case "x":
				System.out.println("\nProgram beendet.");
				return;
			}
			sc.close();
		}
	}

}
