package part3;

public class ClassWithImportErrors {

	private BigInteger zero = new BigInteger("0");
	private BigInteger one = new BigInteger("0");

	private List<BigInteger> bits = Arrays.asList(zero, one);

	public ClassWithImportErrors() {
		zero.probablePrime(12, new Random(864349423));
	}
}
