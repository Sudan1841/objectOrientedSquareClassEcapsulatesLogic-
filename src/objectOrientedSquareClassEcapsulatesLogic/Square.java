package objectOrientedSquareClassEcapsulatesLogic;

public class Square {
    // The size of the square
    private int size;
    // The array to store each line of the square
    private String[] square;

    // Constructor to initialize the size and the square array
    public Square(int size) {
        this.size = size;
        this.square = new String[size];
        generateSquare();
    }

    // Method to generate each line of the square
    private void generateSquare() {
        for (int i = 0; i < size; i++) {
            // Initialize a StringBuilder for the current line
            StringBuilder line = new StringBuilder();

            // If it's the first or last line, fill it with asterisks
            if (i == 0 || i == size - 1) {
                for (int j = 0; j < size; j++) {
                    line.append("*");
                }
            } else {
                // For middle lines, add an asterisk, then spaces, then an asterisk
                line.append("*");
                for (int j = 1; j < size - 1; j++) {
                    line.append(" ");
                }
                line.append("*");
            }

            // Add the line to the array
            square[i] = line.toString();
        }
    }

    // Method to print each line of the square
    public void printSquare() {
        for (String line : square) {
            System.out.println(line);
        }
    }

    // Main method to test the Square class
    public static void main(String[] args) {
        // Create a square of size 20
        Square square = new Square(20);
        // Print the square
        square.printSquare();
    }
}
