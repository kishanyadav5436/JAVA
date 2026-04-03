import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    TicketManager manager = new TicketManager();
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println(".......Ticket Booking Management----");
      System.out.println("1. Book Ticket");
      System.out.println("2.Cancel Tickets");
      System.out.println("3.View Tickets");
      System.out.println("4.View Available Seats");
      System.out.println("5.Exit");
      System.out.println("Enter Your Choice:");
      int choice = sc.nextInt();
      sc.nextLine();
      switch (choice) {
        case 1:
          System.out.print("Enter Passenger Name:");
          String name = sc.nextLine();
          System.out.print("Enter Passenger Age:");
          int age = sc.nextInt();
          sc.nextLine();
          System.out.print("Enter from:");
          String from = sc.nextLine();
          System.out.print("Enter destination:");
          String to = sc.nextLine();
          manager.bookTicket(name, age, from, to);
          break;
        case 2:
          System.out.print("Enter Ticket ID to cancel:");
          int id = sc.nextInt();
          sc.nextLine();
          manager.cancelTicket(id);
          break;
        case 3:
          manager.viewTickets();
          break;
        case 4:
          manager.viewAvailableSeats();
          break;
          case 5:
          System.out.println("Thank You for using the Services.");

        default:
          System.out.println("Invalid Choice");
          break;
      }
    }
  }
}
