package chapter6_5;

import static org.junit.Assert.*;

import org.junit.Test;


public class SumByConstructorTest {

	@Test
	public void testGetSum() {
		SumByConstructor[] sConstructors = new SumByConstructor[10];
		for (int i = 0; i < sConstructors.length; i++) {
			sConstructors[i] = new SumByConstructor();
		}
		System.out.println(SumByConstructor.getSum());
	}

}
