import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static String str = scanner.nextLine();
    public static String[] line = str.split(" ");

    public static void main(String[] args) throws Exception {
        if (line.length != 3) {
            throw new Exception("Формат арифметической операции не соответствует заданию - два операнда и один оператор (+, -, *, /).");
        }
        try {
            Calculation object1 = new Calculation();
            object1.calculation();
        } catch (Exception e) {
            RomanCalculation.romanCalculation();
        }

    }
}
