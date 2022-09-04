import java.util.Iterator;
import java.util.LinkedList;

public class LinkyList {
    public static void main(String[] args) {
        LinkedList<String> linky = new LinkedList<>();
         linky.add("Rob");
         linky.add("Alex");
         linky.add("Jose");

         System.out.println(linky.getFirst());
         System.err.println(linky.getLast());
         System.out.println(linky.get(1));
         Iterator it = linky.iterator();
         while (it.hasNext()) {
            if ( (String) it.next() == "Alex") {
                it.remove();
            }
         }
         
         System.out.println(linky);
         
         linky.clear();
    }
    
}