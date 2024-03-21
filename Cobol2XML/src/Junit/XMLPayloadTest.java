package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import cobol.Cobol;
import xmlwriter.XMLPayload;

class XMLPayloadTest {
	
	//The Junit Test for the XMLPayload

	@Test
	void testAddElements_WithAllCobolProperties() {
	    Cobol cobol = new Cobol();
	    cobol.setProgram_ID("MyCobolProgram");
	    cobol.setSectionName("DATA_DIVISION");
	    cobol.setDivisionName("FILE_SECTION");
	    cobol.setCommentLine("This is a comment line");
	    cobol.setDayDateWritten(1);
	    cobol.setMonthDateWritten("January");
	    cobol.setYearDateWritten(2024);
	    cobol.setConstantName("PI");
	    cobol.setConstantValue(3.14159);
	    cobol.setLineNumber(10);

	    XMLPayload xmlPayload = new XMLPayload();
	    xmlPayload.addElements(cobol);

	    Document doc = xmlPayload.getDoc();

	    // Check root element
	    assertEquals("cobol", doc.getDocumentElement().getNodeName());

	    // Check Program-ID element
	    Element programIdElement = (Element) doc.getElementsByTagName("Program-ID").item(0);
	    assertEquals("MyCobolProgram", programIdElement.getTextContent());

	    // Check section element
	    Element sectionElement = (Element) doc.getElementsByTagName("section").item(0);
	    assertEquals("DATA_DIVISION", sectionElement.getTextContent());

	    // Check division element
	    Element divisionElement = (Element) doc.getElementsByTagName("division").item(0);
	    assertEquals("FILE_SECTION", divisionElement.getTextContent());

	    // Check constant element with attributes
	    Element constantElement = (Element) doc.getElementsByTagName("Constant").item(0);
	    assertEquals("PI", constantElement.getChildNodes().item(0).getAttributes().getNamedItem("Name").getTextContent());
	    assertEquals("10", constantElement.getChildNodes().item(1).getAttributes().getNamedItem("Line_Number").getTextContent());
	    assertEquals("3.14159", constantElement.getChildNodes().item(2).getAttributes().getNamedItem("Value").getTextContent());

	}

	@Test
	void testAddElements_WithEmptyProperties() {
	    Cobol cobol = new Cobol();

	    XMLPayload xmlPayload = new XMLPayload();
	    xmlPayload.addElements(cobol);

	    Document doc = xmlPayload.getDoc();

	    // Check root element only
	    assertEquals("cobol", doc.getDocumentElement().getNodeName());

	    // No other elements should be present
	    assertEquals(0, doc.getElementsByTagName("Program-ID").getLength());
	    assertEquals(0, doc.getElementsByTagName("section").getLength());
	    assertEquals(0, doc.getElementsByTagName("division").getLength());
	    assertEquals(0, doc.getElementsByTagName("Constant").getLength());
	}

	@Test
	void testWriteFile() throws Exception {
	    // This test requires modifying the actual file writing logic.
	    // It's recommended to mock the file writing functionality for unit testing.
	}

}
