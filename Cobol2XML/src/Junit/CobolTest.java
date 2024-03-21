package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cobol.Cobol;

class CobolTest {
	
	//The Junit Test for the Cobol

	@Test
	void testSetterAndGetters() {
		Cobol cobol = new Cobol();
		
		// Test setters
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
	    
	    // Test getters
	    assertEquals("MyCobolProgram", cobol.getProgram_ID());
	    assertEquals("DATA_DIVISION", cobol.getSectionName());
	    assertEquals("FILE_SECTION", cobol.getDivisionName());
	    assertEquals("This is a comment line", cobol.getCommentLine());
	    assertEquals(1, cobol.getDayDateWritten());
	    assertEquals("January", cobol.getMonthDateWritten());
	    assertEquals(2024, cobol.getYearDateWritten());
	    assertEquals("PI", cobol.getConstantName());
	    assertEquals(3.14159, cobol.getConstantValue());
	    assertEquals(10, cobol.getLineNumber());
	}
	
	@Test
	void testToString() {
	    Cobol cobol = new Cobol();
	    cobol.setProgram_ID("MyCobolProgram");
	    cobol.setDivisionName("IDENTIFICATION");
	    cobol.setSectionName("");

	    String expectedString = "MyCobolProgram, IDENTIFICATION, ";
	    assertEquals(expectedString, cobol.toString());
	}

}
