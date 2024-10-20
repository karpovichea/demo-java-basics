package by.itacademy.ekaterinakarpovich.numbers;

public class NumberUtils {
    public static String getStringValue(int number) {
        switch (number) {
            case(0): return "ноль";
            case(1): return "один";
            case(2): return "два";
            case(3): return "три";
            case(4): return "четыре";
            case(5): return "пять";
            case(6): return "шесть";
            case(7): return "семь";
            case(8): return "восемь";
            case(9): return "девять";
            default: return "Неверное число";
        }
    }
}
