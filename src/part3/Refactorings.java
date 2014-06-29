package part3;

public class Refactorings {

	private final String foo;
	private final int bar;

	public Refactorings() {
		foo = "foo";
		bar = 1;

		double inlineMe = 4.2;
		renameMe(inlineMe(foo, bar), inlineMe);
	}

	public void foo() {
		renameMe(inlineMe(foo, bar), 4.2);
	}

	public String inlineMe(String a, int bar) {
		return a.toLowerCase() + bar;
	}

	public void renameMe(String a, double foobar) {
		System.out.println(a + foobar);
	}
}
