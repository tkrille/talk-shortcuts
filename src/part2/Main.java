package part2;

public class Main {

	private String foo = "bar";
	private String bar = "bar";
	
	public Main() {
		bar();
	}
	
	/**
	 * Calculates foo for the current time
	 */
	private String foo(){
		System.out.println(bar);
		return "FOO";
	}
	
	private void bar() {
		bar = foo();
	}
	
	/**
     * Returns the greater of two {@code float} values.  That is,
     * the result is the argument closer to positive infinity. If the
     * arguments have the same value, the result is that same
     * value. If either value is NaN, then the result is NaN.  Unlike
     * the numerical comparison operators, this method considers
     * negative zero to be strictly smaller than positive zero. If one
     * argument is positive zero and the other negative zero, the
     * result is positive zero.
     *
     * @param   a   an argument.
     * @param   b   another argument.
     * @return  the larger of {@code a} and {@code b}.
     */
    public static float max(float a, float b) {
        if (a != a) return a;   // a is NaN
        if ((a == 0.0f) && (b == 0.0f)
            && (Float.floatToIntBits(a) == Float.floatToIntBits(-0.0f))) {
            return b;
        }
        return (a >= b) ? a : b;
    }
}
