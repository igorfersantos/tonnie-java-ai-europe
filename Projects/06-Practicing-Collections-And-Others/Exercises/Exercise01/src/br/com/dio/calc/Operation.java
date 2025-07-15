package br.com.dio.calc;

import java.util.stream.LongStream;

public enum Operation {
    SUM(numbers -> LongStream.of(numbers).reduce(0, Long::sum)),
    SUBTRACTION(numbers -> LongStream.of(numbers).reduce(0, (n1, n2) -> n1 - n2));

    private Calc operationCallback;

    Operation(Calc operationCallback) {
        this.operationCallback = operationCallback;
    }

    public Calc getOperationCallback() {
        return operationCallback;
    }
}
