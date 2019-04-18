package de.slag.fin.tools.data;

import java.math.BigDecimal;

import de.slag.Provider;

@Provider
public interface FtDataProvider extends FtDataSupplier<BigDecimal>, FtDataConsumer<BigDecimal> {
	
	
	/**
	 * Persist all data (if any) an clear cache.
	 */
	void flush();

}
