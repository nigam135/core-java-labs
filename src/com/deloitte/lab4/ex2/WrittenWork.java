package com.deloitte.lab4.ex2;

abstract class WrittenWork extends LibraryItem {
	
    private String authorName;

    public WrittenWork(String itemId, String itemTitle, int copiesAvailable, String authorName) {
    	
        super(itemId, itemTitle, copiesAvailable);
        
        this.authorName = authorName;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    
    public void displayDetails() {
    	
        System.out.println("Author: " + authorName + ", " + super.toString());
    }
}
