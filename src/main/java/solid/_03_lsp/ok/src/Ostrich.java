package solid._03_lsp.ok.src;

//Class representing an ostrich, implementing Bird
public class Ostrich implements Bird {
	@Override
	public void fly() {
		System.out.println("Ostrich cannot fly");
	}
}
