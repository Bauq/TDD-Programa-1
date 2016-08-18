import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MeanTest {
	
	private Calculator calculator;
	private List<Float> numbers;
	private float mean;

	@Before
	public void setUp() throws Exception {
		calculator = new Calculator();
		numbers = new ArrayList<Float>();
	}

	@Test
	public void oneNumberMeanTest() {
		numbers.add((float) 20.0);
		float mean = calculator.mean(numbers);
		assertEquals(20, mean, 0.01);
	}
	
	@Test
	public void WithoutNumbersTest() {
		mean = calculator.mean(numbers);
		assertEquals(0, mean, 0.01);
	}
	
	@Test
	public void ZeroMeanTest() {
		numbers.add((float) 0);
		mean = calculator.mean(numbers);
		assertEquals(0, mean, 0.01);
	}
	
	@Test
	public void twoNumberMeanTest(){
		numbers.add((float) 20.0);
		numbers.add((float) 55.0);
		mean = calculator.mean(numbers);
		assertEquals(37.5, mean, 0.01);
	}
	
	@Test
	public void twoNumberAndZeroMeanTest(){
		numbers.add((float) 20.0);
		numbers.add((float) 55.0);
		numbers.add((float) 0);
		mean = calculator.mean(numbers);
		assertEquals(25, mean, 0.01);
	}
	
	@Test
	public void listWithDecimalNumberTest(){
		numbers.add((float) 20.0);
		numbers.add((float) 55.0);
		numbers.add((float) 0.05);
		mean = calculator.mean(numbers);
		assertEquals(25.01, mean, 0.01);
	}
	
	@Test
	public void meanProxySizeTest(){
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
		mean = calculator.mean(numbers);
		assertEquals(550.6, mean, 0.001);
	}
	
	@Test
	public void meanDevelopmentHoursTest(){
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
		mean = calculator.mean(numbers);
		assertEquals(60.32, mean, 0.001);
	}
	
	

}
