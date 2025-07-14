package controller;

import dto.BookRequest;
import dto.BookResponse;
import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.BookRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/dto-books")
public class BookDtoController {

    @Autowired
    private BookRepository repo;

    @PostMapping
    public BookResponse addBook(@RequestBody BookRequest req) {
        Book book = new Book(req.getTitle(), req.getAuthor());
        book = repo.save(book);
        return new BookResponse(book.getId(), book.getTitle(), book.getAuthor(), "Book created successfully");
    }

    @GetMapping
    public List<BookResponse> getBooks() {
        return repo.findAll().stream()
                .map(book -> new BookResponse(book.getId(), book.getTitle(), book.getAuthor(), "Success"))
                .collect(Collectors.toList());
    }
}
