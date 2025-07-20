package lox;

class Token {
	final TokenType type;
	final String lexeme;
	final Object literal;
	final int line; 
	// TODO: add more reporting info for errors (e.g. column)
	// see p.44; store offset from file start -> lexeme, then calc. line & col.
	
	Token(TokenType type, String lexeme, Object literal, int line) {
		this.type = type;
		this.lexeme = lexeme;
		this.literal = literal;
		this.line = line;
	}

	public String toString() {
		return type + " " + lexeme + " " + literal;
	}
}
