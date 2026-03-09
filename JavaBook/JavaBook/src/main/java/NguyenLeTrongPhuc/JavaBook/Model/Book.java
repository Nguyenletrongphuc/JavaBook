package NguyenLeTrongPhuc.JavaBook.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data               // Tự tạo getter, setter, toString...
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private  Double price;
    private  String description;

    public Book(String name, Double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Book(){

    }
}
