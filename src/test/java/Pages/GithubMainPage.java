package Pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubMainPage {
    public void openMainPage(){
        open ("https://github.com/");
        $("[data-target='qbsearch-input.inputButtonText']").click();
    }
}
