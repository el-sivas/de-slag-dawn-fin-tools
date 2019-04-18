package de.slag.fin.tools.data;

import java.time.LocalDate;

import de.slag.fin.tools.model.KeyPerformanceIndicator;

public interface FtDataConsumer<T> {
	
	void put(T t, String isin, LocalDate date, KeyPerformanceIndicator kpi, Integer... integers);
}
