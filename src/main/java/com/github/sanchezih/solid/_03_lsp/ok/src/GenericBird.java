package com.github.sanchezih.solid._03_lsp.ok.src;

//Class representing a generic bird
public class GenericBird implements Bird {
	@Override
	public void fly() {
		System.out.println("Flying");
	}
}
