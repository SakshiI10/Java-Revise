//  while: Runs until the specified Boolean condition is true. As it becomes false, the loop automatically stops.

// do-while: Runs atleast once and condition is checked after loop body.

// for: Runs program several times.

public class a10_loops {
    public static void main(String[] args){
        // while
        int i=1;
        while(i<=10){
            System.out.print(i + " ");;
            i++;
        }
        System.out.println();;
        
        // do-while
        int j=5;
        do{
            System.out.println("Inside do");
        } while (j<2);
        
        // for
        for(int k=1; k<=10; k++){
            System.out.print(k + " ");;
        }
    }
}
