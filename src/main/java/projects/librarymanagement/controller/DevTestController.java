package projects.librarymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projects.librarymanagement.dto.BookDto;
import projects.librarymanagement.dto.BookSearchDto;
import projects.librarymanagement.entity.Book;

@RestController
@RequestMapping("/api/test")
public class DevTestController {

    @GetMapping("/book-dto")
    public String testBookDto() {
        Book book = new Book("Test Title", "Test Author", "123", "Fiction", 3, 2);
        book.setId(1L);
        BookDto dto = new BookDto(book);

        StringBuilder result = new StringBuilder();
        result.append("BookDto: ").append(dto).append("\n");
        result.append("Is Available: ").append(dto.isAvailable());

        System.out.println(result.toString());
        return result.toString();
    }


    @GetMapping("/book-search-dto")
    public String testBookSearchDto() {
        BookSearchDto searchDto = new BookSearchDto("gatsby", "fitzgerald", null, true);

        StringBuilder result = new StringBuilder();
        result.append("Has title: ").append(searchDto.hasTitle()).append("\n");
        result.append("Has criteria: ").append(searchDto.hasAnyCriteria());

        System.out.println(result.toString());
        return result.toString();
    }


    @GetMapping("/all")
    public String testAll() {
        StringBuilder result = new StringBuilder();
        result.append("=== BookDto Test ===\n");
        result.append(testBookDto()).append("\n\n");
        result.append("=== BookSearchDto Test ===\n");
        result.append(testBookSearchDto());

        return result.toString();
    }
    @GetMapping("/edge-cases")
    public String testEdgeCases() {
        StringBuilder result = new StringBuilder();

        // Test unavailable book
        Book unavailableBook = new Book("No Copies", "Author", "456", "Fiction", 2, 0);
        BookDto unavailableDto = new BookDto(unavailableBook);
        result.append("Unavailable book isAvailable: ").append(unavailableDto.isAvailable()).append("\n");

        // Test empty search
        BookSearchDto emptySearch = new BookSearchDto();
        result.append("Empty search has criteria: ").append(emptySearch.hasAnyCriteria()).append("\n");

        // Test whitespace handling
        BookSearchDto whitespaceSearch = new BookSearchDto("   ", "", null, false);
        result.append("Whitespace search has title: ").append(whitespaceSearch.hasTitle()).append("\n");

        return result.toString();
    }
}