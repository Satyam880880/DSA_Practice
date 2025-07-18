/* 
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
   
  // This code checks if a given password is valid based on specific criteria.
import java.util.Scanner;
public class classroom {
 public static boolean print(String str){
        if(str.length() > 15 || str.length() < 8){
            return false;
        }
        boolean hasDigit = false;
         boolean hascharacter = false;
          boolean hasspecial = false;
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           if(Character.isDigit(ch)){
               hasDigit = true;
           }
           else if(Character.isLetter(ch)){
               hascharacter = true;
           }else{
               hasspecial = true;
           }
       }
       return hasDigit && hascharacter && hasspecial;
    }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	 if(print(str) == false){
	     System.out.print(str+" is a invalid password");
	 }else{
	      System.out.print(str+" is a valid password");
	 }
	}
}
/* 
/* Password Validation Rules:
Length: Between 9 and 14 characters (>8 && <15)
At least one uppercase letter
At least one lowercase letter
At least one digit
At least one special character */


import java.util.Scanner;
public class classroom {
    public static boolean isValid(String str) {
        if (str.length() > 15 || str.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasSpecial = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else {
                hasSpecial = true;
            }
        }

        return hasDigit && hasUpper && hasLower && hasSpecial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (!isValid(str)) {
            System.out.println(str + " is a invalid password");
        } else {
            System.out.println(str + " is a valid password");
        }

        sc.close();
    }
}
