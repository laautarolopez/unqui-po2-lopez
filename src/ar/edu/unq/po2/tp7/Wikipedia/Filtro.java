package ar.edu.unq.po2.tp7.Wikipedia;

public interface Filtro {
	public List<WikipediaPage> getSimilarPages(WikipediaPage page,
			List<WikipediaPage> wikipedia);
}