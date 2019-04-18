package de.slag.fin.tools.data;

import java.time.LocalDate;

import de.slag.fin.tools.model.KeyPerformanceIndicator;

public interface FtDataSupplier<T> {
	
	T get(String isin, LocalDate date, KeyPerformanceIndicator kpi, Integer... integers);

}
