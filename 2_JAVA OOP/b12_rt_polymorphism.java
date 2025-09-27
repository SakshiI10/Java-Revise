// Polymorphism is a concept in which a single action can be performed in different ways.
// Types: Compile time and run time

class A{
    void show(){
        System.out.println("Class A");
    }
}

// Method over riding
class B extends A{
    void show(){
        System.out.println("Class B");
    }
}

public class b12_rt_polymorphism {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();

        B obj2=new B();
        obj2.show();
    }
}
