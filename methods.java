// Java Methods are blocks of code that perform a specific task. A method allows us to reuse code, improving both efficiency and organization. All methods in Java must belong to a class. Methods are similar to functions and expose the behavior of objects.

// <access_modifier> <return_type> <method_name>( list_of_parameters)
// {
//     //body
// }

public class methods {
    // Method to print message
    public void printMessage() {
        System.out.println("Hello!");
    }

    public static void main(String[] args) {
      
        // Create an instance of the Method class
        methods obj = new methods();
        
        // Calling the method
        obj.printMessage(); 
    }
}
