package com.example.FavouriteBooks.Repository;

import com.example.FavouriteBooks.Entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeBookDatabase implements BookRepository {

    private static List<Book> BOOKDATA =new ArrayList<>();


    @Override
    public int insertBook(Book book) {
        BOOKDATA.add(new Book(book.getId(), book.getName(), book.getDetail()));
        return 1;
    }

    @Override
    public List<Book> getAllBooks() {
        return BOOKDATA;
    }

    @Override
    public Book selectById(int id) {
        return null;
    }


    @Override
    public Book SelectById(int id) {

        Book found = null;

        for(Book book : BOOKDATA){
            if(book.getId() == id){
                found = book;
            }
        }

        return found;
    }

    @Override
    public String getDetail() {
        return getDetail();
    }


    public Book getBookDetails(String details) {

       Book info = null;

        for(Book book : BOOKDATA) {

            if(book.getDetail() == details) {
                info = book;
            }
        }
        return info;
    }


}
