import java.util.*;
class ATM {

    float Balance;
    int Pin;



     public void MakePIN(){

             System.out.println("Place Enter Your PIN:");
             Scanner sc1 =new Scanner(System.in);
             int MkPin0 = sc1.nextInt();
             System.out.println("Place confirm PIN:");
             Scanner sc2 =new Scanner(System.in);
             int MkPin1 = sc2.nextInt();
             if (MkPin1==MkPin0) {
                 Pin = MkPin0;
                 Menu();
             } else if (MkPin1!= MkPin0) {
                 System.out.println("invalid Pin Place try again");
                 
             }
           Menu();
     }
    public void Menu() {
        System.out.println("Enter your choice: ");
        System.out.println("1. check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Make Pin");
        System.out.println("5. Exit");

        Scanner sc=new Scanner(System.in);
        int opt = sc.nextInt();

        if(opt ==1){
            CheckBalance();

        }
        else if(opt ==2){
            WithdrawMoney();

        }
        else if(opt ==3){
            DepositMoney();

        }
        else if(opt ==4){
            MakePIN();

        } else if (opt==5) {
            Menu();
            
        }

    }
    public void CheckBalance(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin= sc.nextInt();
        if (enteredpin==Pin) {
            System.out.println("Balance: " + Balance);
        } else {
            System.out.println("Enter a valid pin");
        }
        Menu();
    }
    public void WithdrawMoney(){
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredpin1= sc.nextInt();
        if (enteredpin1==Pin) {
            System.out.println("Enter Amount to Withdraw: ");
            Scanner sc1 = new Scanner(System.in);
            float amount = sc1.nextFloat();
            if(amount>Balance){
                System.out.println("Insufficient Balance");
            }
            else{
                Balance = Balance - amount;
                System.out.println("Money Withdraw Successfull");
            }
        } else {
            System.out.println("Enter a valid pin");
        }
        Menu();
    }
    public void DepositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        Menu();
    }
    public static class ATMMachine {
        public static void main(String[] args) {

            ATM obj = new ATM();
            obj.Menu();
        }
    }
}