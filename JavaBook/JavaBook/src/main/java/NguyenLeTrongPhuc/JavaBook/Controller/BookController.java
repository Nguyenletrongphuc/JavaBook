package NguyenLeTrongPhuc.JavaBook.Controller;

import NguyenLeTrongPhuc.JavaBook.Model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/books")
//http://localhost:8080/api/v1/books
public class BookController {
    @GetMapping("")
    List<Book> getAllProducts(){
        return List.of(
                new Book(1L, "Book1", 19000.0, "new"),
                new Book(2L, "Book2", 39000.0, "new")
        );
    }
}
