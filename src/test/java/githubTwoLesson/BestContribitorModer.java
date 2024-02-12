package githubTwoLesson;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class BestContribitorModer {
    @Test
    void modernization(){
        open("https://github.com/selenide/selenide");
        $$(".mb-2.mr-2>a[data-hovercard-type ='user']").shouldHave(size(12)).get(1).hover();
        $$(".Popover .Popover-message").findBy(Condition.visible).shouldHave(Condition.text("Alexei Vinogradov"));

    }
}
