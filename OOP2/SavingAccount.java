package OOP2;

class SavingAccount extends BankAccount {

    float savingAmount;
    float interestRate;
    float minBalance = 500;

    SavingAccount(String username, int acc_no, String pass,
                  float savingAmount, float interestRate) {

        super(username, acc_no, pass);
        this.savingAmount = savingAmount;
        this.interestRate = interestRate;
    }

    float getBalance() {
        return savingAmount;
    }

    float deposit(float amount) {
        savingAmount += amount;
        return savingAmount;
    }

    float withdraw(float amount) {

        if (savingAmount - amount < minBalance) {
            System.out.println("Minimum balance required!");
            return savingAmount;
        }

        savingAmount -= amount;
        return savingAmount;
    }

    void addInterest() {
        float interest = savingAmount * interestRate / 100;
        savingAmount += interest;
        System.out.println("Interest added: " + interest);
    }
}
