// Base class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Intermediate class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Derived class
class Puppy extends Dog {
    void weep() {
        System.out.println("The puppy weeps.");
    }
}

public class b9_multilevel_inheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // inherited from Animal
        p.bark();  // inherited from Dog
        p.weep();  // method of Puppy
    }
    
}
