
public class TestingConstructsWithStatics {
	static String name = "Doug";
	static int ok = 35;

	int what = 14;

	public static void main(String[] args) {
		
		System.out.println("Can I call this? " );
		reTest me1 = new reTest(42);
		System.out.println("In main we can call a static " + ok);
		me1.rest(ok);
		String general = " hello there ";
		general = rest(general);
		System.out.println(general);
					
		}
	private reTest(int number) {
		System.out.println("Before the change in the construct " + this.what);
		System.out.println("Now we change it to this passed int which is " + number + " and we call the static " + ok);
		this.what = number;
		
	}
	public static String rest (String name) {
		name = name + ": general kenobi, we meet again";
		return name;
	}
	private void rest(int ok) {
		System.out.println("Now in the method we have called the static " + name + " Who is using the new construct " + this.what + " with a passed static " + ok);
		
	}
}
