package githubTwoLesson;

import Pages.GithubMainPage;
import Pages.SelenideRepository;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class LanguageVerification {
    GithubMainPage GithubMainPages = new GithubMainPage();
    SelenideRepository SelenideRepository = new SelenideRepository();

    @Test
    void verifyJavaLanguage() {
        GithubMainPages.openMainPage();
        SelenideRepository.FindSelenideRepository();
        $(".BorderGrid li:nth-of-type(1) > .d-inline-flex").shouldHave(text("Java 95.7%"));
        //int a =0;

    }
}
