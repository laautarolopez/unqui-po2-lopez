package ar.edu.unq.po2.tp7.Wikipedia;

import java.util.List;
import java.util.Map;

public class Wikipedia implements WikipediaPage {
	private String titulo;
	private List<WikipediaPage> links;
	private Map<String, WikipediaPage> infoBox;
	
	public Wikipedia(String titulo, List<WikipediaPage> links, 
									Map<String, WikipediaPage> infoBox) {
		this.titulo = titulo;
		this.links = links;
		this.infoBox = infoBox;
	}
	
	public String getTitle() {
		return this.titulo;
	}
	
	public List<WikipediaPage> getLinks() {
		return this.links;
	}
	
	public Map<String, WikipediaPage> getInfobox() {
		return this.infoBox;
	}
	
	public void setLinks(List<WikipediaPage> links) {
		this.links = links;
	}
	
	public void setInfoBox(Map<String, WikipediaPage> infoBox) {
		this.infoBox = infoBox;
	}
}