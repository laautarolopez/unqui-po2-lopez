package ar.edu.unq.po2.tp7.Wikipedia;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkEnComunTest {
	private LinkEnComun filtro;
	private Wikipedia berazategui;
	private List<WikipediaPage> wikipedia;
	private Wikipedia quilmes;
	private Wikipedia bernal;
	private Wikipedia balcarce;
	private Wikipedia buenosAires;
	private List<WikipediaPage> linksBerazategui;
	private List<WikipediaPage> linksQuilmes;
	private List<WikipediaPage> linksBernal;
	private List<WikipediaPage> linksBalcarce;
	private List<WikipediaPage> linksBuenosAires;
	private Map<String, WikipediaPage> map = new HashMap<String, WikipediaPage>();
	
	@BeforeEach
	public void setUp() {
		filtro = new LinkEnComun();
		berazategui = new Wikipedia("Berazategui", linksBerazategui, map);
		quilmes = new Wikipedia("Quilmes", linksQuilmes, map);
		bernal = new Wikipedia("Bernal", linksBernal, map);
		balcarce = new Wikipedia("Balcarce", linksBalcarce, map);
		buenosAires = new Wikipedia("Buenos Aires", linksBuenosAires, map);
		linksBerazategui = Arrays.asList(quilmes, buenosAires);
		linksQuilmes = Arrays.asList(bernal, berazategui);
		linksBernal = Arrays.asList(quilmes);
		linksBalcarce = Arrays.asList(buenosAires);
		linksBuenosAires = Arrays.asList(berazategui, quilmes, bernal, balcarce);
		wikipedia = Arrays.asList(berazategui, quilmes, bernal, balcarce, buenosAires);
		berazategui.setLinks(linksBerazategui);
		quilmes.setLinks(linksQuilmes);
		bernal.setLinks(linksBernal);
		balcarce.setLinks(linksBalcarce);
		buenosAires.setLinks(linksBuenosAires);
	}
	
	@Test
	public void testBernal() {
		List<WikipediaPage> similares = filtro.getSimilarPages(bernal, wikipedia);
		assertEquals(3, similares.size());
		assertTrue(similares.contains(bernal));
		assertTrue(similares.contains(berazategui));
		assertTrue(similares.contains(buenosAires));
		assertFalse(similares.contains(balcarce));
		assertFalse(similares.contains(quilmes));
	}
	
	@Test
	public void testBerazategui() {
		List<WikipediaPage> similares = filtro.getSimilarPages(berazategui, wikipedia);
		assertEquals(4, similares.size());
		assertTrue(similares.contains(bernal));
		assertTrue(similares.contains(berazategui));
		assertTrue(similares.contains(balcarce));
		assertTrue(similares.contains(buenosAires));
		assertFalse(similares.contains(quilmes));
	}
	
	@Test
	public void testQuilmes() {
		List<WikipediaPage> similares = filtro.getSimilarPages(quilmes, wikipedia);
		assertEquals(2, similares.size());
		assertTrue(similares.contains(quilmes));
		assertTrue(similares.contains(buenosAires));
	}
}