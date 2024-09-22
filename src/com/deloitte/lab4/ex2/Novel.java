package com.deloitte.lab4.ex2;


class Novel extends WrittenWork {
	
    public Novel(String itemId, String itemTitle, int copiesAvailable, String authorName) {
    	
        super(itemId, itemTitle, copiesAvailable, authorName);
    }

    @Override
    public String toString() {
        return "Novel: " + super.toString();
    }
}
