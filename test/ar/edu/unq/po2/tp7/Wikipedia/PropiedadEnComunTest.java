package ar.edu.unq.po2.tp7.Wikipedia;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class PropiedadEnComunTest {
	private PropiedadEnComun filtro;
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
		wikipedia = Arrays.asList(berazategui, quilmes, bernal, balcarce, buenosAires);
		berazategui.setLinks(linksBerazategui);
		quilmes.setLinks(linksQuilmes);
		bernal.setLinks(linksBernal);
		balcarce.setLinks(linksBalcarce);
		buenosAires.setLinks(linksBuenosAires);
		this.construirMap(mapBerazategui,
			 Arrays.asList(("place", berazategui)));
		this.construirMap(mapQuilmes);
		this.construirMap(mapBernal);
		this.construirMap(mapBalcarce);
		this.construirMap(mapBuenosAires);
	}
	
	public void construirMap(Map<String, WikipediaPage> m, 
							 List<(String, WikipediaPage)> lista) {
		
	}
	
	@Test
	public void test() {
		
	}
}