package com.practice.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.search.LinearSearch;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		System.out.println(new LinearSearch<String>().search(strings, "efg")); 
		
	}

}
