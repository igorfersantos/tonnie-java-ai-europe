package br.com.igorfernandes.searchWithList.bookcatalog;

import br.com.igorfernandes.searchWithList.bookcatalog.domain.Book;
import br.com.igorfernandes.searchWithList.bookcatalog.domain.BookCatalog;

public class Main {

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("Foundation", "Isaac Asimov", 1951);
        bookCatalog.addBook("Entendendo Algoritmos", "Bhargava", 2018);
        bookCatalog.addBook("Entendendo Algoritmos 2", "Bhargava", 2019);
        bookCatalog.addBook("Test-Driven Development", "Mauricio Aniche", 2018);
        System.out.printf("Books from \"Bhargava\": %s\n", bookCatalog.searchByAuthor("Bhargava"));
        System.out.printf("Books from \"\": %s\n", bookCatalog.searchByAuthor(""));
        int startDate = 2018, endDate = 2019;
        System.out.printf("Books between %s and %s: %s\n", startDate, endDate,
                bookCatalog.searchBetweenYears(startDate,endDate));
        String booksToFindWithTitle = "Entendendo Algoritmos";
        System.out.printf("First book with title \"%s\": %s\n",
                booksToFindWithTitle,
                bookCatalog.searchByTitle(booksToFindWithTitle).orElse(new Book()));
        System.out.printf("First book with title \"Ababa\": %s\n", bookCatalog.searchByTitle("Ababa").orElse(new Book()));
    }
}
