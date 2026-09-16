package ExceptionHandling;

class NegativeBalance extends Exception {

    public NegativeBalance(String msg)
    {
        super(msg);
    }

}
public class NegativeBalanceException {
    public static void main(String[] args)
    {
        
        Account a1 = new Account("Saving", 25468544,-50000);
        Customer c1 = new Customer("Mayur", "Akola,Maharastra", 2011620111, 789554566);
        c1.dispCustomer();
        try{
        a1.interest();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

//Account Class
class Account {
    private String accType;
    private long accNumber;
    private long balance;
    private static final double minBalacne = 250.0;

    public Account(String accType,long accNumber,long balance)
    {
        this.accType = accType;
        this.accNumber = accNumber;
        this.balance = balance;
    }
    public void dispAccount()
    {
        System.out.println("Account Type:"+accType);
        System.out.println("Account Number:"+accNumber);
        System.out.println("Balance:"+balance);
    }

    public void interest() throws NegativeBalance
    {
        double interest1= balance*2.5*0.4;

        if(interest1<0)
            throw new NegativeBalance("Negative Balance Exception");
        
    }
}

//Customer Class 

class Customer {
        private String name;
        private String address;
        private long id;
        private long phone;
        private final Account account;

        public Customer(String name,String address, long id,long phone)
        {
            this.name = name;
            this.address = address;
            this.id = id;
            this.phone = phone;
            this.account = new Account("Salary", 201162, 65486445);
        }

        public void dispCustomer()
        {
            System.out.println("Name:"+name);
            System.out.println("Address:"+address);
            System.out.println("ID:"+id);
            System.out.println("Phone Number:"+phone);
            account.dispAccount();
        }
}
