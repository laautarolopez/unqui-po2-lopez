package ar.edu.unq.po2.tp7.Wikipedia;

import java.util.List;

public interface Filtro {
	public List<WikipediaPage> getSimilarPages(WikipediaPage page,
			List<WikipediaPage> wikipedia);
}