import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===== Number Guessing Game =====");
        System.out.println();
        int random = (int) (Math.random() * (100 - 1 + 1)) + 1;
        int Attempts = 0;
        while (true) {
            System.out.print("Guess the number Between 1-100: ");
            int guess = in.nextInt();
            if (guess > random) {
                System.out.println("Too High!");
                ++Attempts;
            } else if (guess < random) {
                System.out.println("Too Low!");
                ++Attempts;
            } else {
                System.out.println("Correct!");
                ++Attempts;
                break;
            }
        }
        System.out.println("You got it in "+ Attempts +" attempts!");
    }
}