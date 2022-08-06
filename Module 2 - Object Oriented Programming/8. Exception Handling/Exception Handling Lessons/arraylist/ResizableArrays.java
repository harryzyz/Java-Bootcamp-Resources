import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Joe");
        names.add("Jane");
        names.add("John");
        
        names.size();
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        names.set(0, "Joefresh");
        names.add(3, "Katie");
        names.remove(2);
        names.clear();

    }
}
