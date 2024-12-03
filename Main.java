import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть першу дату у форматі день.місяць.рік (наприклад, 01.12.2024):");
        String firstDateInput = scanner.nextLine();

        System.out.println("Введіть другу дату у форматі день.місяць.рік (наприклад, 03.12.2024):");
        String secondDateInput = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        if (firstDate.isBefore(secondDate)) {
            System.out.println("Перша дата (" + firstDateInput + ") раніша за другу дату (" + secondDateInput + ").");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("Перша дата (" + firstDateInput + ") пізніша за другу дату (" + secondDateInput + ").");
        } else {
            System.out.println("Обидві дати однакові: " + firstDateInput);
        }

        scanner.close();
    }
}
