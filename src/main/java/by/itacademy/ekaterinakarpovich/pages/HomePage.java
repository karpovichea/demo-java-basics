package by.itacademy.ekaterinakarpovich.pages;

public class HomePage extends BasePage {
    private String title = "Домашняя страница";
    protected String HOME_URL = BASE_URL + "/домашняя страница";

    public String getTitle() {
        return title;
    }

    public void clickLogin() {
        System.out.println("Пользователь кликнул по кнопке Войти");
    }

    @Override
    public void open() {
        System.out.println("Пользователь открыл страницу " + HOME_URL);
    }
}
