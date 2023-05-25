package se.assignment6.api6.APIBookCatalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog")
public class BookCatalogController {

    @Autowired
    private BookCatalogService bookCatalogService;
    
    //GET all books
    @RequestMapping("/books")
    public List<Book> getAllBooks() {
        return bookCatalogService.getAllBooks();   
    }
    
    //GET a topic
    // put string id in place of {id}
    @RequestMapping("/books/{id}")
    public Book getBook(@PathVariable String id) {
        return bookCatalogService.getBook(id);
    }
    
    //POST
    @RequestMapping(method=RequestMethod.POST, value="/books")
    public void addBook(@RequestBody Book book) {
        bookCatalogService.createBook(book);
    }

    //UPDATE
    @RequestMapping(method=RequestMethod.PUT, value="/books/{id}")
    public void updateBook(@RequestBody Book books, @PathVariable String id) {
        bookCatalogService.updateBook(id, books);
    }

    //DELETE
    @RequestMapping(method=RequestMethod.DELETE, value="/books/{id}")
    public void deleteBook(@PathVariable String id) {
        bookCatalogService.deleteBook(id);
    }

}
