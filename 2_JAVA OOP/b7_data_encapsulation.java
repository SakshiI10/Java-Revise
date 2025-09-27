// Access Modifiers: Public, private and protected.

// Data Encapsulation: To hide the sensitive data from users. 
// We use private keyword to class variable or attributes.
// We can use get and set methods to access and update the value of the private methods.

class Person{
    //	Public:
	//public int age;
    //void output(){
	//System.out.println("Age: "+age);
	//}
	
    // Private: Used for data encapsulation
	private int age;
	void setAge(int age){   // This can also be achieved using constructor.            
		this.age=age;       // first age is an instance variable of the current object and second age is the parameter of the setAge method.
	}
	int getAge(){
		return age;
	}
}

public class b7_data_encapsulation {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setAge(23);
        System.out.println(obj.getAge());
    }
    
}
