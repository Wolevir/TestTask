public class Calculation extends Main {
    int firstNumber = Integer.parseInt(line[0]), secondNumber = Integer.parseInt(line[2]), result;

    void calculation() {
        try {
            if (firstNumber < 1 || firstNumber > 10 || secondNumber < 1 || secondNumber > 10) {
                throw new Exception("Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более.");
            } else {
                switch (line[1]) {
                    case "+" -> result = firstNumber + secondNumber;
                    case "-" -> result = firstNumber - secondNumber;
                    case "*" -> result = firstNumber * secondNumber;
                    case "/" -> result = firstNumber / secondNumber;
                    default -> throw new Exception("Не верный формат арифметической операции.");
                }
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
