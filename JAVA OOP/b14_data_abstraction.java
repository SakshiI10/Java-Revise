// Data abstraction allows us to hide unnecessary details and only show the needed information.

abstract class Person{
    abstract void show();               // Abstract method don't have body. It must be inside abstract class only.
    Person(){                           // You can define cconstructor in the anstract class.
        System.out.println("Parent Constructor");
    }
}

// You must have to define the abstract method in the child class compulsorily so as to call the method.
class Student extends Person{
    Student(){
        super();                        // To call the constructor of the abstract class you must call the super().
        System.out.println("Child Constructor");
    }
    public void show(){
        System.out.println("Child class");
    }
}

public class b14_data_abstraction {
    // Person obj=new Person();         // Can't create object of abstract class
    public static void main(String[] args) {
        Student obj=new Student();
        obj.show();
    }
}
