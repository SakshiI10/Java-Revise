// When we run a Java program, we can give extra information right after the program name. This extra information is called command-line arguments.
// It is used because it allows us to provide input at runtime without modifying the whole program.
// args[] = input from outside the program (command line).

class a8_args {
    public static void main(String[] args)
    {
        // Checking if length of args array is greater than 0
        if (args.length > 0) {
            System.out.println("The command line" + " arguments are:");

            for (String val : args)               
                System.out.println(val);
        }
        else
            System.out.println("No command line " + "arguments found.");
    }
}
