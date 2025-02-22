package com.oops;
class SingleInheritance1{
	void play() {
		System.out.println("playing");
	}

}
public class B extends SingleInheritance1{
	void sing() {
		System.out.println("singing man");
	}
public static void main(String[] args) {
	B b=new B();
	b.play();
	b.sing();
}
}
