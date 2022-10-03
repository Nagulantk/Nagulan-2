import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        AtmUser user1=new AtmUser(1234567,9084,400000);
        System.out.println("Insert the card inside the machine");
        System.out.println("Enter the pin:");
        int pin=input.nextInt();
        if(pin== user1.getPin()){
            System.out.println("enter the amount to be withdrawn:");
            int balance=input.nextInt();
            if(balance<user1.getBalance())
            {
                user1.setBalance(user1.getBalance()-balance);
                System.out.println("Amount is withdrawn Succesfully");
                System.out.println("Your balance is:"+user1.getBalance());
            }
            else {
                System.out.println("Insufficient balance")
            }
        }
        else {
            System.out.println("Invalid pin");
        }

    }
}

class AtmUser
{
   public final int accountNumber;
   private final int pin;
   private int balance;
    public AtmUser(int accountNumber,int pin,int balance)
    {
        this.accountNumber=accountNumber;
        this.pin=pin;
        this.balance=balance;
    }

    public int getPin()
    {
        return pin;
    }
    public int getBalance()
    {
        return balance;
    }
    public void setBalance(int balance)
    {
        this.balance=balance;
    }
}