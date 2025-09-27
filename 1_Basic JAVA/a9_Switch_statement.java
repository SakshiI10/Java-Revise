import java.util.*;

public class a9_Switch_statement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char value=sc.next().charAt(0);
        
        switch(value){
            case 'a':
                System.out.print("Vowel");
                break;
            case 'e':
                System.out.print("Vowel");
                break;
            case 'i':
                System.out.print("Vowel");
                break;
            case 'o':
                System.out.print("Vowel");
                break;
            case 'u':
                System.out.print("Vowel");
                break;
            default:
                System.out.print("Consonent");
                break;
        }
    }
}
