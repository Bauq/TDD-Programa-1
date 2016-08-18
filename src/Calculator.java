import java.util.List;

public class Calculator {

	public float mean(List<Float> numbers) {
		float sum = 0, mean = 0;
		if (numbers.size() != 0) {
			for (int i = 0; i < numbers.size(); i++) {
				sum += numbers.get(i);
			}
			mean = sum / numbers.size();
		} else {
			mean = 0;
		}
		return mean;
	}
	
	public float standardDeviation(List<Float> numbers) {
		float sum = 0, deviation = 0, mean;
		if (numbers.size() > 1) {
			mean = this.mean(numbers);
			for (int i = 0; i < numbers.size(); i++) {
				sum += Math.pow(numbers.get(i) - mean, 2);
			}
			deviation = (float) Math.sqrt(sum/(numbers.size()-1));
		} else {
			deviation = 0;
		}
		return deviation;
	}

}
