package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Mouhsine Lahridi
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {
}
