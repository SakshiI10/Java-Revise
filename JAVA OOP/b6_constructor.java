// A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.

// Constructor name must be same as its class name.
// A constructor must have no return type.
// class Test {
// Test() {
// 	constructor body
// }}

// Each time an object is created using a new() keyword, at least one constructor is called to assign values to the data members.
// Types: default, non-parameterized, parameterized

class Person{
	String name;
	int age;
	
	//Non-parameterized constructor
	Person(){
	name="Sakshi";
	age=23;
	}
	
	//Parameterized constructor
	// Person(String name, int age){
	// 	//First name is the class variable and second name is the parameter of the constructor.
	// 	this.name=name;
	// 	this.age=age;
	// }
	
	void output(){
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
}

public class b6_constructor { 			// It contains the main method (the entry point)
	public static void main(String[] args) {
		// Default and Non Parameterize Constructor call
        Person per1=new Person(); 	// per1(object) is an instance of the Person class and default constructor(Person()) is called here.

		// Parameterized constructor
		// Person per1=new Person("Sakshi", 23);

        per1.output();
    }
}
