package com.anjuke.minzhao;
import com.anjuke.minzhao.Ihello;
import com.anjuke.minzhao.hello1;

interface Ihello {
	void HelloWorld();
}
class hello1 implements Ihello {
	public void HelloWorld() {
		System.out.println("Hello World!");
	}

	public void xx() {
		System.out.println("I'm good!");
	}
}

public class HelloWorld {
	public static void main(String args[]) {
		hello1 myfunction = new hello1();
		myfunction.HelloWorld();
	}
}
