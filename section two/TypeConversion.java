public class TypeConversion{
    public static void main(String[] args) {
        double decimal = 4.3;
        int integer = (int)decimal;
        System.out.println(integer);

        double salary = 5833.333333;
        int roundedSalary = (int)salary;
        System.out.println("Percy's monthly salary is $" + roundedSalary);

        
    }
}