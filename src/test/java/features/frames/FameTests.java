package features.frames;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FameTests extends BaseTests {
    @Test
    void testWysiwyg() {
        String text = "Hello World!";
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();
        editorPage.setTextArea(text);
        editorPage.increaseIndentation();
        assertEquals(text, editorPage.getTextFromEditor());
    }
}
