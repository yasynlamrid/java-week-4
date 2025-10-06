package exceptions.exercises;

/**
 * Exercise 4 :
 * Create a class BankAccount with:
 *   - field double balance
 *   - method withdraw(double amount)
 *     → If amount > balance, throw a custom exception InsufficientFundsException.
 * In main():
 *   - Create an account with a starting balance
 *   - Try to withdraw more than available
 *   - Catch and handle the exception
 */


public class Exercise4
{
    public static void main(String[] args)
    {

        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.err.println("Erreur : " + e.getMessage());
        }


        try {
            account.withdraw(500);
        } catch (InsufficientFundsException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}


class BankAccount
{
    private double balance;

    public BankAccount(double balance){

        this.balance = balance;
    }

    public double getnum(){

        return balance;

    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount > balance){
            throw new InsufficientFundsException("Solde insuffisant ! Votre solde actuel est de " + balance);
        }

        balance -= amount;
        System.out.println("Retrait de " + amount + " effectué. Nouveau solde : " + balance);


        }
}

class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String message){
        super(message);
    }
}

