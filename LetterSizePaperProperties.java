public class LetterSizePaperProperties {
    public static void main(String[] args) {
        // Constants
        final double INCH_TO_MM = 25.4;
        final double WIDTH_INCHES = 8.5;
        final double HEIGHT_INCHES = 11.0;

        // Convert width and height from inches to millimeters
        double width_mm = WIDTH_INCHES * INCH_TO_MM;
        double height_mm = HEIGHT_INCHES * INCH_TO_MM;

        // Calculate perimeter
        double perimeter_mm = 2 * (width_mm + height_mm);

        // Calculate length of diagonal using Pythagoras' theorem
        double diagonal_mm = Math.sqrt(width_mm * width_mm + height_mm * height_mm);

        // Display the properties of the letter-size sheet of paper
        System.out.println("Width: " + width_mm + " mm");
        System.out.println("Height: " + height_mm + " mm");
        System.out.println("Perimeter: " + perimeter_mm + " mm");
        System.out.println("Length of diagonal: " + diagonal_mm + " mm");
    }
}
