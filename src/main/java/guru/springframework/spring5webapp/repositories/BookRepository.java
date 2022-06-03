package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mouhsine Lahridi
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
