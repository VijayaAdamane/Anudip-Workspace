package com.anudip.practice;

abstract class Pen{
	abstract void write() ;
	abstract void refill();
	
}
class FountainPen extends Pen{

	@Override
	void write() {
		System.out.println("Write");
	}

	@Override
	void refill() {
		System.out.println("Refill");
	}
	
	void changeNib() {
		System.out.println("Change Nib");
	}
}

class Monkey{
	public void jump() {
		System.out.println("Jump");
	}
	
	public void bite() {
		System.out.println("bite");
	}
}

interface BasicAnimal{
	void eat();
	void sleep();
}

class Human extends Monkey implements  BasicAnimal{

	@Override
	public void eat() {
		System.out.println("Eat");
	}

	@Override
	public void sleep() {
		System.out.println("Sleep");
		
		
	}
	
}




public class AbstractDefault {

}
