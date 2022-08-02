public class Main {
  
    public static void main(String[] args) {

        Person person = new Person("Ryan", "Canada", "1/1/1111", 11);

        if (person.applyPassport() == true) {
            person.setPassport();
        }

        
        boolean bool = person.applyPassport();
        if (bool == true) {
            System.out.println("Approved");
        } else if (bool == false) {
            System.out.println("Denied");
        }

        person.chooseSeat();

        System.out.println(person);


      
      
      
    }
  
  
}
