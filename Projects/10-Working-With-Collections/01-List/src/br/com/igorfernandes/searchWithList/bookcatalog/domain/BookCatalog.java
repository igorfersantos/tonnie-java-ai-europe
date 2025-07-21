package br.com.igorfernandes.searchWithList.bookcatalog.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookCatalog {
    private List<Book> catalog;

    public BookCatalog() {
        catalog = new ArrayList<>();
    }

    public boolean addBook(final String title, final String author, final int publishYear) {
        return catalog.add(new Book(title, author, publishYear));
    }

    public List<Book> searchByAuthor(final String author) {
        return catalog.stream().filter(book -> book.getAuthor().equals(author)).collect(Collectors.toList());
    }

    public List<Book> searchBetweenYears(int startDate, int endDate) {
        return catalog.stream()
                .filter(book -> book.getPublishYear() >= startDate && book.getPublishYear() <= endDate)
                .collect(Collectors.toList());
    }

    public Optional<Book> searchByTitle(String booksToFindWithTitle) {
        return catalog.stream()
                .filter(book -> book.getTitle().contains(booksToFindWithTitle))
                .findFirst();
    }
}
