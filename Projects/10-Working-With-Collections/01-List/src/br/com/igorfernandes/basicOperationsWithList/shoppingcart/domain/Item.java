package br.com.igorfernandes.basicOperationsWithList.shoppingcart.domain;

import java.math.BigDecimal;

public class Item {
    private String name;
    private BigDecimal price;
    private int amount;

    public Item() {
    }

    public Item(String name, BigDecimal price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
