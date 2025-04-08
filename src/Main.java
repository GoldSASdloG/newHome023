public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HumanTest vasy = new HumanTest(45, "Vasy", 174.2);
        HumanTest pety = new HumanTest(45, "Vasy", 174.2);

        System.out.println(pety == vasy);
        System.out.println(pety.equals(vasy));
    }
}