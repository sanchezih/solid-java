package com.github.sanchezih.solid._05_dip.nok.src;

//Low-level module representing a database connection class
public class DatabaseConnection {

	public void connect() {
		System.out.println("Connecting to the database");
	}

	public void disconnect() {
		System.out.println("Disconnecting from the database");
	}
}
