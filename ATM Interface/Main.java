import java.util.Scanner;

class BankAccount{
    private double balance;
    public BankAccount(double amount){
        balance = amount;
    }
    public double getBalance(){
        return balance;
    }

    public double withdraw(double amountWithdraw){
        if(amountWithdraw <= balance){
            balance -= amountWithdraw;
            return amountWithdraw;
        } else if (amountWithdraw <= 0 ) {
            return -2;
        } else {
            return -3;
        }
    }

    public double deposit(double amount){
        balance += amount;
        return balance;
    }

}

class ATM{
    private BankAccount account;
    public ATM(BankAccount userAccount){
        account = userAccount;
    }

    public void show(){
        System.out.println("1) Withdraw\n2) Deposite\n3) Check Balance\n4) Exit");
    }
    public void run(){
        show();
        Scanner sc = new Scanner(System.in);
        boolean exit = true;
        while(exit){
            System.out.print("Enter your Choice: ");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter the Amount to be Withdrawn: ");
                    double withdrawAmount = sc.nextDouble();
                    if(account.withdraw(withdrawAmount) > 0){
                        System.out.println("Collect Your Amount!\n");
                        System.out.println("Your Current Balance: "+ account.getBalance()+"\n");
                    } else {
                        System.out.println("Insufficient Balance!\n");
                    }
                    break;

                case 2:
                    System.out.print("Enter the Amount to be Deposited: ");
                    double depositeAmount = sc.nextDouble();
                    account.deposit(depositeAmount);
                    System.out.println("Your amount has been sucessfully added to your account!\n");
                    System.out.println("Your Current Balance: "+account.getBalance()+"\n");
                    break;

                case 3:
                    System.out.println("Your Current Balance: "+account.getBalance()+"\n");
                    break;

                case 4:
                    System.out.println("Thank you for visiting!");
                    System.out.println("Exiting...\n");
                    exit = false;
                    break;
                default:
                    System.out.println("Invalid choice, Please try again");
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("\tATM Interface");
        System.out.println("---------------------");
        System.out.println();

        BankAccount userAccount = new BankAccount(1000);
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}
