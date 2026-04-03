import java.util.*;


public class TicketManager {
  private ArrayList<Ticket> tickets =new ArrayList<>();
  private int maxSeat=10;
  private int nextTicketId;
  public TicketManager(){
    tickets=DataHandler.loadTickets();
    nextTicketId=tickets.stream().mapToInt(Ticket::getTicketId).max().orElse(0)+1;
  }
  public void bookTicket(String name,int age,String from,String to){
    if(tickets.size()>=maxSeat){
      System.out.println("No seats available.");
      return;
    }
    int seatno=tickets.size()+1;
    Ticket ticket=new Ticket(nextTicketId++,name,age,from,to,seatno);
    tickets.add(ticket);
    DataHandler.saveTickets(tickets);
    System.out.println("Ticket booked successfully. Ticket ID: "+ticket);
  }
  public void cancelTicket(int id){
    Ticket t=tickets.stream().filter(ticket -> ticket.getTicketId()==id).findFirst().orElse(null);
    if(t!=null){
      tickets.remove(t);
      DataHandler.saveTickets(tickets);
      System.out.println("Ticket cancelled successfully.");
    } else {
      System.out.println("Ticket ID not found.");
    }
}
  public void viewTickets() {
    
    if(tickets.isEmpty()) {
      System.out.println("No tickets available.");
      return;
    } 
    tickets.forEach(ticket -> {
      System.out.println(ticket);
    });
      }

      public void viewAvailableSeats(){
        System.out.println("Available Seats:"+(maxSeat-tickets.size()));
      }
    
  
  
    }
