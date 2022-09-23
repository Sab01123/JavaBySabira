package com.question_4;

import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {


		Consumer<String> c = s->System.out.println("city name is "+s);
		c.accept("delhi");
		c.accept("srinagar");
		c.accept("kashmir");
		c.accept("patna");
		c.accept("bihar");

	}

}
