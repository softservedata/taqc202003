package com.softserve.edu.hw12;

public enum ItemsToSelect {
    MACBOOK("MacBook"),
    IPHONE("iPhone 3"),
    APPLE("Apple Cinema 30\""),
    CANON("Canon EOS 5D");

    private String itemName;


    private ItemsToSelect(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }
}
