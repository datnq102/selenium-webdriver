package features.hovers;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HoverTests extends BaseTests {
    @Test
    void testHoverUser2() {
        var hoverPage = homePage.clickHovers();
        var caption = hoverPage.hoverOverFigure(2);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals("name: user2", caption.getTitle());
        assertEquals("View profile", caption.getLinkText());
        assertTrue(caption.getLink().endsWith("/users/2"));
        waitABit();
    }
}
