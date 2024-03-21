package Junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ NumTest.class, ParserTest.class, SymbolTest.class, TokenTest.class })
public class AllTests {

}
