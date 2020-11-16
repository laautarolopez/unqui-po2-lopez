package ar.edu.unq.po2.tp7.Wikipedia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class PropiedadEnComunTest {
	private PropiedadEnComun filtro;
	private List<WikipediaPage> wikipedia;
	private Wikipedia berazategui;
	private Wikipedia quilmes;
	private Wikipedia bernal;
	private Wikipedia balcarce;
	private Wikipedia buenosAires;
	private List<WikipediaPage> linksBerazategui;
	private List<WikipediaPage> linksQuilmes;
	private List<WikipediaPage> linksBernal;
	private List<WikipediaPage> linksBalcarce;
	private List<WikipediaPage> linksBuenosAires;
	private Map<String, WikipediaPage> mapBerazategui = new HashMap<String, WikipediaPage>();
	private Map<String, WikipediaPage> mapQuilmes = new HashMap<String, WikipediaPage>();
	private Map<String, WikipediaPage> mapBernal = new HashMap<String, WikipediaPage>();
	private Map<String, WikipediaPage> mapBalcarce = new HashMap<String, WikipediaPage>();
	private Map<String, WikipediaPage> mapBuenosAires = new HashMap<String, WikipediaPage>();
	
	@BeforeEach
	public void setUp() {
		filtro = new PropiedadEnComun();
		berazategui = new Wikipedia("Berazategui", linksBerazategui, mapBerazategui);
		quilmes = new Wikipedia("Quilmes", linksQuilmes, mapQuilmes);
		bernal = new Wikipedia("Bernal", linksBernal, mapBernal);
		balcarce = new Wikipedia("Balcarce", linksBalcarce, mapBalcarce);
		buenosAires = new Wikipedia("Buenos Aires", linksBuenosAires, mapBuenosAires);
		linksBerazategui = Arrays.asList(quilmes, buenosAires);
		linksQuilmes = Arrays.asList(bernal, berazategui);
		linksBernal = Arrays.asList(quilmes);
		linksBalcarce = Arrays.asList(buenosAires);
		linksBuenosAires = Arrays.asList(berazategui, quilmes, bernal, balcarce);
		berazategui.setLinks(linksBerazategui);
		quilmes.setLinks(linksQuilmes);
		bernal.setLinks(linksBernal);
		balcarce.setLinks(linksBalcarce);
		buenosAires.setLinks(linksBuenosAires);
		mapBerazategui.put("birth_place", buenosAires);
		mapBerazategui.put("team", berazategui);
		mapQuilmes.put("team", quilmes);
		mapBernal.put("birth_place", quilmes);
		mapBalcarce.put("provincia", buenosAires);
		mapBuenosAires.put("pais", null);
		berazategui.setInfoBox(mapBerazategui);
		quilmes.setInfoBox(mapQuilmes);
		bernal.setInfoBox(mapBernal);
		balcarce.setInfoBox(mapBalcarce);
		buenosAires.setInfoBox(mapBuenosAires);
		wikipedia = Arrays.asList(berazategui, quilmes, bernal, balcarce, buenosAires);
	}
	
	@Test
	public void testBernal() {
		List<WikipediaPage> similares = filtro.getSimilarPages(bernal, wikipedia);
		assertEquals(2, similares.size());
		assertTrue(similares.contains(bernal)); //birth_place
		assertTrue(similares.contains(berazategui)); //birth_place
	}
	
	@Test
	public void testBerazategui() {
		List<WikipediaPage> similares = filtro.getSimilarPages(berazategui, wikipedia);
		assertEquals(3, similares.size());
		assertTrue(similares.contains(berazategui)); //birth_place, team
		assertTrue(similares.contains(bernal)); //birth_place
		assertTrue(similares.contains(quilmes)); //team
	}
}