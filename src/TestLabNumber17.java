import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestLabNumber17 {
	
	@Test
	void primes() {
		PrimeCalc obj = new PrimeCalc
		int expectedNum = 2;
		int actual = obj.findPrime(1);
		assertEquals(expectedNum,actual);
	}
}

