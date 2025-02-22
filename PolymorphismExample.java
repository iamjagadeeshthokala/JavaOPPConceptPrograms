package com.oops;

public class PolymorphismExample {

	    
	    int add(int a, int b) {
	        return a + b;
	    }

	 
	    int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    
	    double add(double a, double b) {
	        return a + b;
	    }
	}

 class MethodOverloadingExample {
	    public static void main(String[] args) {
	    	PolymorphismExample math = new PolymorphismExample();

	      
	        System.out.println("Addition of two integers: " + math.add(5, 10));
	        System.out.println("Addition of three integers: " + math.add(5, 10, 15));
	        System.out.println("Addition of two doubles: " + math.add(5.5, 10.5));
	    }
	}

