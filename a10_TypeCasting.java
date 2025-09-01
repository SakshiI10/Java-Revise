// Converting one data type into another. 

// Types:
// a. Implicit Casting or Down casting: Converting lower data type into a higher data type. It is done automatically and no data loss occurs.
// NOTE: byte->short->char->int->long->float->double

// b. Explicit conversion, up casting: Converting a higher data type into a lower data type. It is done manually and data loss occurs.
// NOTE: double->float->long->int->char->short->byte

public class a10_TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (widening conversion)
        int a = 5;
        double b = a;  // int -> double (automatic)
        System.out.print(b);
    }
}
