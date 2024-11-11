package alert;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/danie/IdeaProjects/demos/seleniumUniversity/resources/descarga.jpg");
        assertEquals(uploadPage.getUploadedFiles(), "descarga.jpg", "Uploaded files incorrect");
    }
}
