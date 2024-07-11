package solid._03_lsp.ok.src;

//Client code
public class Client {
	public static void main(String[] args) {
		Bird genericBird = new GenericBird();
		genericBird.fly(); // This will print "Flying"
		Bird ostrich = new Ostrich();
		ostrich.fly(); // This will print "Ostrich cannot fly"
	}
}
