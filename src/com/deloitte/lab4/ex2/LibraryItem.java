package com.deloitte.lab4.ex2;

abstract class LibraryItem {
    private String itemId;
    private String itemTitle;
    private int copiesAvailable;

    public LibraryItem(String itemId, String itemTitle, int copiesAvailable) {
        this.itemId = itemId;
        this.itemTitle = itemTitle;
        this.copiesAvailable = copiesAvailable;
    }

    public String getItemId() {
        return itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void setCopiesAvailable(int copiesAvailable) {
        this.copiesAvailable = copiesAvailable;
    }

    public abstract void displayDetails();

    public void checkInItem() {
        System.out.println(itemTitle + " has been checked in.");
    }

    public void checkOutItem() {
        System.out.println(itemTitle + " has been checked out.");
    }

    @Override
    public String toString() {
        return "ID: " + itemId + ", Title: " + itemTitle + ", Copies: " + copiesAvailable;
    }
}
