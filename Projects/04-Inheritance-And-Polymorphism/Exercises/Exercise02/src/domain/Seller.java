package domain;

public class Seller extends User {
    private int soldItemsAmount;
    // I would make it a boolean but since the exercise do not asks for implementation of this program
    // I will leave it as void.
    public void sell() {soldItemsAmount++;}
    public void inspectSells () {}
}
