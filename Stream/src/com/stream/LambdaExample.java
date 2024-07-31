package com.stream;

import java.util.Arrays;
import java.util.List;



public class LambdaExample {

	public static void main(String args[]) {
		List<String> li=Arrays.asList("karur","chennai","coimbatore","trichy");
//		li.forEach(s -> System.out.println(s));
//		li.forEach(System.out::println);
		li.stream()
		.filter(s ->s.startsWith("t"))
		.forEach((s) -> System.out.println(s));
	}
}
