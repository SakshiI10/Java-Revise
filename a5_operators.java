public class a5_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        // 1. Arithmetic Operators
        System.out.println("a + b = " + (a + b));
        
        // 2. Unary Operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));
        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));

        // 3. Assignment Operators
        System.out.println("a += 3: " + (a += 3));

        // 4. Relational Operators
        System.out.println("a == b: " + (a == b));

        // 5. Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 6. Bitwise Operators
        int d = 0b1010;
        int e = 0b1100;
        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));

        // 7. Shift Operators
        int f = 10;
        System.out.println("f<<1 : " + (f << 1)); //Multiply by 2^1
        System.out.println("f>>1 : " + (f >> 1)); //Divide by 2^1

        // 8. Instanceof Operator
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
    }
}