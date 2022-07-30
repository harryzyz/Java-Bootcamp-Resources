public class ReturnValues {
    public static void main(String[] args) {
        double area1 = measureRectangle(2.0, 4.3, "area");
        double area2 = measureRectangle(3.5, 1.2, "perimeter");

        stringPrinter(2.0,  4.3, area1, "area");
        stringPrinter(3.5, 1.2, area2, "perimeter");
    }

    public static double measureRectangle(double length, double width, String option) {
        if (length < 0 || width < 0) {
            System.out.println("length or width cannot be negative");
            System.exit(0);
        }
        switch (option) {
            case "area": return length * width;
            case "perimeter": return 2 * (length + width);
            default: return 404;
        }

    }

    public static void stringPrinter(double length, double width, double measure, String option) {
        System.out.println(" The " + option + " of the rectangle with length " + length + 
        " and width " + width + " is equal to " + measure + "\n");
    }
}
