package com.oops;

class Multilevel1 {
	public static void main(String[] args) {
		Test b = new Test();
		b.skiping();
		b.running();
		CK c = new CK();
		c.running();
		c.talking();
	}
	
}

class Test extends Multilevel {
	void running() {
		System.out.println("he is running");
	}
}

class CK extends Test {
	void talking() {
		System.out.println("he is talk");
	}
}

class Multilevel {
	void skiping() {
		System.out.println("he is skiping");
	}
	
}
