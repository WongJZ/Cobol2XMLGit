package Junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ NumTest.class, ParserTest.class, SymbolTest.class, TokenTest.class , CobolTest.class})
public class AllTests {
	
	//The Overall Junit Test with NumTest, ParserTest, SymbolTest, TokenTest, CobolTest

}
