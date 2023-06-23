import java.util.ArrayList;
import java.util.List;

public class People {
    private String name;
    private final Gender gender;
    private int age;
    private int height;

    private final List<People> children = new ArrayList<>();

    public People(String name, Gender gender, int age, int height) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
    }

    public void childBorn(People child) {
        this.children.add(child);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
