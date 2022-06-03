package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Mouhsine Lahridi
 */
@Component
public class BootStrapData implements CommandLineRunner {

  private final AuthorRepository authorRepository;
  private final BookRepository bookRepository;

  public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
    this.authorRepository = authorRepository;
    this.bookRepository = bookRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    Author eric = new Author("Eric", "Evans");
    Book book = new Book("Domain Drive Design", "123123");

    eric.getBooks().add(book);
    book.getAuthors().add(eric);

    authorRepository.save(eric);
    bookRepository.save(book);

    Author rod = new Author("Rod", "Johnson");
    Book book2 = new Book("J2EE Development without EJB", "12135521");
    rod.getBooks().add(book2);
    book2.getAuthors().add(rod);

    authorRepository.save(rod);
    bookRepository.save(book2);

  }
}
