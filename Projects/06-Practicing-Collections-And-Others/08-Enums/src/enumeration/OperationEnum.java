package enumeration;

import java.util.function.BiFunction;

public enum OperationEnum {
    SUM(Integer::sum, "➕"),
    SUBTRACTION((v1, v2) -> v1 - v2, "➖"),
    MULTIPLY((v1, v2) -> v1 * v2, "✖️"),
    DIVISION((v1, v2) -> v1 / v2, "➗");

    private BiFunction<Integer, Integer, Integer> calculate;
    private String symbol;

    OperationEnum(BiFunction<Integer, Integer, Integer> calculate, String symbol) {
        this.calculate = calculate;
        this.symbol = symbol;
    }

    public BiFunction<Integer, Integer, Integer> getCalculate() {
        return calculate;
    }

    public String getSymbol() {
        return symbol;
    }
}
