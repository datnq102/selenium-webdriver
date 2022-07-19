package features.dropdown;

import base.BaseTests;
import org.junit.jupiter.api.Test;
import pages.DropdownPage;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DropdownTests extends BaseTests {

    private final String OPTION = "Option 2";

    @Test
    void testSelectOption() {
        DropdownPage dropdownPage = homePage.clickDropdown();
        dropdownPage.selectFromDropdown(OPTION);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(1, selectedOptions.size());
        assertEquals(Arrays.asList(OPTION), selectedOptions);
    }
}
