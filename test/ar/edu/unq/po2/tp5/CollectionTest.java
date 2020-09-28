package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CollectionTest {
	private Persona persona1;
	private Persona persona2;
	private Mascota mascota1;
	private Mascota mascota2;
	private ArrayList<SerVivo> collection = new ArrayList<SerVivo>();
	
	@BeforeEach
	public void setUp() {
		persona1 = new Persona("Lautaro", 1997);
		persona2 = new Persona("Nicolas", 2000);
		mascota1 = new Mascota("Luna", "Caniche");
		mascota2 = new Mascota("Roco", "Dogo argentino");
		collection.add(persona1);
		collection.add(persona2);
		collection.add(mascota1);
		collection.add(mascota2);
	}
	
	@Test
	public void testCollection() {
		assertTrue(collection.contains(persona1));
		assertTrue(collection.contains(persona2));
		assertTrue(collection.contains(mascota1));
		assertTrue(collection.contains(mascota2));
		
		Iterator<SerVivo> it = this.collection.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().getNombre());
		}
	}
}