package br.com.igorfernandes.basicOperationsWithList.shoppingcart.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public boolean addItem(final String name, final long price, int amount) {
        return items.add(new Item(name, BigDecimal.valueOf(price), amount));
    }

    public boolean removeItem(String name) {
        List<Item> itemsToRemove = items.stream().filter(item -> item.getName().equals(name)).toList();
        return items.removeAll(itemsToRemove);
    }

    public BigDecimal calculateTotalPrice() {
        return items.stream()
                .map(item -> item.getPrice().multiply(BigDecimal.valueOf(item.getAmount())))
                .reduce(BigDecimal.ZERO, (p1, p2) -> p1.add(p2));
    }

    public void showItems() {
        System.out.println(items);
    }
}
