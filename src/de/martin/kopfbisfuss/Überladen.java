package de.martin.kopfbisfuss;

public class Überladen {
	
	String eindeutigeID;
	
	public int zahenHinzufügen(int a, int b) {
	return a+b;
	}
	
	public double zahlenHinzufügen(double a, double b ) {
		return a+b;
	}
	
	
	public void setEindeutigeID(String dieID) {
		// massenhaft Validierungscode und dann:
		eindeutigeID = dieID;
	}

	
	public void setEindeutigeID(int zahlID) {
		String zahlString = "" + zahlID;
		setEindeutigeID(zahlString);
	}
}
