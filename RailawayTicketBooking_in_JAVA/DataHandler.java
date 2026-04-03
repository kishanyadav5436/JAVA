
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
public class DataHandler {
  private static final String FILE_PATH = "ticket.csv";
  public static void saveTickets(ArrayList<Ticket> tickets){
    try(PrintWriter writer=new PrintWriter(new FileWriter(FILE_PATH))){
      for(Ticket t:tickets){
        writer.println(t.toCSV());
      }
    }catch(IOException e){
      System.out.println("Error in saving ticket"+e.getMessage());
    }
  }
  public static ArrayList<Ticket> loadTickets(){
    ArrayList<Ticket> tickets=new ArrayList<>();
    File file = new File(FILE_PATH);
    if(!file.exists()){
      return tickets;
    }
    try(BufferedReader reader=new BufferedReader(new FileReader(FILE_PATH))){
      String line;
      while((line=reader.readLine())!=null){
        tickets.add(Ticket.fromCSV(line));
      }
    }catch(IOException e){
      System.out.println("Error in loading tickets: "+e.getMessage());
    }
    return tickets;
  }
  
}
