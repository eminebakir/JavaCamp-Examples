public class Main {

    public static void main(String[] args) {

        Logger[] loggers = {new SmsLogger(), new EmailLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);

        Customer emine = new Customer(1, "Emine", "Bakır");
        customerManager.add(emine);
    }
}
