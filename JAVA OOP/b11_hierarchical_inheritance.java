// Parent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

public class b11_hierarchical_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog’s own method
    
        Cat c = new Cat();
        c.eat();   // inherited from Animal
        c.meow();  // Cat’s own method
    }
    
}
