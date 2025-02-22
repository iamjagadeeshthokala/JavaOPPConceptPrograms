package com.oops;

	 class Ant{
		void sun() {
			System.out.println("sun is rising");
		}
	}
 class Bat extends Ant{
	void master() {
		System.out.println("he is master");
	}
}
 class Cat extends Ant{
	void chaser() {
		System.out.println("she is a chesar ");
	}
}
class Hirarical1{
	public static void main(String[] args) {
		Bat b=new Bat();
		b.sun();
		b.master();
		Cat c=new Cat();
		c.chaser();
		c.sun();
	}
}

