// Interface: It's a mechanism to achieve the abstraction. THere can be only abstract methods in the in the interface. It is also used to achieve multiple inheritance in Java.
// Methods inside interface are public and abstract.

interface A{
    // Attributes insided the interface are by default final so it needs to be initialized.
    int number=1;
    String name="Sakshi";
    
    // Methods inside interface are public and abstract.
    void show();   
    void output(); 

    // If you don't want to declare the method in child class, then you can use default keyword with the method and can declare it.
    default void sub(){
        System.out.println("Default Subtraction Method");
    }
}

interface B extends A{
    void add();
}

// You must define all the interface methods in the class.
class C implements A,B{
    public void show(){
        System.out.println("Show method");
    }
    public void output(){
        System.out.println("Output method");
    }
    public void add(){
        System.out.println("Add method");
    }
}

public class b15_interface {
    public static void main(String[] args) {
        // Can't create object of interface.
        // A obj=new A();

        C obj=new C();
        obj.show();
        obj.output();
        obj.add();
        obj.sub();
    }
}
