package se.assignment6.api6.APIBookOrder;

import java.time.LocalDate;

public class Order {
    
    private String orderID;
    private String bookID;
    private int quantity;
    private LocalDate orderDate;

    public Order(String orderID, String bookID, int quantity, LocalDate orderDate) {
        this.orderID = orderID;
        this.bookID = bookID;
        this.quantity = quantity;
        this.orderDate = orderDate;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }



}
