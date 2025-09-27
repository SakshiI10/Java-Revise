// Java string methods: concat(), length(), contains(), toLowerCase(), toUpperCase(), equals(), equalsIgnoreCase(), indexOf(), replace(), trim()

public class a12_String_methods {
    public static void main(String[] args){
        String firstName="Sakshi";
        String lastName="Ingole";

        System.out.println(firstName.concat(lastName));
        System.out.println(firstName.length());
        System.out.println(firstName.contains("shi"));
        System.out.println(firstName.toUpperCase());

        String secName="sakshi";
        System.out.println(firstName.equals(secName));
        System.out.println(firstName.equalsIgnoreCase(secName));

        System.out.println(firstName.replace('i', 'e'));
        System.out.println(firstName.indexOf('i'));
    }
}
