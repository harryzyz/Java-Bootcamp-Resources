public class Conditionals {
    public static void main(String[] args) {
        String option = "";

        int random = (int) (Math.random() * 3 + 1);
        
        switch (random) {
            case 1: option = "hit"; break;
            case 2: option = "stay"; break;
            case 3: option = "fold"; break;
            default: option = "This should never get called"; break;
        }
     

        if (!option.equals("hit") && !option.equals("stay")) {
            System.out.println("fold");
        } else {
            System.out.println(option); 
       } 
    }
}
