import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Ivanov Ivan Ivanovich 01.01.2001 79006660077 m");

        try {
            String input = scanner.nextLine();
            String[] data = input.split(" ");

            if (data.length != 6) {
                throw new IllegalArgumentException("Некорректное количество параметров. Введите Фамилия Имя Отчество датарождения номертелефона пол");
            }

            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];

            String dateOfBirth = data[3];
            if (!dateOfBirth.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                throw new IllegalArgumentException("Некорректный формат даты рождения. Формат: dd.mm.yyyy");
            }

            long phoneNumber = Long.parseLong(data[4]);
            if (phoneNumber <= 0) {
                throw new IllegalArgumentException("Некорректный номер телефона. Номер должен быть целым беззнаковым числом");
            }

            char gender = data[5].charAt(0);
            if (gender != 'm' && gender != 'f') {
                throw new IllegalArgumentException("Некорректный пол. Пол может быть 'm' или 'f'");
            }

            String fileName = lastName + ".txt";
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(lastName + " " + firstName + " " + middleName + " " + dateOfBirth + " " + phoneNumber + " " + gender + "\n");
            writer.close();

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ошибка при записи файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
}
