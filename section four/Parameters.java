public class Parameters {
    public static void main(String[] args) {
        measureRectangle(2.0, 4.3);
        measureRectangle(3.5, 1.2);
    }

    public static void measureRectangle(double length, double width) {
        double area = length * width;
        System.out.println(" The area of the rectangle with length " + length + 
        " and width " + width + " is equal to " + area + "\n");
    }
}
