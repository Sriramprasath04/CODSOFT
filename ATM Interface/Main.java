import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\tATM Interface");
        System.out.println("---------------------");
        System.out.println();
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        boolean exit = true;
        while(exit){
            System.out.println("1) Withdraw\n2) Deposite\n3) Check Balance\n4) Exit");
            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter the Amount to be Withdrawn: ");
                    int withdraw = sc.nextInt();
                    if(withdraw<balance){
                        balance -= withdraw;
                        System.out.println("Collect Your Amount!\n");
                        System.out.println("Your Balance: "+balance+"\n");
                    } else {
                        System.out.println("Insufficient Balance!\n");
                    }
                    break;

                case 2:
                    System.out.print("Enter the Amount to be Deposited: ");
                    int deposite = sc.nextInt();
                    balance += deposite;
                    System.out.println("Your amount has been sucessfully added to your account!\n");
                    System.out.println("Your Balance: "+balance+"\n");
                    break;

                case 3:
                    System.out.println("Your Balance: "+balance+"\n");
                    break;

                case 4:
                    System.out.println("Exiting...\n");
                    exit = false;
            }
        }
    }
}