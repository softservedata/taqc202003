package com.softserve.edu.opencart.data;

public final class SearchItemReposotory {

	private SearchItemReposotory() {
	}

	public static SearchItem getDefault() {
		return searchMacBook();
	}

	public static SearchItem searchMacBook() {
		return new SearchItem("mac");
	}
}
