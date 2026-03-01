package OOP2;

class CurrentAccount extends BankAccount {

    float serviceCharge;
    float balance;

    CurrentAccount(String username, int acc_no, String pass,
                   int sc, float depo, float withdraw) {

        super(username, acc_no, pass);
        this.serviceCharge = sc;
        this.balance = depo - withdraw;
    }

    float getBalance() {
        return balance;
    }

    float deposit(float amount) {
        balance += amount;
        return balance;
    }

    float withdraw(float amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
            return balance;
        }

        if (balance < amount) {
            System.out.println("Insufficient balance!");
            return balance;
        }

        balance -= amount;
        System.out.println("Withdrawal successful!");
        return balance;
    }
}
