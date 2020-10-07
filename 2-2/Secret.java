import java.util.Scanner;
    class Secret{
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         
         
         System.out.println("What's the password?");
         String password = sc.next();
         
         if (password.equals ("dragon"))
         System.out.println("Correct! My secret is: I am Batman.");
         else
         System.out.println("Incorrect password! My secret is still safe...");
        }
    }