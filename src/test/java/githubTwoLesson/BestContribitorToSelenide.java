package githubTwoLesson;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class BestContribitorToSelenide {
    @Test
    void solntsdevShouldBeTheTop(){
        open("https://github.com/selenide/selenide");
        $$(".mb-2.mr-2").first().hover();
        $$(".Popover .Popover-message").findBy(Condition.visible).shouldHave(Condition.text("Andrei Solntsev"));

    }
}
