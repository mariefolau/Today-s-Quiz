package com.example.FavouriteBooks.Service;

import com.example.FavouriteBooks.Entity.Book;
import com.example.FavouriteBooks.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public int addBook(Book book){ return bookRepository.insertBook(book);}

    public List<Book> findAllBooks(){ return bookRepository.getAllBooks();}

    public Book getBooksById(int id){ return bookRepository.SelectById(id); }

    public Book addDetail(Book detail) { return bookRepository.getDetail(detail); }
}
