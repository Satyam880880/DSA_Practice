import java.util.Scanner;

public class classroom {
   public static void main(String[] args) {

      String s = "Satyam";
      // Uppercase
        System.out.println("Uppercase: " + s.toUpperCase());

        // Lowercase
        System.out.println("Lowercase: " + s.toLowerCase());

        //trim
        String p = "  Maurya  ";
        System.out.println(p); // prints "  Maurya  "
        System.out.println(p.trim()); // prints "Maurya"

        // startsWith
        String str = "Hello, world!";
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Carpet".startsWith("Car")); // prints true

        // endsWith
        System.out.println("Carpet".endsWith("pet")); // prints true
        System.out.println("Carpet".endsWith("Car")); // prints false

        // equals
        System.out.println("Carpet".equals("Car")); // prints false
        System.out.println("Carpet".equals("Carpet")); // prints true

        // chatAt
        System.out.println("Carpet".charAt(3)); // prints 'p'

        // valueOf
        int num = 123;
        String strNum = String.valueOf(num);
        System.out.println(num); // prints 123
        System.out.println(strNum); // prints "123"

        System.out.println(num *2); // prints 246
      // System.out.println(strNum*2);  error becuse int
      System.out.println(strNum+2); //print 1232
   } 
}
