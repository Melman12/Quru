package githubTwoLesson;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class lessTwo {
    @Test
    void shouldFindSelenideRepositoryAtTheTop(){
        open ("https://github.com/");
        $("[data-target='qbsearch-input.inputButtonText']").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("[href='/selenide/selenide'] > .Text-sc-17v1xeu-0").click();
        $("#repository-container-header").shouldHave(Condition.text("selenide / selenide"));



    }
}
