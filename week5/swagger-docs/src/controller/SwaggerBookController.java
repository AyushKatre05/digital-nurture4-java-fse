package controller;

import model.Book;
import repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/swagger-books")
public class SwaggerBookController {

    @Autowired
    private BookRepository repo;

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return repo.save(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
        Book existing = repo.findById(id).orElseThrow();
        existing.setTitle(book.getTitle());
        existing.setAuthor(book.getAuthor());
        return repo.save(existing);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
