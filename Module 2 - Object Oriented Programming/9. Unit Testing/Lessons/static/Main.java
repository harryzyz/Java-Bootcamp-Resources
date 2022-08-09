public class Main {
  
    public static void main(String[] args) {
        Employee zack = new Employee("Zack", "Programmer");
        Employee gio = new Employee("gio", "Analyst");
        Employee thomas = new Employee("Thomas", "Specialist");
        System.out.println(Employee.getHiredCount());
    }
  
}
