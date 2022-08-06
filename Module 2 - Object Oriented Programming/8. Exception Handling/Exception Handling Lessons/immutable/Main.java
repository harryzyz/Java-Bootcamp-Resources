public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ryan", "Canadian");  //  Immutable?
        Person person2 = person;
        person2 = new Person("Harry", "GBK");

        System.out.println(person);
        System.out.println(person2);
    }
}
