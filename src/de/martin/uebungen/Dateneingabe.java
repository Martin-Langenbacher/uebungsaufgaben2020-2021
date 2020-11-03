package de.martin.uebungen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dateneingabe {

	public static void main(String[] args) throws FileNotFoundException {
		
		//          1    2    3
		// args: [ "1", "2", "3"]
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		
		System.out.println(a + b + c);
		
		// Starten mit "Run Configurations...  --> EINLESEN über Kommandozeile !
		// Dann Werte eingeben
		
		
		
		//********************************************
		
		// Einlesen von Tastatur
		
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int e = sc.nextInt();
		int f = sc.nextInt();
		
		System.out.println(d + e +f);
		
		String g = sc.next();
		System.out.println(g);
		
		
		//********************************************
		
		// Einlesen einer Datei:
		
		Scanner sc2 = new Scanner(new File("test.txt"));
		
		int g2 = sc2.nextInt();
		int h = sc2.nextInt();
		int i = sc2.nextInt();
		
		System.out.println(g2 + h +i);
		
		

	}

}
