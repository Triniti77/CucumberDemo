package pages;

import com.codeborne.selenide.SelenideElement;
import fragments.MainMenuFragment;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {
    private MainMenuFragment mainMenuFragment = new MainMenuFragment();

    private SelenideElement loginForm = $("form[name='frmLogin']");
    private SelenideElement newToursButton = $("");

    public HomePage() {

    }

    public MainMenuFragment getMainMenuFragment() {
        return mainMenuFragment;
    }

    public boolean isLoginFormPresent() {
        return loginForm.isDisplayed();
    }

    public void navigate() {
        open("/");
    }

    public void clickOnNewToursButton() {
        newToursButton.click();
    }
}
