package controller;

import model.Book;
import repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@RestController
@RequestMapping("/api/hateoas-books")
public class HateoasBookController {

    @Autowired
    private BookRepository repo;

    @GetMapping
    public List<Book> getAll() {
        return repo.findAll().stream().map(book -> {
            book.add(linkTo(methodOn(HateoasBookController.class).getBook(book.getId())).withSelfRel());
            book.add(linkTo(methodOn(HateoasBookController.class).getAll()).withRel("all-books"));
            return book;
        }).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable Long id) {
        Book book = repo.findById(id).orElseThrow();
        book.add(linkTo(methodOn(HateoasBookController.class).getBook(id)).withSelfRel());
        book.add(linkTo(methodOn(HateoasBookController.class).getAll()).withRel("all-books"));
        return book;
    }

    @PostMapping
    public Book create(@RequestBody Book book) {
        Book saved = repo.save(book);
        saved.add(linkTo(methodOn(HateoasBookController.class).getBook(saved.getId())).withSelfRel());
        return saved;
    }
}
