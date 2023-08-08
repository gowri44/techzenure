import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTestTest {

	@Test
	public void test() {
		Calculator calc = new calculator();
		int x = 10;
		int y = 20;
		int expected = 30;
		int actual = calc.add(x,y);
				
	}

}
