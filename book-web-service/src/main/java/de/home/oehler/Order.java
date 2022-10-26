package de.home.oehler;

import java.util.ArrayList;

public class Order {

    private int orderId;
    private int bookId;
    private int amount;

    
    /*** Constructors ***/
    // Leerer Konstruktor ist notwendig für Writer(POJO to JSON)
    public Order() {
    }
    public Order(int bookId) {
        this.bookId = bookId;
        this.amount = 1;
    }
    public Order(int bookId, int amount) {
        this.bookId = bookId;
        this.amount = amount;
    }
    public Order(int orderId, int bookId, int amount) {
        this.orderId = orderId;
        this.bookId = bookId;
        this.amount = amount;
    }

    /*** Functions ***/

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderId +
                ", item=" + bookId +
                ", amount=" + amount +
                '}';
    }

    public Book getBook(int bookId) {
        return Books.getInstance().getBookById(bookId);
    }
    

    /*** GETTERS & SETTERS ***/
    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    /*** ***/

    
}
