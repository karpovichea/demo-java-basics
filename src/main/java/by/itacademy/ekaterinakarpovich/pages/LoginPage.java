package by.itacademy.ekaterinakarpovich.pages;

public class LoginPage extends BasePage {
    private String title = "Форма логина";
    protected String LOGIN_PAGE = BASE_URL + "/форма логина";

    public String getTitle() {
        return title;
    }

    @Override
    public void open() {
        System.out.println("Пользователь открыл страницу " + LOGIN_PAGE);
    }
}
