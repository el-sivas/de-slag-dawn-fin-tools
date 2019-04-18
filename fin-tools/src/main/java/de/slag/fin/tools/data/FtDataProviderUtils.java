package de.slag.fin.tools.data;

import java.time.LocalDate;

import de.slag.fin.tools.model.KeyPerformanceIndicator;

public class FtDataProviderUtils {
	
	private static final String SEPARATOR = "|";
	
	public static String key(String isin, LocalDate date, KeyPerformanceIndicator kpi, Integer... integers) {
		final StringBuilder sb = new StringBuilder();
		sb.append(isin);
		sb.append(SEPARATOR);

		sb.append(date.toString());
		sb.append(SEPARATOR);

		sb.append(kpi.name());
		sb.append(SEPARATOR);

		for (int i = 0; i < integers.length; i++) {
			sb.append(Integer.toString(integers[i]));
			if (i < integers.length) {
				sb.append(SEPARATOR);
			}
		}

		return sb.toString();
	}

}
