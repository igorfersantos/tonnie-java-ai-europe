package domain;

import java.util.Objects;

public interface GenericDomain<ID> {
    ID getId();

    void setId(ID id);


}
