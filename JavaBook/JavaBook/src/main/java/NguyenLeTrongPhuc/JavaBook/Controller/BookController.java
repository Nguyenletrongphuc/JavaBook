package NguyenLeTrongPhuc.JavaBook.Controller;

import NguyenLeTrongPhuc.JavaBook.Model.Book;
import NguyenLeTrongPhuc.JavaBook.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/books")
//http://localhost:8080/api/v1/books
public class BookController {
    @Autowired
    private BookRepository repository;
    @GetMapping("")
    List<Book> getAllProducts(){
        return repository.findAll();
    }
    @GetMapping("/{id}")
    Book findByID(@PathVariable Long id){
        return repository.findById(id)
                .orElseThrow(()->new RuntimeException("Khong tim thay san pham voi id : "+id));
    }
    @PostMapping("/insert")
    Book insertBook(@RequestBody Book newBook){
        List<Book> foundBook = repository.findBookByName(newBook.getName().trim());
        if(!foundBook.isEmpty()){
            throw new RuntimeException("Sach '" + newBook.getName() + "'da ton tai trong database!");
        }
        return repository.save(newBook);
    }



}
