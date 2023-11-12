import java.util.Scanner;


public class grade_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("STUDENT GRADE CALCULATOR");

        System.out.println("Enter the marks of subjects out of 100: ");
        int subjects= 5;

        double total = 0;
        for(int i=1; i<= subjects; i++) {
            System.out.println("Enter obtained marks in subject "+ +i+" : ");
            double marks = in.nextDouble();
            total = total+marks;
        }

        double avgpercentage = total/subjects;
        String grade = calculationofgrade(avgpercentage);

        
        System.out.println("RESULT: ");
        System.out.println("Total Marks obtain: "+ total +" out of 500.");
        System.out.println(" Percentage: "+ avgpercentage+ " %");
        System.out.println("Grade alloted to student "+ grade);      
        System.out.println("Thankyou");
        System.out.println("**********************************");
        in.close();
    }
    public static String calculationofgrade(double avgpercentage){
        if(avgpercentage>=90){
            return "A+";
        } else if(avgpercentage>=80)
        {
            return "A";
        } 
        else if(avgpercentage>=70)
        {
            return "B";
        } 
        else if(avgpercentage>=60){
            return "C";
        } 
        else if(avgpercentage>=50){
            return "D";
        }
         else if(avgpercentage>=40){
            return "E";
        }
        else if(avgpercentage>=30){
            return "F";
        }
        else
        {
            return "  fail, Need more Improvement";
        }
    }
}