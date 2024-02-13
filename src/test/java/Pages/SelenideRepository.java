package Pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class SelenideRepository {
    public void FindSelenideRepository(){
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("[href='/selenide/selenide'] > .Text-sc-17v1xeu-0").click();
        $("#repository-container-header").shouldHave(Condition.text("selenide / selenide"));

    }
}
