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
}
