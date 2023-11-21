public class Account {

    private String accountNumber;
    private int balance;

    

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public void login(String acNum) {
        if (this.accountNumber == acNum) {
            System.out.println("Logged in successfully");
        }
    }

    public void logout() {
        System.out.println("Logged out successfully");
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit successful");
        } else  {
            System.out.println("Deposit unsuccessful");
        }
        
    }

    public String withdraw(int amount) {
        if (amount > 500) {
            return "In line with the bank's policy, you can not withdraw more than 500PLN";
        }   else if (this.balance < amount) {
            return "Your balance is less than withdrawal amount";
        } else {
            this.balance -= amount;
            return "Balance = " + amount;
        }

    }

    public int checkBalance() {
        return this.balance;
    }





    public static void main(String[] args) {
        Account a = new Account("12342314",0 );
        a.deposit(500);
        System.out.println("balance = " + a.checkBalance());
        a.deposit(200);
        System.out.println("balance = " + a.checkBalance());
        a.withdraw(300);
        System.out.println("balance = " + a.checkBalance());
    }

}