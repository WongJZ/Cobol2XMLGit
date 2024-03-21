package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import parse.tokens.Token;

class TokenTest {
	
	//The Junit Test for the Token

	@Test
	void test() {
		char c = 'a';
		Token t = new Token(c); 
		assertFalse(t.isNumber()); 
		assertFalse(t.isWord()); 
		assertTrue(t.isSymbol());
	}

}
