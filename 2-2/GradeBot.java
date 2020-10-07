import java.util.Scanner;
    class GradeBot{
     public static void main (String[] args) {
         Scanner sc = new Scanner(System.in);
         double grade = 0;
         
         System.out.println("What was the test out of?");
         int max = sc.nextInt();
         
             System.out.println("What was your mark?");
             double mark = sc.nextDouble();
             grade = mark / max * 100;
             if (max != 0 && max >= 0 && grade <= 100 && mark >= 0) {
             System.out.println("Your percentage is: " + grade);
         
             if (grade >= 86)
             System.out.println("You got an A! Amazing!");
             else if (grade <= 85 && grade >= 73)
             System.out.println("You got a B! Good job!");
             else if (grade <= 72 && grade >= 67)
             System.out.println("You got a C+. Not bad.");
             else if (grade <= 66 && grade >= 60)
             System.out.println("You got a C. Might want to study better.");
             else if (grade <= 59 && grade>= 50)
             System.out.println("You got a C-. Did you study?"); 
             else if (grade <= 49 && grade >= 0)
             System.out.println("You got a F. Get out of that class.");
            } else {
              System.out.println("Nice try");
            }
            }
    }