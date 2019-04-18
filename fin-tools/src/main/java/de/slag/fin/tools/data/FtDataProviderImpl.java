package de.slag.fin.tools.data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import javax.naming.OperationNotSupportedException;

import de.slag.fin.tools.model.KeyPerformanceIndicator;

public class FtDataProviderImpl implements FtDataProvider {

	private Map<String, BigDecimal> dataMap = new HashMap<>();

	@Override
	public BigDecimal get(String isin, LocalDate date, KeyPerformanceIndicator kpi, Integer... integers) {
		final String key = FtDataProviderUtils.key(isin, date, kpi, integers);
		if (!dataMap.containsKey(key)) {
			load(isin, date, kpi, integers);
			
			
			return BigDecimal.ZERO;
		}
		return dataMap.get(key);
	}

	private void load(String isin, LocalDate date, KeyPerformanceIndicator kpi, Integer[] integers) {
	
	}

	@Override
	public void put(BigDecimal t, String isin, LocalDate date, KeyPerformanceIndicator kpi, Integer... integers) {
		dataMap.put(FtDataProviderUtils.key(isin, date, kpi, integers), t);
	}

	@Override
	public void flush() {
		throw new RuntimeException(new OperationNotSupportedException());
	}
}
