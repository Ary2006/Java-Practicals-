import java.util.Date;
import java.util.Scanner;

class account 
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private double withdraw;
    private double depo;

    public account() 
    {
        dateCreated = new Date();
    }

    public account(int id, double balance) 
    {
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }

    public int getId() 
    {
        return id;
    }

    public double getBalance() 
    {
        return balance;
    }

    public double getAnnualInterestRate() 
    {
        return annualInterestRate;
    }

    public Date getDateCreated() 
    {
        return dateCreated;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setBalance(double balance) 
    {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() 
    {    
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() 
    {
        return balance * (getMonthlyInterestRate() / 100);
    }

    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
        } 
        else 
        {
            System.out.println("Insufficient balance");
        }
    }

    public double withdrawamount() 
    {
        return withdraw;
    }

    public double deposit() 
    {
        return depo;
    }

    public void deposit(double amount) 
    {
        balance += amount;
    }

    public void setDateCreated(Date dateCreated) 
    {
        this.dateCreated = dateCreated;
    }
}

public class prac2_2
{
    public static void main(String[] args) 
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the id number : ");
            int id = sc.nextInt();
            System.out.print("Enter balance : ");
            double balance = sc.nextDouble();
            System.out.print("Enter annualInterestRate : ");
            double annualInterestRate = sc.nextDouble();

            account account = new account(id, balance);
            account.setAnnualInterestRate(annualInterestRate);
            System.out.print("Enter the withdraw amount : ");
            double amount = sc.nextDouble();
            System.out.print("Enter the deposit amount : ");
            double depo = sc.nextDouble();

            account.withdraw(amount);
            account.deposit(depo);

            System.out.println("account ID: " + account.getId());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Monthly interest: " + account.getMonthlyInterest());
            System.out.println("Date created: " + account.getDateCreated());
            System.out.println("withdraw: " + account.withdrawamount());
            System.out.println("Deposit: " + account.deposit());
        }
    }
}
