package solid._03_lsp.nok.src;

//Client code
public class TestBird {
	public static void main(String[] args) {
		Bird ostrich = new Ostrich();
		ostrich.fly(); // This will print "Flying," but ostriches cannot fly
	}
}
