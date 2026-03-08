package NguyenLeTrongPhuc.JavaBook.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data               // Tự tạo getter, setter, toString...
public class Book {
    private Long id;
    private String name;
    private  Double price;
    private  String description;

    public Book(Long id, String name, Double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public Book(){

    }
}
