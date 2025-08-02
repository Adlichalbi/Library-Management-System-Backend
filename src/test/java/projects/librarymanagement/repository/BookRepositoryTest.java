package projects.librarymanagement.repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import projects.librarymanagement.entity.Book;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class BookRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BookRepository bookRepository;

    @Test
    void findByTitleContainingIgnoreCase_ShouldReturnMatchingBooks() {
        // Given
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123", "Fiction", 3, 3);
        Book book2 = new Book("Great Expectations", "Charles Dickens", "456", "Fiction", 2, 2);
        Book book3 = new Book("1984", "George Orwell", "789", "Dystopian", 1, 1);

        entityManager.persist(book1);
        entityManager.persist(book2);
        entityManager.persist(book3);
        entityManager.flush();

        // When
        List<Book> results = bookRepository.findByTitleContainingIgnoreCase("great");

        // Then
        assertThat(results).hasSize(2);
        assertThat(results).extracting(Book::getTitle)
                .containsExactlyInAnyOrder("The Great Gatsby", "Great Expectations");
    }

    @Test
    void findByAvailableCopiesGreaterThan_ShouldReturnAvailableBooks() {
        // Given
        Book availableBook = new Book("Available Book", "Author1", "111", "Fiction", 5, 3);
        Book unavailableBook = new Book("Unavailable Book", "Author2", "222", "Fiction", 2, 0);

        entityManager.persist(availableBook);
        entityManager.persist(unavailableBook);
        entityManager.flush();

        // When
        List<Book> results = bookRepository.findByAvailableCopiesGreaterThan(0);

        // Then
        assertThat(results).hasSize(1);
        assertThat(results.get(0).getTitle()).isEqualTo("Available Book");
    }
}