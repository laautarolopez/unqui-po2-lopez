package ar.edu.unq.po2.tp3;

import java.util.*;

public class Counter {
	private ArrayList<Integer> arregloDeEnteros = new ArrayList<Integer>();
	
	public void addNumber(int num) {
		this.arregloDeEnteros.add(num);
	}
	
	public int getEvenOcurrences() {
		int n = 0;
		int i = 0;
		int num;
		while(!this.arregloDeEnteros.isEmpty()) {
			num = this.arregloDeEnteros.get(i);
			n = n + this.unoSiEsPar(num);
			i++;
		}
		return n;
	}
	
	private int unoSiEsPar(int num) {
		if (num % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int getUnevenOcurrences() {
		int n = 0;
		int i = 0;
		int num;
		while(!this.arregloDeEnteros.isEmpty()) {
			num = this.arregloDeEnteros.get(i);
			n = n + this.unoSiEsImpar(num);
			i++;
		}
		return n;
	}

	private int unoSiEsImpar(int num) {
		if (num % 2 == 1) {
			return 1;
		} else {
			return 0;
		}
	}
}