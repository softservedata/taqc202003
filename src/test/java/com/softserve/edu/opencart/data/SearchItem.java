package com.softserve.edu.opencart.data;

public class SearchItem {

	private String searchText;
	// TODO

	public SearchItem(String searchText) {
		this.searchText = searchText;
	}

	public String getSearchText() {
		return searchText;
	}

	@Override
	public String toString() {
		return "SearchItem [searchText=" + searchText + "]";
	}

}
