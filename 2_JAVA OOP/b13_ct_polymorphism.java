// Compile time polymorphism: In this just because B extends A, B inherits A’s methods. That’s why the compiler treats both show(int) and show(int, String) as if they are inside the same class (B) when resolving method calls. 

class A{
    int age;
    String name;
    void show(int a){
        age=a;
        System.out.println("Age: "+age);
    }
}

// Method over loading
class B extends A{
    void show(int a, String n){
        age=a;
        name=n;
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
}


public class b13_ct_polymorphism {
    public static void main(String[] args) {
        A obj=new A();
        obj.show(23);
        
        B obj2=new B();
        obj2.show(23, "Sakshi");
    }
    
}
