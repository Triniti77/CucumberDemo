package pages;

import fragments.LoginFormFragment;

import static com.codeborne.selenide.Selenide.open;

public class AgileProjectPage extends BasePage {
    LoginFormFragment loginFormFragment = new LoginFormFragment();

    public AgileProjectPage() {

    }

    public void navigate() {
        open("/Agile_Project/Agi_V1/");
    }

    public void makeLogin(String username, String password) {
        loginFormFragment.makeLogin(username, password);
    }

    public void proceedLogin() {
        loginFormFragment.proceedLogin();
    }
}
