// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (inherits from Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class b8_single_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited method from Animal
        d.bark(); // method of Dog
    }
    
}
