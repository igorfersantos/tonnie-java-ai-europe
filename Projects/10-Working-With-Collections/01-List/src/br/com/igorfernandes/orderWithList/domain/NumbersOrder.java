package br.com.igorfernandes.orderWithList.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersOrder {
    List<Integer> numbersList;

    public NumbersOrder() {
        numbersList = new ArrayList<>();
    }

    public void addNumber(int number) {
        numbersList.add(number);
    }

    public void orderByAsc() {
        numbersList = numbersList.stream().sorted().collect(Collectors.toList());
    }

    public void orderByDesc() {
        numbersList = numbersList.stream().sorted().toList().reversed();
    }

    @Override
    public String toString() {
        return "NumbersOrder{" +
                "numbersList=" + numbersList +
                '}';
    }
}
