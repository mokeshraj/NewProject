package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainStream {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Stream","Reflection","collection","Steucture");
		System.out.println("forEach:");
		names.stream().forEach(System.out::println);
		
		List<String> sNames = names.stream()
		.filter(name -> name.startsWith("S"))
		.collect(Collectors.toList());
		System.out.println("\ncollect (names starting with 'S'):");
		sNames.forEach(System.out::println);
		
		String concatenatedNames = names.stream().reduce("", (partialString,element) -> partialString + " "+element);
		System.out.println("\nreduce (concatenated names):");
		System.out.println(concatenatedNames.trim());
		
		long count = names.stream().count();
		System.out.println("\ncount:"+ count);
		
		Optional<String> firstName = names.stream().findFirst();
		System.out.println("\nfindFirst:");
		firstName.ifPresent(System.out::println);
	
		boolean allStartWithS = names.stream().anyMatch(name -> name.startsWith("S"));
		System.out.println("\nallMatch (all start with 's'):");
		System.out.println(allStartWithS);
		
		boolean anyStartWithS = names.stream().anyMatch(name -> name.startsWith("S"));
		System.out.println("\nanyMatch (any start with 'S'):");
		System.out.println(anyStartWithS);

		
	}

}
