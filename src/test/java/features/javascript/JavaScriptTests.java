package features.javascript;

import base.BaseTests;
import org.junit.jupiter.api.Test;

public class JavaScriptTests extends BaseTests {
    @Test
    void testScrollToTable() {
        var scrollingPage = homePage.clickLargeAndDeepDom();
        scrollingPage.scrollToTable();
    }

    @Test
    void testScrollToFifthParagraph() {
        var infiniteScrollPage = homePage.clickInfiniteScroll();
        infiniteScrollPage.scrollToParagraph(5);
        waitABit();
    }
}
