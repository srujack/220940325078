import java.util.Scanner;

class BankAccount {
    Scanner sc = new Scanner(System.in);
    int accno=100;
    double balance;
    public BankAccount() {
    }
    void createUser(){
        System.out.println("enter name");
        String Name= sc.next();
        accno=accno++;
        System.out.println("account number= "+accno);
        System.out.println("enter amount to create acc");
        balance=sc.nextDouble();
    }


    BankAccount(int accno,double balance){
    }

    void withdraw(int accno){
        System.out.println("enter amount to be withdrawn:");
        double withdraw=sc.nextDouble();
        if (withdraw>balance){
            System.out.println("Exception occured:cannot withdraw more than balance money");
        }
        else {
        balance=balance-withdraw;}
    }
    void deposit(int deposit){
        balance=balance+deposit;
    }
    void show(int accno,double balance){
        System.out.println("the account number= "+accno);
        System.out.println("the balance is ="+balance);
    }

    public static void main(String[] args) {
        BankAccount a1=new BankAccount();
        a1.createUser();
        try{
            a1.withdraw(a1.accno);
            if (a1.balance<0){
                throw new Exception("withdrawn amount is greater than your balance");
            }
        }
        catch (Exception e) {
            System.out.println("not able to withdraw money");
        }
        System.out.println("balance is: "+a1.balance);

        a1.show(a1.accno,a1.balance);

    }
}
