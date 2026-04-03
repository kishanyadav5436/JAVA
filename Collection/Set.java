import java.util.HashSet;

public class Set {
  public static void main(String[] args) {
    HashSet<String> set1 = new HashSet<>();
    HashSet<String> set2 = new HashSet<>();

    set1.add("Tom Halend");
    set1.add("Robart town Juniour");
    set1.add("Iron man");
    System.out.println(set1);
    set1.remove("Tom Halend");
    System.out.println(set1);
    System.out.println(set1.contains("Tom Halend"));
    set2.add("Dolly");
    set2.add("Iron man");
    set2.add("Lakshanm");
    // union
   // set1.addAll(set2);
    //System.out.println(set1);
    // intersetion
    set1.retainAll(set2);
    System.out.println(set1);

  }

}
