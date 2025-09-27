// Multiple Inheritance: Multiple inheritance means a class can inherit features from more than one parent class. 
// Java doesn't support Multiple inheritance because if classes have same named methods in it, then it would cause ambiguity and extended class whould get confused about whom to inherit.


// Interface 1
interface Animal {
    void eat();
}

// Interface 2
interface Pet {
    void play();
}

// Class implementing multiple interfaces
class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("The dog eats bones.");
    }
    public void play() {
        System.out.println("The dog loves to play.");
    }
}

public class b10_multiple_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
