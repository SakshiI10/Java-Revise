// 1. Local Variable: The scope of local variables exists only within the block in which they are declared.
public class a4_varTypes {
    public static void main(String[] args)
    {
        int var = 10;   // Declared a Local Variable
        System.out.println("Local Variable: " + var);

        // Instance variable: To run you should instantiate InstanceVariable in a main method.
        InstanceVariable obj = new InstanceVariable();
        obj.display();

        // Static variable: To run you should instantiate StaticVariable in a main method.
        StaticVariable.display(); 
    }
}

// 2. Instance Variable: The scope of instance variables exists within the class in which they are declared. Belongs to an object (instance of a class).
class InstanceVariable {
    int var = 20; // Declared an Instance Variable

    public void display() {
        System.out.println("Instance Variable: " + var);
    }
}

// 3. Static Variable: The scope of static variables exists within the class in which they are declared. Belongs to the class itself, not any object.
class StaticVariable {
    static int var = 30; // Declared a Static Variable

    public static void display() {
        System.out.println("Static Variable: " + var);
    }
}

// Instance variables belong to an object, so you need to create an object and access them using objectName.method().
// Static variables belong to the class, so you can access them directly using ClassName.method() without creating an object.
