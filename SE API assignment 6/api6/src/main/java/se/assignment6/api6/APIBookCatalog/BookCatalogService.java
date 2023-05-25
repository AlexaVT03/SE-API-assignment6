package se.assignment6.api6.APIBookCatalog;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookCatalogService {
    
    private List<Book> books = new ArrayList<>(Arrays.asList(
                    new Book("01", "Great Gatsby", "F. Scott Fitzgerald", "1925"),
                    new Book("02", "To Kill a Mockingbird", "Harper Lee", "1960"),
                    new Book("03", "Animal Farm", "George Orwell", "1949")));
   
    //GET ALL
    public List<Book> getAllBooks() {
        return books;
    }
    
    //POST
    public String createBook(Book book) {
        books.add(book);
        return "Book created successfully";
    }
    
    //GET specific
    public Book getBook(String id) {
        return books.stream().filter(b -> b.getId().equals(id)).findFirst().get();
    }

    //PUT
    public void updateBook (String id, Book book) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if (b.getId().equals(id)) {
                books.set(i, book);
                return;
            }
        }
    }

    //DELETE
    public void deleteBook (String id) {
        books.removeIf(b -> b.getId().equals(id));
    }
}
