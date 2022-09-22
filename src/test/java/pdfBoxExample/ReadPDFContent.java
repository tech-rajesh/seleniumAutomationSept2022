package pdfBoxExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ReadPDFContent {
	
	
	@Test
	public void verifyPDFData() throws Exception {
		
		
		//FileInputStream fis = new FileInputStream("C:\\Users\\Act\\OneDrive\\Desktop\\Playwright_Course_Overview.pdf");
		FileInputStream fis = new FileInputStream("D:\\Training\\Course\\APITesting_POSTMAN_Training_CourseOutline_3Days.pdf");
		
		PDDocument pdfDocument = PDDocument.load(fis);
		
		int pdfPageCount = pdfDocument.getPages().getCount();
		
		System.out.println("No. of pages: " + pdfPageCount);
		
		
		
		
		PDFTextStripper pdfText = new PDFTextStripper();
		
		String PDF_content_Text = pdfText.getText(pdfDocument);
		System.out.println(PDF_content_Text);
		
		
		//validation 
		Assert.assertTrue(PDF_content_Text.contains("Continuous Integration with JENKINS CI/CD"));			//pass
		
		pdfDocument.close();
		fis.close();
		
	}

}
