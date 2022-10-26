package de.home.oehler;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;


@Singleton
public class Books {

    private static Books books = null;
    private List<Book> bookList = new ArrayList<Book>();
 
    private Books() {
        bookList.add(new Book(0, "Book of Fire", "Max Maus"));
        bookList.add(new Book(1, "Book of Wind", "Peter Mueller"));
        bookList.add(new Book(2, "Book of Water", "Maria Morales"));
        bookList.add(new Book(3, "Book of Earth", "Simone Namos"));
        bookList.add(new Book(4, "Book of Books", "Alfredo Adlero"));

        for (Book b : bookList) {
            b.setLink("http://localhost:8080/rest/books/"+b.getId());
        }
	}

    public static Books getInstance() {
        if (books == null)
            books = new Books();
        
        return books;
    }

	public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
    
    public Book getBookById(int id) {
        return bookList.get(id);
    }
}