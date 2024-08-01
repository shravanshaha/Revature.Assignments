public class A1e7 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("shravan");
        Customer customer2 = new Customer("prasad", 50);

        customer1.CustomerDetails();
        customer2.CustomerDetails();

        customer1.CustomerCount();

        System.out.println("Total Customers : " + Customer.getTotalCustomers());
    }
}


class Customer {
    private static int count = 0;
    private final String country = "India";
    private String name;
    private int age;

    public Customer(String name) {
        this.name = name;
        count++;
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public void CustomerDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }

    public void CustomerCount() {
        System.out.println("Total Customers: " + count);
    }

    public static int getTotalCustomers() {
        return count;
    }
}

