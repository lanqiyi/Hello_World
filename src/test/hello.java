package test;
import test.I_hello;
import test.hello1;

interface I_hello {
	void HelloWorld();
}

class hello1 implements I_hello {
	public void HelloWorld() {
		System.out.println("Hello World!");
	}

	public void xx() {
		System.out.println("I'm good!");
	}
}

public class hello {
	public static void main(String args[]) {
		hello1 myfunction = new hello1();
		myfunction.HelloWorld();
	}
}
