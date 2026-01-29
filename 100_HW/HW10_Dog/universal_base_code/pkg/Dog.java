package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	private String name;
	private int age;
	private String breed;
	
	    // Empty Constructor
	public Dog() {
		this.name = "Clifford";
		this.age = 3;
		this.breed = "big red dog";
	    }
	
	    // Name Constructor
	public Dog(String name) {
		this.name = name;
		this.age = 1;
		this.breed = "dog dog";
	    }
	
	    // Name Breed Constructor
	public Dog(String name, String breed) {
	    this.name = name;
	    this.breed = breed;
	    this.age = 1;
	    }
	
		// Name Age Constructor
	public Dog(String name, int age) {
	    this.name = name;
	    this.age = age;
	    this.breed = "dog dog";
	    }
	
	    // Setters
	public void setName(String name) {
	    this.name = name;
	    }
	
	public void setAge(int age) {
	    this.age = age;
	    }
	
	public void setBreed(String breed) {
	    this.breed = breed;
	    }
	
	    // Getters
	public String getName() {
	    return this.name;
	    }
	
	public int getAge() {
	    return this.age;
	    }
	
	public String getBreed() {
	    return this.breed;
	    }
	
	    // Random sleep check
	public boolean isSleeping() {
	    Random rand = new Random();
	    return rand.nextBoolean();
	    }
	
	    // Bark method
	public void bark() {
	    System.out.println(this.name + " barks!");
	    }
}

