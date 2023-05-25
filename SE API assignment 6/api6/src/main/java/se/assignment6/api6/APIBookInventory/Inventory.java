package se.assignment6.api6.APIBookInventory;

import se.assignment6.api6.APIBookCatalog.Book;

public class Inventory {
    
    private String id;
    private String bookName;
    private int quantity;

    public Inventory(String id, String bookName, int quantity) {
        this.id = id;
        this.bookName = bookName;
        this.quantity = quantity;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    } 
    
}
