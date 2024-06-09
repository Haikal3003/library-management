package com.fikry.libraryweb.controller;

import com.fikry.libraryweb.entity.Book;
import com.fikry.libraryweb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    @RequestMapping(value="/save", method=RequestMethod.GET)
    @ResponseBody
    public String save(@RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("isbn") String isbn){
        Book book = new Book(title, author, isbn);
        bookService.saveBook(book);
        return "Successfully save books";
    }

    @RequestMapping(value="/store", method=RequestMethod.POST)
    @ResponseBody
    public String store(@RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("isbn") String isbn){
        Book book = new Book(title, author, isbn);
        bookService.saveBook(book);
        return "Successfully save books";
    }
}