import java.util.Scanner;
import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Я загадав число від 1 до 100. Спробуй його вгадати!");
        int attempts = 0;
        int guess = 0;

        while (guess != randomNumber) {
            System.out.print("Введіть ваше число: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Моє число більше.");
            } else if (guess > randomNumber) {
                System.out.println("Моє число менше.");
            } else {
                System.out.println("Вітаю! Ви вгадали число " + randomNumber + " за " + attempts + " спроб.");
            }
        }

        scanner.close();
    }
}

