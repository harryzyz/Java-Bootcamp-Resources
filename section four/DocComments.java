public class DocComments {
    public static void main(String[] args) {

        greet();
        printText("Harry", 38);
        double area1 = calculateArea(2.3, 1.2);
        System.out.println("area is " + area1);
    }

    /**
     * Function name: greet
     * 
     * Inside the function:
     * 1. prints: 'Hi'
     */
    public static void greet() {
        System.out.println("Hi");
    }

    /**
     * Function name: printText
     * @param name (String)
     * @param age (int)
     * 
     * Inside the function:
     * 1. prints the name and age as part of a text.
     */
    public static void printText(String name, int age) {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }

    /**
     * Function name: calculateArea
     * @param length (double)
     * @param width (double)
     * @return (double)
     * 
     * Inside the function:
     * 1. calculate the area and returns it.
     */
    public static double calculateArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
