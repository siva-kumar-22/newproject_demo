import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Creates a reader instance which Takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter any number you want: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the line to the output screen
        System.out.println("You entered: " + number);
    }
}
