// Java Methods are blocks of code that perform a specific task. Methods are similar to functions and expose the behavior of objects. It must be declared within a class.

// <access_modifier> <static: keyword> <return_type> <method_name> ( list_of_parameters)
// {
//     //body
// }

public class b1_methods {
    // Method to print message
    public void printMessage() {
        System.out.println("Hello!");
    }

    static int sum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
      
        // Create an instance of the Method class
        b1_methods obj = new b1_methods();
        
        // Calling the method
        obj.printMessage(); 
        System.out.println(sum(4, 4));
    }
}
