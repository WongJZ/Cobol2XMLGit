package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import parse.tokens.Symbol;
import java.util.ArrayList;

class SymbolTest {

	@Test
	void test() {
		char c = 'a';
		Symbol symbol = new Symbol(c);
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList = symbol.randomExpansion(2,1);
		assertFalse( arrayList.isEmpty() );
	}

}
