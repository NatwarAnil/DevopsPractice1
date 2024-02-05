package MyTestPract;

import static org.junit.Assert.*;

import org.junit.Test;

import Mypract.MyCalc;

public class TestMyCalc {

	@Test
	public void test() {
		MyCalc mc = new MyCalc();
		assertEquals(30,mc.sum(10, 20));
	}

}
