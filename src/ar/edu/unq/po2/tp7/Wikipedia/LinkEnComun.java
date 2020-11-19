package ar.edu.unq.po2.tp7.Wikipedia;


import java.util.List;
import java.util.stream.Collectors;

public class LinkEnComun implements Filtro {
	public List<WikipediaPage> getSimilarPages(WikipediaPage page,
											   List<WikipediaPage> wikipedia) {
		List<WikipediaPage> resultado = wikipedia.stream()
										.filter(p -> this.compartenLink(page, p))
										.collect(Collectors.toList());
		return resultado;
	}

	private boolean compartenLink(WikipediaPage page, WikipediaPage p) {
		return page.getLinks().stream().anyMatch(link -> p.getLinks().contains(link));
	}
}