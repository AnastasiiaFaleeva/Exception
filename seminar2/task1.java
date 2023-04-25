import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        float number = readFloatFromUser();
        System.out.println("Вы ввели число: " + number);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float result = 0.0f;
        boolean success = false;
        
        do {
            System.out.println("Введите дробное число: ");
            String input = scanner.nextLine();
            try {
                result = Float.parseFloat(input);
                success = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введено не число.");
            }
        } while (!success);
        
        return result;
    }
}
