// A class can be defined as a blueprint from which you can create an individual object. Class doesn't consume any space. 
// There can be only one public class, and the name of the class should be same as the file name.

// Method 2: By creating another class:
class Person{
    String name;
    int age;
    void input (String n, int a){
        name=n;
        age=a;
    }
    void output(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class b5_classes_and_object {
    // Method 1: directly inside the class:
    // String name;
    // int age;

    public static void main(String[] args){
        // b5_classes_and_object obj=new b5_classes_and_object();
        // obj.name="Sakshi";
        // obj.age=23;
        // System.out.println("Name: " + obj.name);
        // System.out.print("Age: " + obj.age);

        Person per = new Person();   // now this works
        per.input("Sakshi", 23);
        per.output();
    }
}
