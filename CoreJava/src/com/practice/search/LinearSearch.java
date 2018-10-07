package com.practice.search;

import java.util.List;
import java.util.stream.IntStream;

public class LinearSearch<T> implements SearchInterface<T>{

	@Override
	public int search(List<T> list, T value) {

		return IntStream.range(0, list.size()).filter(i->list.get(i).equals(value)).findFirst().orElse(-1);
		
	}
	
}
