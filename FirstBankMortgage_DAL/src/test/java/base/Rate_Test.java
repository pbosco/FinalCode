package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Rate_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getRatetest() {
		
		assertTrue(RateDAL.getRate(450) == 5.0);
		assertTrue(RateDAL.getRate(625) == 4.5);
		assertTrue(RateDAL.getRate(670) == 4.0);
		assertTrue(RateDAL.getRate(705) == 3.75);
		assertTrue(RateDAL.getRate(840) == 3.5);
		
	}
	
	

}
