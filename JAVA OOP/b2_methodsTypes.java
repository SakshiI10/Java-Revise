// Types of Methods (Two main cateories):
// 1. Predefined Methods: These are built-in methods provided by Java, such as `System.out.println()`.
// 2. User-defined Methods: These are methods created by the programmer to perform specific tasks.

// Types of User-defined Methods:

// 1. Instance Methods
// a. Belong to an instance of a class (an object).
// b. You need to create an object of the class to call the method.

public class b2_methodsTypes {
    int number = 10;  // Optional: assign a value to number

    public void display() {
        System.out.println("Number: " + number);
    }

// 2. Static Methods
// a. Belong to the class, not instances.
// b. Can be called without creating an object.
    public static void show() {
        System.out.println("This is a static method");
    }

// 4. Final Methods:
// a. Declared with the final keyword.
// b. Cannot be overridden by subclasses.
    public final void finalMethod() {
        System.out.println("This is a final method and cannot be overridden");
    }

// 5. Constructor Methods:
// a. Special methods called when an object is created.
// b. Have the same name as the class and no return type.
    public b2_methodsTypes() {
        System.out.println("Constructor called");
    }

    public static void main(String[] args) {
        // Instance Method Call
        
        b2_methodsTypes obj = new b2_methodsTypes();  // Create object
        obj.display();  // Call 

        // Static Method Example
        b2_methodsTypes.show();  // Call static method

        // Abstract Method Example
        Animal dog = new Dog();  // Create object using abstract class reference
        dog.sound();  // Calls overridden method in Dog

        // Final Method Example
        obj.finalMethod();  // Calling final method

        // Constructor Method Example
        b2_methodsTypes constructorcall = new b2_methodsTypes();  // Calls constructor
        constructorcall.display();  // Display number
    }
}

// 3. Abstract Methods
// a. Declared without an implementation (no body).
// b. Must be defined in an abstract class or an interface.
abstract class Animal {
    public abstract void sound();  // Abstract method
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Bark");
    }
}
