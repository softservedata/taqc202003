package com.softserve.edu.data;

public enum ItemsToSelect {
    MACBOOK("MacBook"),
    IPHONE("iPhone 3"),
    APPLE("Apple Cinema 30\""),
    CANON("Canon EOS 5D");

    private String itemName;

    @Override
    public String toString() {
        return "ItemsToSelect{" +
                "itemName='" + itemName + '\'' +
                '}';
    }

    private ItemsToSelect(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }
}
