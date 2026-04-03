import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSe {
  public static void main(String[] args) {
    // LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
    // set1.add(45);
    // set1.add(46);
    // set1.add(44);
    // set1.add(48);
    // set1.add(43);
    // set1.add(41);
    // set1.add(49);
    // System.out.println(set1);
    // set1.remove(41);
    // System.out.println(set1);
    // System.out.println(set1.size());
    // set1.clear();
    // System.out.println(set1);
    LinkedHashSet<String> FruitSet = new LinkedHashSet<>();
    FruitSet.add("Apple");
    FruitSet.add("Banana");
    FruitSet.add("Orange");
    FruitSet.add("Kevi");
    FruitSet.add("Pomygrainat");
    FruitSet.add("Grapes");
    System.out.println(FruitSet);
    System.out.println(FruitSet.remove("Banana"));
    System.out.println(FruitSet);
    System.out.println(FruitSet.size());
    // for (String value : FruitSet) {
    // System.out.println(value);

    // }
    Iterator<String> itr = FruitSet.iterator();
    while (itr.hasNext()) {
      System.out.println(itr.next());
    }

  }

}
