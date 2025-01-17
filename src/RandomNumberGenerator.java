import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // min number
        System.out.print("Enter min: ");
        int min = scanner.nextInt();
        // max number
        System.out.print("Enter max: ");
        int max = scanner.nextInt();
        // generates number between min and max inclusive
        Random random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;
        System.out.println("");
        System.out.println("Random number:");
        System.out.println(randomNumber);

        scanner.close();
    }
}
