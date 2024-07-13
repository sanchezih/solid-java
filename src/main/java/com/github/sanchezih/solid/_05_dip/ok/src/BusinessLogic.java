package com.github.sanchezih.solid._05_dip.ok.src;

//High-level module representing a business logic class
public class BusinessLogic {

	private Connection connection;

	/**
	 * 
	 * @param connection
	 */
	public BusinessLogic(Connection connection) {
		this.connection = connection;
	}

	/**
	 * 
	 */
	public void performBusinessLogic() {

		// Using the Connection abstraction
		connection.connect();

		// Business logic code
		System.out.println("Performing business logic");

		// Using the Connection abstraction
		connection.disconnect();
	}
}
