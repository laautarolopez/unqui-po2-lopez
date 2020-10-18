package ar.edu.unq.po2.tp7.Wikipedia;

import java.util.List;
import java.util.stream.Collectors;

public class MismaLetraInicial implements Filtro {
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page,
										List<WikipediaPage> wikipedia) {
		List<WikipediaPage> resultado = wikipedia.stream()
										.filter(p -> this.mismaLetraInicial(page, p))
										.collect(Collectors.toList());
		return resultado;
	}
	
	private boolean mismaLetraInicial(WikipediaPage page, WikipediaPage page2) {
		return page.getTitle().charAt(0) == page2.getTitle().charAt(0);
	}
}