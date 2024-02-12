package githubTwoLesson;

import Pages.GithubPages;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckJava {
    GithubPages GithubPages = new GithubPages();
    @Test
    void CheckJava() {
        GithubPages.FindSelenideRepository();
        $(".BorderGrid li:nth-of-type(1) > .d-inline-flex").scrollIntoView(true);
        $(".BorderGrid li:nth-of-type(1) > .d-inline-flex").shouldHave(text("Java 95.7%"));
        //int a =0;

}
}
