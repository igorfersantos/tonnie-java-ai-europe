package domain;

import dao.GenericDAO;

import java.util.Objects;

public final class UserDomain implements GenericDomain<Integer> {
    private int id;
    private String name;
    private int age;

    public UserDomain() {
    }

    public UserDomain(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof UserDomain that)) return false;
        return id == that.id && age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }

    @Override
    public String toString() {
        return "UserDomain{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
