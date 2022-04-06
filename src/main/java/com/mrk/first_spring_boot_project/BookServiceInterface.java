package com.mrk.first_spring_boot_project;

import java.awt.print.Book;
import java.util.HashSet;

public interface BookServiceInterface {
    HashSet<BookModel>findAllBook();
    BookModel findBookFindId(long id);
    void addBook(BookModel b);
    void deleteAllData();
}
