package com.github.sanchezih.solid._01_srp.nok.src;

public class Report {

	private String content;

	public Report(String content) {
		this.content = content;
	}

	public void generateReport() {
		// Logic to generate the report content
		System.out.println("Generating the report...");
		// ...
	}

	public void saveToFile() {
		// Logic to save the report content to a file
		System.out.println("Saving the report to a file...");
		// ...
	}

	public void sendEmail() {
		// Logic to send the report via email
		System.out.println("Sending the report via email...");
		// ...
	}
}
