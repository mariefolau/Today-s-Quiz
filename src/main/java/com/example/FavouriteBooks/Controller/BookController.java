package com.example.FavouriteBooks.Controller;

import com.example.FavouriteBooks.Entity.Book;
import com.example.FavouriteBooks.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/book")
@RestController
public class BookController {

    @Autowired
    BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public void addNewBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @PostMapping
    public void addDetails(@RequestBody Book detail){ bookService.addDetail(detail);
    }

    @GetMapping
    public List<Book> returnAllBooks(){
        return BookService.findAllBooks();
    }

    @GetMapping(path = "{id}")
    public Book getPupilByID(@PathVariable("id") int id){
        return BookService.getBooksByID(id);
    }
    
    
    
    
    
    
    
    
    
    
}
