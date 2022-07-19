package features.fileupload;

import base.BaseTests;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileUploadTests extends BaseTests {

    private final String fileName = "Screen Shot 2022-07-13 at 21.18.17.png";

    @Test
    void testFileUpload() {
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile(System.getProperty("user.dir") + "/src/test/resources/testdata/" + fileName);
        assertEquals(fileName, uploadPage.getUploadedFiles());
    }
}
