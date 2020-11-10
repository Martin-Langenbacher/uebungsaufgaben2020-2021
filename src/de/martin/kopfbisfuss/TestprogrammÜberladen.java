package de.martin.kopfbisfuss;

import java.util.Calendar;

public class TestprogrammÜberladen {

	public static void main(String[] args) {
		
		Überladen zahl = new Überladen();
		
		int a = (int) zahl.zahlenHinzufügen(2, 3);
		System.out.println(a);
		
		
		double b = zahl.zahlenHinzufügen(2.0, 3.0);
		System.out.println(b);
		
		zahl.setEindeutigeID(99);
		System.out.println(zahl.eindeutigeID);
		
		zahl.setEindeutigeID("599.4");
		System.out.println(zahl.eindeutigeID);
		
		
		// Math-Methoden
		double x = Math.abs(240.40);
		System.out.println("Math.abs(): " + x); 
		
		// Boolean: Auspacken:
		//boolean b = new Boolean("true").booleanValue();  --> depricated !!!
		Boolean boolean1 = Boolean.valueOf("true");
		boolean boolean2 = Boolean.parseBoolean("true");
		System.out.println(boolean1);
		System.out.println(boolean2);
		
		// Calendar
		Calendar c = Calendar.getInstance();
		c.set(2014,  0,  6,  17, 40);
		System.out.println(c.getTime());
		long tag1 = c.getTimeInMillis();
		tag1 += 1000 * 60 * 60;
		c.setTimeInMillis(tag1);
		System.out.println("Neue Stunde: " + c.get(c.HOUR_OF_DAY));
		c.add(c.DATE, 35);
		System.out.println("35 Tage hinzurechnen: " + c.getTime());
		c.roll(c.DATE, 35);
		System.out.println("35 Tage rollieren (ohne Wechsel des Monats): " + c.getTime());
		c.set(c.DATE, 1);
		System.out.println("auf 1 setzen:         " + c.getTime());
		
		
		
		
	}

}
