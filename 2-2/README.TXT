------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:
import java.util.Scanner;
    class GradeBot{
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         String a1 = "Maybe";
         String a2 = "Probably";
         String a3 = "For sure";
         String a4 = "No doubt";
         String a5 = "Most likely";
         String a6 = "Try again";
         String a7 = "Cannot answer that now";
         String a8 = "Maybe tomorrow";
         String a9 = "Not right now";
         String a10 = "Don't count on it";
         String a11 = "Doubt it";
         String a12 = "Signs point to yes";
         String a13 = "Signs point to no";
         String a14 = "I'm counting on it";
         String a15 = "Soon";
         String a16 = "Take a deep breath and try again";
         String a17 = "Ask a friend";
         String a18 = "Not likely";
         String a19 = "Don't even think about it";
         String a20 = "Ask again in a year";
         
         System.out.println("Ask a yes or no question.");
         sc.nextLine();
         int x = 0;
         x = (int)(Math.random() * 20 + 1);
         
         if (x == 1) 
         System.out.println(a1);
         else if (x == 2)
         System.out.println(a2);
         else if (x == 3)
         System.out.println(a3);
         else if (x == 4)
         System.out.println(a4);
         else if (x == 5)
         System.out.println(a5);
         else if (x == 6)
         System.out.println(a6);
         else if (x == 7)
         System.out.println(a7);
         else if (x == 8)
         System.out.println(a8);
         else if (x == 9)
         System.out.println(a9);
         else if (x == 10)
         System.out.println(a10);
         else if (x == 11)
         System.out.println(a11);
         else if (x == 12)
         System.out.println(a12);
         else if (x == 13)
         System.out.println(a13);
         else if (x == 14)
         System.out.println(a14);
         else if (x == 15)
         System.out.println(a15);
         else if (x == 16)
         System.out.println(a16);
         else if (x == 17)
         System.out.println(a17);
         else if (x == 18)
         System.out.println(a18);
         else if (x == 19)
         System.out.println(a19);
         else if (x == 20)
         System.out.println(a20);
        }
    }