package de.slag.fin.tools.model;

import java.time.LocalDate;

public class FtDataPoint {
	
	private String isin;
	
	private LocalDate date;
	
	private KeyPerformanceIndicator kpi;
	
	private Integer[] parameter;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public KeyPerformanceIndicator getKpi() {
		return kpi;
	}

	public void setKpi(KeyPerformanceIndicator kpi) {
		this.kpi = kpi;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public Integer[] getParameter() {
		return parameter;	
	}

	public void setParameter(Integer[] parameter) {
		this.parameter = parameter;
	}

}
