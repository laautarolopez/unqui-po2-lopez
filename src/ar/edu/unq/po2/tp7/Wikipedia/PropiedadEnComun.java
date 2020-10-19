package ar.edu.unq.po2.tp7.Wikipedia;

import java.util.List;
import java.util.stream.Collectors;

public class PropiedadEnComun implements Filtro {
	public List<WikipediaPage> getSimilarPages(WikipediaPage page,
			   								   List<WikipediaPage> wikipedia) {
		List<WikipediaPage> resultado = wikipedia.stream()
										.filter(p -> this.compartenPropiedad(page, p))
										.collect(Collectors.toList());
		return resultado;
	}

	private boolean compartenPropiedad(WikipediaPage page, WikipediaPage p) {
		return page.getInfobox().keySet().stream()
				   .anyMatch(k -> p.getInfobox().containsKey(k));
	}
}