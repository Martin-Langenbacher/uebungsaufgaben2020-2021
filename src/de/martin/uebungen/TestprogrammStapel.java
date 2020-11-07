package de.martin.uebungen;

import java.util.ArrayList;

public class TestprogrammStapel {

	public static void main(String[] args) {
		
		//Stack stapel = new Stack(1);	// --> ohne Generics
		Stack<String> stapel = new Stack<String>(1);
		stapel.pop();
		stapel.push("Hallo");
		stapel.push("Welt");
		System.out.println(stapel.pop());
		
		System.out.println();
		
		// Auch möglich (geschachtelt): 
		Stack<Integer> stapel2 = new Stack<Integer>(1);
		stapel2.pop();
		stapel2.push(1);
		stapel2.push(2);
		System.out.println(stapel2.pop());
		
		
		// Auch möglich (geschachtelt): 
		Stack<ArrayList<Integer>> stapel3 = new Stack<ArrayList<Integer>>(1);
		
	}

}
