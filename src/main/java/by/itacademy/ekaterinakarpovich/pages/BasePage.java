package by.itacademy.ekaterinakarpovich.pages;

public abstract class BasePage {
    protected String BASE_URL = "BASE URL";

    public void open() {
        System.out.println("Пользователь открыл страницу " + BASE_URL);
    }
}
