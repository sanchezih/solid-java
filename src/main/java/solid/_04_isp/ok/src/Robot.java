package solid._04_isp.ok.src;

//Robot implementing only the Workable interface
public class Robot implements Workable {
	@Override
	public void work() {
		System.out.println("Robot working");
	}
}
