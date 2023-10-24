import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Student Grade Calculatore");
        System.out.println("-------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Subjects: ");
        int sub_count = sc.nextInt();
        int sum = 0;

        System.out.println("Enter the marks of each subject (out of 100)");
        for(int i=0; i<sub_count ;i++){
            System.out.print("Subject"+(i+1)+": ");
            int mark = sc.nextInt();
            sum += mark;
        }

        int avg = sum/sub_count;
        String grade;
        if(avg>=90){
            grade = "O";
        } else if (avg>=80) {
            grade = "A+";
        } else if (avg>=70) {
            grade = "A";
        } else if (avg>=60) {
            grade = "B+";
        } else if (avg>=50) {
            grade = "B";
        } else {
            grade = "RA";
        }

        displayResult(sum,avg,grade);
    }

    static void displayResult(int tot, int avg, String grade){
        System.out.println("\n\tResult");
        System.out.println("==============");
        System.out.println("Total marks :"+tot);
        System.out.println("Average :"+avg);
        System.out.println("Grade :"+grade);
    }
}