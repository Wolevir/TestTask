public class RomanCalculation extends Main {

    public static String[] romanNumerals = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII",
            "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI",
            "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII",
            "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX",
            "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LVIX", "LX", "LXI", "LXII", "LXIII",
            "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "  LXXV",
            "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV",
            "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI",
            "XCVII", "XCVIII", "XCIX", "C"};

    public static int firstRomanNumber, secondRomanNumber, result;

    public static void romanCalculation() {
        try {
            for (int i = 0; i < romanNumerals.length; i++) {
                if (line[0].equals(romanNumerals[i])) {
                    firstRomanNumber = i + 1;
                    if (firstRomanNumber > 10) {
                        throw new Exception("Калькулятор должен принимать на вход римские числа от I до X включительно, не более.");
                    }
                }
            }
            for (int j = 0; j < romanNumerals.length; j++) {
                if (line[2].equals(romanNumerals[j])) {
                    secondRomanNumber = j + 1;
                    if (secondRomanNumber > 10) {
                        throw new Exception("Калькулятор должен принимать на вход римские числа от I до X включительно, не более.");
                    }
                }
            }
            for (String romanNumeral : romanNumerals) {
                if (line[0].equals(romanNumeral) && line[2].equals(romanNumeral)) {
                    switch (line[1]) {
                        case "+" -> result = firstRomanNumber + secondRomanNumber;
                        case "-" -> result = firstRomanNumber - secondRomanNumber;
                        case "*" -> result = firstRomanNumber * secondRomanNumber;
                        case "/" -> result = firstRomanNumber / secondRomanNumber;
                        default -> throw new Exception("Не верный формат арифметической операции.");
                    }
                    if (result < 1) {
                        throw new Exception("В римской системи исчисления нет отрицательных чисел.");
                    } else {
                        System.out.println(romanNumerals[result - 1]);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

