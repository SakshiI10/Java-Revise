// Varargs lets a method to take many values or even no value at all. Java will treat these values like a list, so that we can use them inside the method easily.
// varargs = input from inside your code (your own method calls).

public class a9_varArgs {
    static void fun2(String s, int... a) {
        System.out.println("String: " + s);
        System.out.println("Number of arguments is: " + a.length);

        for (int i : a)
            System.out.print(i + " ");
        System.out.println("\n");
    }

    public static void main(String args[])
    {
        // Calling fun2() with different parameter
        fun2("GeeksforGeeks", 100, 200);
        fun2("CSPortal", 1, 2, 3, 4, 5);
        fun2("forGeeks");
    }
}
