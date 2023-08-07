import java.util.Scanner;

public class Assignment3{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your Age: ");
        int age = scanner.nextInt();
        System.out.println("Enter your subject 1: ");
        String subject1 = scanner.nextLine();
        System.out.println("Enter your marks 1: ");
        double marks1 = scanner.nextDouble();
        System.out.println("Enter your subject 2: ");
        String subject2 = scanner.nextLine();
        System.out.println("Enter your marks 2: ");
        double marks2 = scanner.nextDouble();
        System.out.println("Enter your subject 3: ");
        String subject3 = scanner.nextLine();
        System.out.println("Enter your marks 3: ");
        double marks3 = scanner.nextDouble();

        double totalMarks = marks1+marks2+marks3;
        double avgMarks = totalMarks/3;


        System.out.printf("Name : %s \n",name.toUpperCase());
        System.out.printf("Age : %d \n",age);
        if(avgMarks>=75){
            System.out.printf("Status : \033[34m%s","Distinguished Pass (DP)");
        }
        else if (avgMarks>=65){
            System.out.printf("Status : \033[31m%s","Distinguished Pass (DP)");
        }

        
    }
}