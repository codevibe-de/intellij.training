package training.refactor.j_extractclass;

public class ComplexService {

	// TODO move these fields into a new `AuditSettings` container class, which is
	// referenced by `auditSettings` here
	private String auditId;
	private long auditOffset;
	private String auditLevel;

	// TODO extract all parameters into a parameter class
	public double calculate(int count1, int count2, double factorX, double factorY, String prefix) {
		System.out.println(this.auditId + "/" + this.auditLevel + " -- calculate() called");
		// ...
		return 42.0;
	}
}
