package training.refactor.d4_extract_paramclass;

public class ComplexService {

	// TODO extract all parameters into a parameter class
	public double calculate(int count1, int count2, double factorX, double factorY) {
		return (count1 + count2) * factorX / factorY;
	}

}
