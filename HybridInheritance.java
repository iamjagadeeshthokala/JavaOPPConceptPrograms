package com.oops;

public class HybridInheritance {
void play() {
	System.out.println("this is a game");
}
}
class BH extends HybridInheritance{
	void starts() {
		System.out.println("this is startmark");
	}
}
class C extends HybridInheritance{
	void strike() {
		System.out.println("this is strike");
	}
}
class D extends BH{
	void kick() {
		System.out.println("this is kicking");
	}
}
class HybridInheritance1{
	public static void main(String[] args) {
		BH b=new BH();
		b.play();
		C c=new C();
		c.strike();
		c.play();
		D d=new D();
		d.kick();
		
	}
}