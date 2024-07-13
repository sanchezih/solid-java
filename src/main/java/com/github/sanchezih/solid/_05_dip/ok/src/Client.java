package com.github.sanchezih.solid._05_dip.ok.src;

//Client code
public class Client {
	public static void main(String[] args) {
		BusinessLogic businessLogic = new BusinessLogic(new DatabaseConnection());
		businessLogic.performBusinessLogic();
	}
}
