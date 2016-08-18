import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class StandardDeviationTest {

	private Calculator calculator;
	private List<Float> numbers;
	private float standardDeviation;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
		numbers = new ArrayList<Float>();
	}

	@Test
	public void oneNumberstandardDeviationTest() {
		numbers.add((float) 20.0);
		float standardDeviation = calculator.standardDeviation(numbers);
		assertEquals(0, standardDeviation, 0.01);
	}
	
	@Test
	public void WithoutNumbersTest() {
		standardDeviation = calculator.standardDeviation(numbers);
		assertEquals(0, standardDeviation, 0.01);
	}
	
	@Test
	public void ZerostandardDeviationTest() {
		numbers.add((float) 0);
		standardDeviation = calculator.standardDeviation(numbers);
		assertEquals(0, standardDeviation, 0.01);
	}
	
	@Test
	public void twoNumberstandardDeviationTest(){
		numbers.add((float) 20.0);
		numbers.add((float) 55.0);
		standardDeviation = calculator.standardDeviation(numbers);
		assertEquals(24.74, standardDeviation, 0.01);
	}
	
	@Test
	public void twoNumberAndZerostandardDeviationTest(){
		numbers.add((float) 20.0);
		numbers.add((float) 55.0);
		numbers.add((float) 0);
		standardDeviation = calculator.standardDeviation(numbers);
		assertEquals(27.83, standardDeviation, 0.01);
	}
	
	@Test
	public void listWithDecimalNumberTest(){
		numbers.add((float) 20.0);
		numbers.add((float) 55.0);
		numbers.add((float) 0.05);
		standardDeviation = calculator.standardDeviation(numbers);
		assertEquals(27.81, standardDeviation, 0.01);
	}
	
	@Test
	public void standardDeviationProxySizeTest(){
		numbers.add((float) 160);
		numbers.add((float) 591);
		numbers.add((float) 114);
		numbers.add((float) 229);
		numbers.add((float) 230);
		numbers.add((float) 270);
		numbers.add((float) 128);
		numbers.add((float) 1657);
		numbers.add((float) 624);
		numbers.add((float) 1503);
		standardDeviation = calculator.standardDeviation(numbers);
		assertEquals(572.03, standardDeviation, 0.01);
	}
	
	@Test
	public void standardDeviationDevelopmentHoursTest(){
		numbers.add((float) 15.0);
		numbers.add((float) 69.9);
		numbers.add((float) 6.5);
		numbers.add((float) 22.4);
		numbers.add((float) 28.4);
		numbers.add((float) 65.9);
		numbers.add((float) 19.4);
		numbers.add((float) 198.7);
		numbers.add((float) 38.8);
		numbers.add((float) 138.2);
		standardDeviation = calculator.standardDeviation(numbers);
		assertEquals(62.26, standardDeviation, 0.01);
	}
	
}
