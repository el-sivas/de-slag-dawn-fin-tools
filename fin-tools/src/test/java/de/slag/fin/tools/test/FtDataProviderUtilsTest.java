package de.slag.fin.tools.test;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import de.slag.fin.tools.data.FtDataProviderUtils;
import de.slag.fin.tools.model.KeyPerformanceIndicator;

public class FtDataProviderUtilsTest {
	
	String ex = "DE0008469008|2019-03-24|SMA|5|";
	
	@Test
	public void test() {
		final String key = FtDataProviderUtils.key("DE0008469008", LocalDate.of(2019, 3, 24), KeyPerformanceIndicator.SMA, 5);
		Assert.assertTrue(ex.equals(key));
	}

}
