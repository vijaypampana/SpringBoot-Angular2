package com.learning.restservice.Controllers.api;

import com.learning.restservice.model.BookModel;
import com.learning.restservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    //Instantiate the Repository
    @Autowired
    private BookRepository bookRepository;

    //POST and PUT operations
    @RequestMapping(value = "/addbook", method = {RequestMethod.POST, RequestMethod.PUT})
    public String saveBook(@RequestBody BookModel book) {
        bookRepository.save(book);
        return "Added book with id : " + book.getId();
    }

    @RequestMapping(value = "/findAllBooks", method = RequestMethod.GET)
    public List<BookModel> getBooks() {
        return (List<BookModel>) bookRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Optional<BookModel> getBook(@PathVariable String id) {
        return bookRepository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable String id) {
        bookRepository.deleteById(id);
    }

}
