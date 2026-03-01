package OOP2;

public class Bank{
    public static void main(String[] args) {
        //BankAccount myAcc = new BankAccount("mansi",2345456,"sdeftryu");
        // myAcc.username = "MansiPambhar";
        // myAcc.acc_no = 234568;
        // myAcc.setPass("sdrthj");
        // System.out.println(myAcc.username);
        // System.out.println(myAcc.acc_no);
        // System.out.println(myAcc.getPass());

        CurrentAccount cAcc = new CurrentAccount("parv", 1234567890, "123467mhgf", 0, 1100.00f, 0);
        System.out.println(cAcc.acc_no+"\n"+cAcc.getUsername()+"\n"+cAcc.getPass());
        System.out.println("Balance: " + cAcc.getBalance());
        System.out.println("Deposit: " + cAcc.deposit(1000));
        System.out.println("Withdrawal: " + cAcc.withdraw(500));
        System.out.println("Updated Balance: " + cAcc.getBalance());
       

    }
}

 class BankAccount {
    private String username ;
    protected  int acc_no;
    private String password;

    BankAccount(String uname, int acc_no, String pwd){
        this.username = uname;
        this.acc_no = acc_no;
        this.password = pwd;
    }

    String getUsername(){
        return this.username;
    }
    
    void setUsername(String uname){
        this.username = uname;
    }
    void setPass(String pwd){
        this.password = pwd;
    }
    String getPass(){
        return this.password;
    }
}

class CurrentAccount extends BankAccount{
    float serviceCharge;
    float balance;

    CurrentAccount(String username, int acc_no, String pass, int sc, 
                    float depo, float withdraw){
        super(username,acc_no,pass);
        this.serviceCharge = sc;
        this.balance = depo - withdraw;     
    }

    float getBalance(){
      return this.balance;
    }
    
    float deposit (float amount){
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

class SavingAccount extends BankAccount {
    float savingAmount;
    float charge;

    SavingAccount(String username, int acc_no, String pass,
                  float savingAmount, float charge){
        super(username, acc_no, pass);
        this.savingAmount = savingAmount;
        this.charge = charge;
    }
}


    
