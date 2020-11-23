package de.martin.kopfbisfuss;

public class EnumMartin {
	
	
	enum Level {
		LOW,
		MEDIUM,
		HIGH,
		MARTIN_SPECIAL
	}

	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
		myVar = Level.MARTIN_SPECIAL;
		
		switch(myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		case MARTIN_SPECIAL:
			System.out.println("Martin's Spezial-Übung zu Enums!");
			break;
		}
		
		
		Level ausgewählteVar = myVar.LOW;
		if (ausgewählteVar  == myVar.LOW) {
			System.out.println("Richtig");
		} else {
			System.out.println("Falsch");	
		}
		
		
		System.out.println("**************************************************************");	
		for (Level n : Level.values()) {
			System.out.println(n);
		}
		
		

	}

}
