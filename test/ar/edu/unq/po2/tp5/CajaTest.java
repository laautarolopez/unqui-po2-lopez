package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaTest {
	private Caja caja;
	private Producto arroz;
	private Producto vino;
	private Producto fideos;
	private ProductoDeCooperativa aceite;
	private ArrayList<Facturable> listaDeProductos = new ArrayList<Facturable>();
	
	
	@BeforeEach
	public void setUp() {
		caja = new Caja();
		arroz = new Producto("Arroz", 18.9d, 20);
		vino = new Producto("Vino", 55d, 12);
		fideos = new Producto("Fideos", 30d, 10);
		aceite = new ProductoDeCooperativa("Aceite", 90d, 34);
		listaDeProductos.add(arroz);
		listaDeProductos.add(vino);
		listaDeProductos.add(fideos);
		listaDeProductos.add(aceite);
	}
	
	@Test
	public void testConstructor() {
		assertEquals(0d, caja.getMontoTotal());
		
		assertEquals("Arroz", arroz.getNombre());
		assertEquals(18.9d, arroz.getPrecio());
		assertEquals(20, arroz.getStock());
		
		assertEquals("Vino", vino.getNombre());
		assertEquals(55d, vino.getPrecio());
		assertEquals(12, vino.getStock());
		
		assertEquals("Fideos", fideos.getNombre());
		assertEquals(30d, fideos.getPrecio());
		assertEquals(10, fideos.getStock());
		
		assertEquals("Aceite", aceite.getNombre());
		assertEquals(81d, aceite.getPrecio());
		assertEquals(34, aceite.getStock());
	}
	
	@Test
	public void testProducto() {
		caja.registrarPago(arroz);
		assertEquals(19, arroz.getStock());
		assertEquals(18.9d, caja.getMontoTotal());
		
		caja.registrarPago(aceite);
		assertEquals(33, aceite.getStock());
		assertEquals(99.9d, caja.getMontoTotal());
		
		caja.registrarPago(aceite);
		assertEquals(32, aceite.getStock());
		assertEquals(180.9d, caja.getMontoTotal());
	}
	
	@Test
	public void testListaDeProductos() {
		caja.registrarPago(listaDeProductos);
		assertEquals(184.9d, caja.getMontoTotal());
		
		assertEquals(19, arroz.getStock());
		assertEquals(11, vino.getStock());
		assertEquals(9, fideos.getStock());
		assertEquals(33, aceite.getStock());
	}
}
