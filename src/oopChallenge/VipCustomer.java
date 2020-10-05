package oopChallenge;

public class VipCustomer {
    private String customerName;
    private int creditLimit;
    private String emailAddress;

    public  VipCustomer(){
        this("Akin Odeku", 10_000,"akinodeku@mail.com");
    }

    public VipCustomer(String customerName, int creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer( String emailAddress){
        this("lolu odeku",50,emailAddress);
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer("tunde",
                2000, "default@mail.com");
        var customer2 = new VipCustomer("semicolon@mail.com");
        VipCustomer customer3 = new VipCustomer();

        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getCustomerName());
        System.out.println(customer1.getEmailAddress());
    }
}
