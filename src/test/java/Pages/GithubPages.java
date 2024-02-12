package Pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubPages {
    public void FindSelenideRepository(){
        open ("https://github.com/");
        $("[data-target='qbsearch-input.inputButtonText']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("[href='/selenide/selenide'] > .Text-sc-17v1xeu-0").click();
        $("#repository-container-header").shouldHave(Condition.text("selenide / selenide"));



    }
}
