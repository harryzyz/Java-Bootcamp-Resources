public class Main {
    public static void main(String[] args) {
        Person person = new Person("Zack", 27);
        Object person2 = new Person(person);

        System.out.println("Equality: " + person2.equals(person));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());

        System.err.println(person);

    } 
}
