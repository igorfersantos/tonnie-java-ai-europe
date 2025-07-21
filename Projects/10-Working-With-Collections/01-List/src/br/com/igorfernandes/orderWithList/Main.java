package br.com.igorfernandes.orderWithList;

import br.com.igorfernandes.orderWithList.domain.NumbersOrder;

public class Main {
    public static void main(String[] args) {
        NumbersOrder numbersOrder = new NumbersOrder();

        numbersOrder.addNumber(9);
        numbersOrder.addNumber(5);
        numbersOrder.addNumber(10);
        numbersOrder.addNumber(2);
        numbersOrder.addNumber(11);
        numbersOrder.addNumber(-1);
        numbersOrder.orderByAsc();
        System.out.println(numbersOrder);
        numbersOrder.orderByDesc();
        System.out.println(numbersOrder);
    }
}
