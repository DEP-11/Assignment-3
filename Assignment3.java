import java.util.Scanner;

public class Assignment3{
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String BOLT = "\033[37;1m";
        final String RE = "\033[0m";
        final String LINE ="\033[38;5;172m";
        final String NUM ="\033[38;5;216m";
        final String GREEN ="\033[38;5;2m";
        final String RED = "\033[31m";


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        name = name.strip();
        if (name.length()==0){
            System.out.printf("%s%s%s \n",RED,"Invalid Name",RE);
            System.exit(0);
        }


        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.skip(System.lineSeparator());
        if (age<10 || age>18){
            System.out.printf("%s%s%s \n",RED,"Invalid Age",RE);
            System.exit(0);
        }
       


        System.out.print("Enter your subject 1: ");
        String subject1 = scanner.nextLine();
        subject1 = subject1.strip();
        if(subject1.length()==0 || !subject1.startsWith("SE-")){
            System.out.printf("%s%s%s \n",RED,"Invalid format",RE);
            System.exit(0);
        }
       
        
      


        System.out.print("Enter your marks 1: ");
        double marks1 = scanner.nextDouble();
        scanner.skip(System.lineSeparator());
         if(marks1<0 || marks1>100){
            System.out.printf("%s%s%s \n",RED,"Invalid Mark",RE);
            System.exit(0);
        }


        System.out.print("Enter your subject 2: ");
        String subject2 = scanner.nextLine();
        subject2 = subject2.strip();
       if(subject2.length()==0 || !subject2.startsWith("SE-")){
            System.out.printf("%s%s%s \n",RED,"Invalid format",RE);
            System.exit(0);
        }


        System.out.print("Enter your marks 2: ");
        double marks2 = scanner.nextDouble();
        scanner.skip(System.lineSeparator());
        if(marks2<0 || marks2>100){
            System.out.printf("%s%s%s \n",RED,"Invalid Mark",RE);
            System.exit(0);
        }


        System.out.print("Enter your subject 3: ");
        String subject3 = scanner.nextLine();
        subject3 = subject3.strip();
        if(subject3.length()==0 || !subject3.startsWith("SE-")){
            System.out.printf("%s%s%s \n",RED,"Invalid format",RE);
            System.exit(0);
        }


        System.out.print("Enter your marks 3: ");
        double marks3 = scanner.nextDouble();
         if(marks3<0 || marks3>100){
            System.out.printf("%s%s%s \n",RED,"Invalid Mark",RE);
            System.exit(0);
        }



        double totalMarks = marks1+marks2+marks3;
        double avgMarks = totalMarks/3;

        String status1;
        String status2;
        String status3;

        if(marks1>=75){
            
            status1=String.format("\033[34m%s", "Distinguished Pass (DP)");
        }
        else if (marks1>=65){
           
            status1=String.format("\033[32m%s", "Credit Pass (CP)");
        }
        else if (marks1>=55){
          
            status1=String.format("\033[33m%s", "Pass (P)");
        }
        else{
          
            status1=String.format("\033[31m%s", "Fail (F)");
        }
       

        if(marks2>=75){
            
            status2=String.format("\033[34m%s", "Distinguished Pass (DP)");
        }
        else if (marks2>=65){
           
            status2=String.format("\033[32m%s", "Credit Pass (CP)");
        }
        else if (marks2>=55){
           
            status2=String.format("\033[33m%s", "Pass (P)");
        }
        else{
          
            status2=String.format("\033[31m%s", "Fail (F)");
        }
       

        if(marks1>=75){
        
            status3=String.format("\033[34m%s", "Distinguished Pass (DP)");
        }
        else if (marks1>=65){
           
            status3=String.format("\033[32m%s", "Credit Pass (CP)");
        }
        else if (marks1>=55){
           
            status3=String.format("\033[33m%s", "Pass (P)");
        }
        else{
           
            status3=String.format("\033[31m%s", "Fail (F)");
        }
       
        
       


        System.out.printf("Name   : \033[34;1m%s%s \n",name.toUpperCase(),RE);
        System.out.printf("Age    : %d \n",age);
        if(avgMarks>=75){
            System.out.printf("Status : \033[34m%s \n","Distinguished Pass (DP)");
        }
        else if (avgMarks>=65 && avgMarks<75){
            System.out.printf("Status : \033[32m%s \n","Credit Pass (CP)");
        }
        else if (avgMarks>=55 && avgMarks<65){
            System.out.printf("Status : \033[33m%s \n","Pass (P)");
        }
        else{
            System.out.printf("Status : \033[31m%s \n","Fail (F)");
        }
        System.out.printf("%sTotal  : %.2f         Avg : %.2f%% \n",RE,totalMarks,avgMarks);


       

        System.out.printf("%s+%10s+%6s+%6s+\n",LINE,"----------","--------","------------------------");
        System.out.printf("|%s%3$-10s%2$s%6$s|%2$s%1$s%4$-8s%2$s%6$s|%2$s%1$s%5$-24s%2$s%6$s|\n",BOLT,RE," SUBJECT"," MARKS"," STATUS",LINE);
        System.out.printf("%s+%10s+%6s+%6s+\n",LINE,"----------","--------","------------------------");
        System.out.printf("|%4$s%1$-10s%5$s|%4$s%2$-8.2f%5$s|%4$s%3$11s %5$s|\n",subject1,marks1,status1,RE,LINE,NUM);
        System.out.printf("|%4$s%1$-10s%5$s|%4$s%2$-8.2f%5$s|%4$s%3$11s %5$s|\n",subject2,marks2,status2,RE,LINE,NUM);
        System.out.printf("|%4$s%1$-10s%5$s|%4$s%2$-8.2f%5$s|%4$s%3$11s %5$s|\n",subject3,marks3,status3,RE,LINE,NUM);
        System.out.printf("%s+%10s+%6s+%6s+\n",LINE,"----------","--------","------------------------");


        
    }
}