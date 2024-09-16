import java.util.Scanner;

public class TicketMachine {
    private int balance;
    private int price;

    // Constructor to initialize the ticket machine with a specific price
    public TicketMachine(int ticketPrice) {
        this.price = ticketPrice;
        this.balance = 0;
    }

    // Get the price of a ticket
    public int getPrice() {
        return price;
    }

    // Get the current balance
    public int getBalance() {
        return balance;
    }

    // Insert money into the machine
    public void insertMoney(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("You have inserted: " + amount + " units.");
        } else {
            System.out.println("Invalid amount. Please insert a positive amount.");
        }
    }

    // Get a ticket if enough balance is available
    public void getTicket() {
        if (balance >= price) {
            System.out.println("Ticket printed. Price: " + price + " units.");
            balance -= price;
        } else {
            System.out.println("Insufficient balance. Please insert at least: " + (price - balance) + " more units.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set the ticket price
        System.out.print("Enter the ticket price: ");
        int ticketPrice = scanner.nextInt();

        TicketMachine machine = new TicketMachine(ticketPrice);

        boolean running = true;

        // Loop for user interaction
        while (running) {
            System.out.println("\nTicket price: " + machine.getPrice() + " units.");
            System.out.println("1. Insert Money");
            System.out.println("2. Get Ticket");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount of money to insert: ");
                    int amount = scanner.nextInt();
                    machine.insertMoney(amount);
                    break;
                case 2:
                    machine.getTicket();
                    break;
                case 3:
                    System.out.println("Current balance: " + machine.getBalance() + " units.");
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
