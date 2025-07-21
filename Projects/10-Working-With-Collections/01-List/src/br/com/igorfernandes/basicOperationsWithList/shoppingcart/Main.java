package br.com.igorfernandes.basicOperationsWithList.shoppingcart;

import br.com.igorfernandes.basicOperationsWithList.shoppingcart.domain.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem("Xbox Controller", 50, 2);
        shoppingCart.addItem("Coconut Soup", 2, 10);
        showCartInfo(shoppingCart);
        System.out.println("=====remove-and-show====");
        String itemNameToRemove = "Coconut Soup";
        System.out.printf("Removing item \"%s\"\n", itemNameToRemove);
        shoppingCart.removeItem(itemNameToRemove);
        showCartInfo(shoppingCart);
    }

    private static void showCartInfo(final ShoppingCart shoppingCart) {
        System.out.printf("Total price: %s\n", shoppingCart.calculateTotalPrice());
        System.out.println("Items:");
        shoppingCart.showItems();
    }
}
