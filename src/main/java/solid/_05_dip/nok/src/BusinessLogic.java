package solid._05_dip.nok.src;

//High-level module representing a business logic class
public class BusinessLogic {
	
	private DatabaseConnection databaseConnection;

	public BusinessLogic() {
		this.databaseConnection = new DatabaseConnection();
	}

	public void performBusinessLogic() {
		
		// Using the DatabaseConnection directly
		databaseConnection.connect();
		
		// Business logic code
		System.out.println("Performing business logic");
		
		// Using the DatabaseConnection directly
		databaseConnection.disconnect();
	}
}
