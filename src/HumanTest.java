import java.util.Objects;

public class HumanTest {
    private int age;
    private String name;
    private double rost;

    public HumanTest(int age, String name, double rost) {
        this.age = age;
        this.name = name;
        this.rost = rost;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRost() {
        return rost;
    }

    public void setRost(double rost) {
        this.rost = rost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HumanTest humanTest = (HumanTest) o;
        return age == humanTest.age && Double.compare(rost, humanTest.rost) == 0 && Objects.equals(name, humanTest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, rost);
    }
}
