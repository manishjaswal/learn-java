package com.practice.search;

import java.util.List;

public interface SearchInterface<T> {

	int search(List<T> list, T value);
}
