

import java.util.Scanner;

public class studentgrademanagement {
    public static void main(String[] args) {

        System.out.println("Welcome to Student Grade Management System"); 

        Scanner sc = new Scanner(System.in);
        
            System.out.println("Enter Student Name: ");
            String name = sc.nextLine();
            System.out.println("Student Name: " + name);
            
                System.out.println("Enter Java Marks: ");
                int javaMarks = sc.nextInt();
                
                    System.out.println("Enter HTML Marks: ");
                    int htmlMarks = sc.nextInt(); 
                    
                        System.out.println("Enter CSS Marks: ");
                        int cssMarks = sc.nextInt();

                        int total = javaMarks + htmlMarks + cssMarks;
                        System.out.println("Total Marks: " + total);

                        double average = total / 3.0;

                        System.out.println("Average Marks: " + average);

                        String grade;

                        if (average >= 90) {
                            grade = "A";
                        }
                        else if (average >= 75) {
                            grade = "B";
                        }
                        else if (average >= 50) {
                            grade = "C";
                        }
                        else {
                            grade = "Fail";
                        }
                        System.out.println("Grade: " + grade);



                    
                
            

        
    }
    
}
