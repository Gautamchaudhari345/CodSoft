import java.util.Scanner;
public class ATM_interface {
    
        public static void main(String[] args) {
            Account newAccount=new Account();
            
            userInterface(newAccount);
        }
    public static class Account{
        private double Balance=0.00;
        public double getBalance(){
            return this.Balance;
        }
        public  void setBalance(double Balance){
            this.Balance=Balance;
        }
    }
    public static void userInterface(Account newAccount){
        System.out.println("press 1 for deposite");
        System.out.println("press 2 for cheeckamount");
        System.out.println("press 3 for witdhraw");
        Scanner in =new Scanner(System.in);
        int selectUser=in.nextInt();
        if(selectUser==1){
            deposit(newAccount);
        }
        else if (selectUser==2) {
            cheeckamount(newAccount);
            
        }
        else if(selectUser==3){
            witdhraw(newAccount);
        }
        else{
            System.out.println("plese slect valid option");
        }

    }
    public static void deposit(Account newAccount){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the deposite amount ");
        double depositAmount = in.nextInt();
        double newBalance = newAccount.getBalance()+depositAmount;
        newAccount.setBalance(newBalance);
        System.out.println("\nSuccessfully deposit!\n");
        moreTransactions(newAccount);
    }
    public static void cheeckamount(Account newAccount){
        System.out.println("\nAvailable Balance : "+newAccount.getBalance());
        moreTransactions(newAccount);
    }
    public static void witdhraw(Account mewAccount){
        Scanner in=new Scanner(System.in);
        System.out.println("enter the amount to witdhraw");
        double WithdrawAmount=in.nextInt();
        if (WithdrawAmount>=mewAccount.getBalance()) {
            System.out.println("You have not enough balance to widthraw");
            moreTransactions(mewAccount);
            
        }
        else{
            double newBalance = mewAccount.getBalance() - WithdrawAmount;
            mewAccount.setBalance(newBalance);
            System.out.println("Withdraw successful!\n");
            moreTransactions(mewAccount);
        }
    }

    public static void moreTransactions(Account ac){
        Scanner in=new Scanner(System.in);
        System.out.println("\nIf you want more transactions than press 'y' to continue other press 'n' to exit");
        String wantMoreTransaction=in.next();
        if(wantMoreTransaction.equals("y") || wantMoreTransaction.equals("Y")){
            userInterface(ac);
        }else{
            System.out.println("Thanks! for using our ATM\n");
        }
   }
}
