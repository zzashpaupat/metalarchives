package de.loki.metallum.search.service.advanced;

import de.loki.metallum.core.parser.search.BandSearchParser;
import de.loki.metallum.search.service.AbstractBandSearchService;

/**
 * Represents the advanced search for bands Here we'll search and try to parse the Result of our
 * Search.
 * 
 * How to use this: Setup a BandSearchQuery and just call performSearch(BandSearchQuery query)
 * 
 * This class can also call the Parser to finally get a clear result. <br>
 * <br>
 * 
 * 
 * @see http://www.metal-archives.com/search/advanced/#bands -> Click Tap "Search bands"
 * 
 * 
 * @author Zarathustra
 * 
 */
public final class BandSearchService extends AbstractBandSearchService {

	public BandSearchService() {
		super(5, false, false, false, false);
	}

	@Override
	protected final BandSearchParser getSearchParser() {
		return new BandSearchParser();
	}

}
