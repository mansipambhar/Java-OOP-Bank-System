package OOP2;

public class Bank {
    public static void main(String[] args) {

        CurrentAccount cAcc =
        new CurrentAccount("parv", 1234567890,
                        "123467mhgf", 0, 1100.00f, 0);

        System.out.println(cAcc.acc_no);
        System.out.println(cAcc.getUsername());
        System.out.println(cAcc.getPass());
        System.out.println("Balance: " + cAcc.getBalance());

        cAcc.deposit(1000);
        cAcc.withdraw(500);

        System.out.println("Updated Balance: " + cAcc.getBalance());
    }
}

 