package com.mrk.first_spring_boot_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;

@RestController
public class Routes {

    @Autowired
    ServiceImp serviceImp;

    @PostMapping("/")
    public  void addBook(@RequestBody BookModel bookModel){
        serviceImp.addBook(bookModel);
    }

    @GetMapping("/findAll")
    public HashSet<BookModel> getAllBook(){
        return serviceImp.findAllBook();
    }

    @GetMapping("/findById/{id}")
    public BookModel getBookById(@PathVariable long id){
        return serviceImp.findBookFindId(id);
    }

    @DeleteMapping("/delete")
    public void deleteBookData(){
        serviceImp.deleteAllData();
    }


}
