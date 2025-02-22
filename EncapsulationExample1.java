package com.oops;
public class EncapsulationExample1 {
    
    private String name;
    private int age;

    
    public EncapsulationExample1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
}

class EncapsulationExample {
    public static void main(String[] args) {
        EncapsulationExample1 person = new EncapsulationExample1("Alice", 30);

        
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

       
        person.setName("Bob");
        person.setAge(25);

        
        System.out.println("Updated Name: " + person.getName());
        System.out.println("Updated Age: " + person.getAge());

        
        person.setAge(-5);  
    }
}
