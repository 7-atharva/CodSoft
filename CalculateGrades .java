import java.util.Scanner;
public class CalculateGrades {
   public static void main(String args[]) {
      
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter marks of JAVA : ");
       int marks1 = sc.nextInt();
     
       System.out.println("Enter marks of C : ");
       int marks2 = sc.nextInt();
      
       System.out.println("Enter marks of OPPs : ");
       int marks3 = sc.nextInt();
      
       System.out.println("Enter marks of DSA : ");
       int marks4 = sc.nextInt();
      
       System.out.println("Enter marks of Python : ");
       int marks5 = sc.nextInt();
       int totalMarks = marks1+marks2+marks3+marks4+marks5; 
       float total = marks1+marks2+marks3+marks4+marks5; 
       float average = (total/5); 
       char grade;
      System.out.println("---------------------------------------------");
      System.out.println("Your Total Makrs is : "+totalMarks);
      System.out.println("Your Average Percentage is : "+average);
      
      if(average>=80){
         grade = 'A';
      }
      else if(average>=60 && average<80){
         grade = 'B';
      }
      else if(average>=40 && average<60){
         grade = 'C';
      }
      else {
         grade = 'D';
      }
      
      System.out.println("Your grade is " + grade);
      
      switch(grade) {
         case 'A' :
            System.out.println("Excellent!");
            break;
         case 'B' :
             System.out.println("Very Good");
         case 'C' :
            System.out.println("Well done");
            break;
         case 'D' :
            System.out.println("You passed");
         case 'F' :
            System.out.println("Better try again");
            break;
         default :
         System.out.println("Invalid grade");
      }
   }
}