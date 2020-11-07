package de.martin.uebungen;

public class Stack<T> {
	
	// ohne Generics: --> private String[] var  >>>oder<<< private int[] var2... Aber ich benötigen dann 2 verschiedene Klassen für Stack (StackString/StackInt)...
	private T[] stapel;
	
	public Stack(int size) {
		this.stapel = (T[])(new Object[size]);
	}
	
	// Methode: push()
	public void push(T s) {
		for (int i = 0; i < stapel.length; i++) {
			if (stapel[i] == null) {
				stapel[i] = s;
				return;
			}
		}
		System.out.println("Der Stack ist schon voll!");
	}
	
	
	// Methode: pop()
	public T pop() {
		if (stapel[0] == null) {
			System.out.println("Stapel ist leer.");
			return null;
		}
		for (int i = 0; i < stapel.length; i++) {
			if (stapel[i] == null) {
				return stapel[i -1];
			}
		}
		return stapel[stapel.length -1];
	}
	

	// https://de.wikipedia.org/wiki/Decorator
	
}
