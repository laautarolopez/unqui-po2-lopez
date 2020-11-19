package ar.edu.unq.po2.tp7.Colecciones;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter<E> implements Enumeration<E> {
	private Iterator<E> iterator;
	
	public IteratorAdapter(Iterator<E> iterator) {
		this.iterator = iterator;
	}
	
	public boolean hasMoreElements() {
		return this.iterator.hasNext();
	}
	
	public E nextElement() {
		return this.iterator.next();
	}
	
	public static void main(String[] args0) {
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("hola");
		arrayList.add("mundo");
		arrayList.add("!");
		IteratorAdapter<String> it = new IteratorAdapter<String>(arrayList.iterator());
		System.out.println(it.hasMoreElements());
		System.out.println(it.nextElement());
	}
}