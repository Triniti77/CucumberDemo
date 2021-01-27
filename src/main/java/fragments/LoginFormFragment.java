package fragments;

import com.codeborne.selenide.SelenideElement;
import sun.rmi.runtime.Log;

import static com.codeborne.selenide.Selenide.$;

public class LoginFormFragment {
    SelenideElement loginInput = $("input[name='uid']");
    SelenideElement passwordInput = $("input[name='password']");
    SelenideElement loginButton = $("input[name='btnLogin']");

    public LoginFormFragment() {

    }

    public void makeLogin(String login, String password) {
        loginInput.val(login);
        passwordInput.val(password);
    }

    public void proceedLogin() {
        loginButton.click();
    }
}
