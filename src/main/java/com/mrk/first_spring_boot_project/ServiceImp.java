package com.mrk.first_spring_boot_project;

import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class ServiceImp implements BookServiceInterface {
    HashSet<BookModel>bookList=new HashSet<>();

    @Override
    public HashSet<BookModel> findAllBook() {
        if (bookList.isEmpty())
            return null;
            else
        return bookList;
    }

    @Override
    public BookModel findBookFindId(long id) {
        BookModel bookModel=bookList.stream().filter(b -> b.getId()==id).findAny().orElse(null);

        return bookModel;
    }

    @Override
    public void addBook(BookModel b) {
        bookList.add(b);
    }

    @Override
    public void deleteAllData() {
        bookList.clear();
    }
}
