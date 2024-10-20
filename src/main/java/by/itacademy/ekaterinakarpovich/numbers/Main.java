package by.itacademy.ekaterinakarpovich.numbers;

public class Main {

    public static void main(String[] args) {
        int number = 9;
        String numberAsAString = NumberUtils.getStringValue(number);
        System.out.println(numberAsAString);

        for (int i = 0; i < 10; i++) {
            System.out.println(NumberUtils.getStringValue(i));
        }
    }
}
