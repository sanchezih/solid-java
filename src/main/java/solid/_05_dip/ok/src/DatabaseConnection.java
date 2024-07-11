package solid._05_dip.ok.src;

//Low-level module representing a database connection class
public class DatabaseConnection implements Connection {

	@Override
	public void connect() {
		System.out.println("Connecting to the database");
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from the database");
	}
}
