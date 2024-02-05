package Java08Oops.Java05EqualHashNode;

import java.util.Objects;

public class JavaEqualHash {
    private String name;
    private int age;
    private int id;

    public JavaEqualHash(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Java05EqualHashNode{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", id=").append(id);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
