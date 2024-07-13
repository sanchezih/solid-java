package com.github.sanchezih.solid._04_isp.ok.src;

//Human implementing both Workable and Eatable interfaces
public class Human implements Workable, Eatable {
	@Override
	public void work() {
		System.out.println("Human working");
	}

	@Override
	public void eat() {
		System.out.println("Human eating");
	}
}
