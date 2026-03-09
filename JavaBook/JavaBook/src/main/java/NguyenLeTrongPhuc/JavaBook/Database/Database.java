package NguyenLeTrongPhuc.JavaBook.Database;

import NguyenLeTrongPhuc.JavaBook.Model.Book;
import NguyenLeTrongPhuc.JavaBook.Repositories.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Database {
    private static final Logger logger = LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(BookRepository bookRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Book bookA = new Book( "Book1", 19000.0, "old");
                Book bookB = new Book( "Book2", 29000.0, "new");
                Book bookC = new Book( "Book3", 30000.0, "new");
                logger.info(("insert data:"+bookRepository.save(bookA)));
                logger.info(("insert data:"+bookRepository.save(bookB)));
                logger.info(("insert data:"+bookRepository.save(bookC)));
            }
        };
    }
}
