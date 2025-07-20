all:
	javac lox/*.java

lox:
	javac lox/*.java

clean:
	rm -rf lox/*.class

run:
	java lox/Lox
