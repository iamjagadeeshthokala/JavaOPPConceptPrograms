package com.oops;

	abstract class Vehicle {
	    abstract void start();
	    
	    void stop() {
	        System.out.println("Vehicle is stopping...");
	    }
	}
	class Car extends Vehicle {

	    @Override
	    void start() {
	        System.out.println("Car is starting with a key...");
	    }
	}

	class Bike extends Vehicle {
	    @Override
	    void start() {
	        System.out.println("Bike is starting with a self-start button...");
	    }
	}
	public class AbstractionExample{
	    public static void main(String[] args) {
	        Vehicle myCar = new Car();
	        myCar.start();  
	        myCar.stop();   

	        Vehicle myBike = new Bike();
	        myBike.start();
	        myBike.stop();  
	    }
	}
