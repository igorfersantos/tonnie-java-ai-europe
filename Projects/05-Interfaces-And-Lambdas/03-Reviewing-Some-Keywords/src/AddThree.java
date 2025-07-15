// Example from https://jenkov.com/tutorials/java-functional-programming/functional-interfaces.html

import java.util.function.Function;

public class AddThree implements Function<Long,Long> {
    @Override
    public Long apply(Long aLong) {
        return aLong + 3;
    }
}
