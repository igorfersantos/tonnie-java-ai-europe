import domain.BodyCream;
import domain.Book;
import domain.TShirt;
import domain.Taxable;
import domain.Strawberry;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Taxable strawberry = new Strawberry(BigDecimal.TEN);
        Taxable bodyCream = new BodyCream(BigDecimal.valueOf(6));
        Taxable shirt = new TShirt(BigDecimal.valueOf(30));
        Taxable book = new Book(BigDecimal.valueOf(15));

        System.out.println("Strawberry price after taxes: " + strawberry.calculateTaxes());
        System.out.println("Body Cream price after taxes: " + bodyCream.calculateTaxes());
        System.out.println("Shirt price after taxes: " + shirt.calculateTaxes());
        System.out.println("Book price after taxes: " + book.calculateTaxes());
    }
}